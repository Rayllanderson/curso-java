package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

public class Program3 {
    private static Scanner scan = new Scanner(System.in);
    
    public static void main (String [] args) {
	
	List <Funcionario> list = new ArrayList<>();
	System.out.print("Quantos funcionarios quer cadastrar? ");
	int n = scan.nextInt();
	for (int i = 0; i < n; i++) {
	    System.out.println("Funcionário #" + (i+1));
	    System.out.print("Este funcionário é tercerizado? (s/n): ");
	    char resp = scan.next().charAt(0);
	    scan.nextLine();
	    setFuncionario(list, resp);
	}
	
	imprimirPagamento(list);

	scan.close();
    }
    
    public static void setFuncionario(List <Funcionario> list, char tercerizado) {
	System.out.print("Nome: ");
	String nome = scan.nextLine();
	System.out.print("Horas: ");
	int hours = scan.nextInt();
	System.out.print("Valor por hora: ");
	double valuePerHour = scan.nextDouble();
	if (tercerizado == 'n') {
	    list.add(new Funcionario(nome, hours, valuePerHour));
	}else {
	    System.out.print("Dispesa Adicional: ");
	    double additionalCharge = scan.nextDouble();
	    list.add(new FuncionarioTercerizado(nome, hours, valuePerHour, additionalCharge));
	}
	
	
    }
    

    public static void imprimirPagamento(List <Funcionario> list) {
	
	for (Funcionario f : list) {
	    double payment = 0.0;
	    payment += f.payment();
	    System.out.println(f.getName() + " - R$" + payment);
	}
	
    }
}
