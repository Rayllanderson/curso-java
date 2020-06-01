package AluguelQuarto;

import java.util.Locale;
import java.util.Scanner;

public class AluguelQuarto {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	Aluno[] rent = new Aluno[10];
	System.out.println("Quantos quartos serão alugados? ");
	int n = scan.nextInt();

	
	for (int i = 0; i < n; i++) {
	    scan.nextLine();
	    System.out.print("Aluguel " + (i + 1) + " \n");
	    System.out.println("Nome: ");
	    String nome = scan.nextLine();
	    System.out.printf("Qual quarto %s vai alugar? ", nome);
	    int quarto = scan.nextInt();
	    rent[quarto] = new Aluno(nome);
	}

	System.out.println();
	System.out.println("Busy rooms:");
	for (int i = 0; i < 10; i++) {
	    if (rent[i] != null) {
		System.out.println(i + ": " + rent[i].getNome());
	    }
	}
	scan.close();
    }

}
