package curso_java;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	Triangulo x = new Triangulo();
	Triangulo y = new Triangulo();
	
	System.out.println("Entre com as medidas do tri�ngulo X: ");
	x.setA(scan.nextDouble());
	x.setB(scan.nextDouble());
	x.setC(scan.nextDouble());
	System.out.println("Entre com as medidas do tri�ngulo Y: ");
	y.setA(scan.nextDouble());
	y.setB(scan.nextDouble());
	y.setC(scan.nextDouble());
	
	if (x.area() > y.area()) {
	    System.out.println("Area do Tri�ngulo X � maior");
	}else
	    System.out.println("Area do Tri�ngulo Y � maior");
	
	scan.close();
    }

}
