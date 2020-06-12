package application;

import java.util.Scanner;

import model.services.PrintService;

public class GenericAplication {

    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	PrintService <String>p = new PrintService<>();
	
	System.out.print("Quantos números: ");
	int n = scan.nextInt();
	
	for (int i = 0; i<n; i++) {
	    System.out.print("Numero " + (i+1) + ": ");
	    p.addValue(scan.next());
	}
	p.print();
	System.out.println("\nFist: " + p.first());
	
	scan.close();
    }

}
