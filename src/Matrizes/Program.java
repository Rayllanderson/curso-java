package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	System.out.print("Tamain da matriz: ");
	int n = scan.nextInt();
	System.out.printf("OK, matriz acoplada com %d linhas e %d colunas\n", n, n);
	System.out.println();
	int[][] matriz = new int[n][n];

	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		System.out.println("Preenchendo a linha " + (i + 1) + " ");
		System.out.println("Preenchendo a coluna " + (j + 1) + " ");
		System.out.println("Digite o valor: ");
		matriz[i][j] = scan.nextInt();
	    }
	    System.out.println();
	}
	// 00, 12, 23
	System.out.println("Imprimindo diagonal... ");
	for (int i = 0; i<matriz.length; i++) {
	    System.out.print(matriz[i][i] + " ");
	}
	System.out.println("\nImprindo quantos elementos negativos existem na matriz...");
	int contador = 0;
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		if (matriz[i][j] < 0) {
		    contador++;
		}
	    }
	}
	System.out.println("Existem " + contador + " elementos negativos na matriz");

	scan.close();

    }

}
