package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	List<Funcionario> funcionario = new ArrayList<Funcionario>();

	System.out.print("Quantos funcionários serão cadastrados? ");
	int n = scan.nextInt();
	
	for (int i = 0; i < n; i++) {
	    System.out.println("ID: ");
	    int id = scan.nextInt();
	    while (verificarID(funcionario, id)) {
		System.out.println("Id já existe, tente novamente");
		System.out.println("ID: ");
		scan.nextInt();
	    }
	    System.out.println("Nome: ");
	    scan.nextLine();
	    String nome = scan.nextLine();
	    System.out.println("Salario: ");
	    double salario = scan.nextDouble();
	    funcionario.add(new Funcionario(id, nome, salario));
	}
	scan.close();
	
    }

    public static boolean verificarID(List <Funcionario> list, int id) {
	Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	return funcionario != null;
    }

}
