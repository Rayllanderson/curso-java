package exer01;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	Funcion�rio um = new Funcion�rio("Joao", 6000.00);
	
	System.out.println(um.toString());
	System.out.print("Digite uma porcetagem pra aumentar: ");
	um.incrementarPorcetagem(scan.nextDouble());
	um.updateData();
	System.out.println(um);
	
	
	scan.close();

    }

}
