package vetor;

import java.util.Locale;
import java.util.Scanner;

public class AvgPeople {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	double [] alturas;
	
	System.out.print("Quantas alturas voc� quer somar? ");
	int altura = scan.nextInt();
	
	alturas = new double [altura];
	for (int i = 0; i<alturas.length; i++) {
	    System.out.println("Altura " + (i + 1)+ ": ");
	    alturas[i] = scan.nextDouble();
	}
	double avg = calcularAvg(alturas);
	
	System.out.printf("M�dia das %d alturas inseridas: %.2f", alturas.length, avg);
	
	scan.close();

    }
    
    private static double calcularAvg(double [] vetor) {
	double avg = 0;
	for (int i = 0; i < vetor.length; i++) {
	    avg += vetor[i];
	}
	return avg / vetor.length;
    }
    

    
}
