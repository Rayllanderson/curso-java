package application;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.entities.*;
import model.exceptions.BalanceException;

public class Program11 {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println(" \tAbrindo uma conta ");
	System.out.print("Nome: ");
	try {
	    String nome = scan.nextLine();
	    System.out.print("Renda Mensal: R$");
	    double rendaMensal = scan.nextDouble();

	    Account ac = new Account(15989, nome, 0.0, rendaMensal);
	    System.out.print("Valor a depositar: R$");
	    double valor = scan.nextDouble();
	    ac.deposit(valor);
	    System.out.print("Valor a sacar: R$");
	    valor = scan.nextDouble();
	    ac.withdraw(valor);
	    
	    System.out.println();
	    
	    System.out.println(ac);

	} catch (BalanceException e) {
	    System.out.println("Desculpe, " + e.getMessage());
	    
	} catch (InputMismatchException e) {
	    System.out.println("Tente digitar um número válido.");
	    
	} catch (RuntimeException e) {
	    System.out.println("ops... ocorreu um erro inesperado :/");
	    
	} finally {
	    scan.close();
	    
	}

    }

}
