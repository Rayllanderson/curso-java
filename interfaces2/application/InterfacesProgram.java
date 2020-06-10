package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.teste.*;


public class InterfacesProgram {

    public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Calcular área do triângulo");
	System.out.println("Escolha a cor pra ele xD");
	System.out.println("[ 1 ] - Black\n[ 2 ] - White");
	double base = 0, altura = 0;
	try { 
	int escolha = scan.nextInt();
	System.out.print("Base: ");
	base = scan.nextDouble();
	System.out.print("Altura: ");
	altura = scan.nextDouble();
	
	String cor = null;
	
	if (escolha == 1) {
	    cor = "BLACK";
	}else if (escolha == 2) {
	    cor = "WHITE";
	}

	AbstractShape t1 = new Triangulo1(Color.valueOf(cor), base, altura);
	cor = cor.substring(0,1).concat(cor.substring(1).toLowerCase());
	System.out.println("Cor do triângulo: " + cor);
	System.out.println("Área do triangulo: " + t1.area() );
	
	}catch (NullPointerException e ) {
	    AbstractShape t1 = new Triangulo1(Color.BLACK, base, altura);
	    System.out.println("Ops, parace que você não escolheu uma cor válida");
	    System.out.println("Mas vamos te dar a base mesmo assim!");
	    System.out.println("Área do triangulo: " + t1.area() );
	}catch (InputMismatchException e) {
	   System.out.println("Eita! Tem certeza que digitou um número ou um número válido?");
	
	}finally {
	    scan.close();
	}
    }


}
