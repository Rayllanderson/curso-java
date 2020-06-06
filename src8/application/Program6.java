package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program6 {

    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	List <Pessoa> list = new ArrayList<>();
	
	System.out.print("Número de contribuintes: ");
	int n = scan.nextInt();
	
	for (int i = 1; i <= n; i++) {
	    System.out.println("Pessoa #" + i);
	    System.out.print("Pessoa Física ou pessoa Juridica? (f/j): ");
	    char ch = scan.next().charAt(0);
	    System.out.print("Nome: ");
	    scan.nextLine();
	    String nome = scan.nextLine();
	    System.out.print("Renda Anual: R$");
	    double rendaAnual = scan.nextDouble();
	    if (ch == 'f') {
		System.out.print("Gastos com saúde (se não houver, deixe 0): ");
		double gastoSaude = scan.nextDouble();
		list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
	    }else {
		System.out.print("Número de funcionários: ");
		int num = scan.nextInt();
		list.add(new PessoaJuridica(nome, rendaAnual, num));
	    }
	}
	System.out.println();
	
	System.out.println("Impostos pagos: ");
	for (Pessoa p : list) {
	    System.out.print(p.toString());
	}
	
	System.out.println();
	
	System.out.println("Gasto total");
	double sum = 0;
	for (Pessoa p : list) {  
	    sum +=p.calcularImposto();
	}
	System.out.println(sum);
	
	
	scan.close();
    }

}
