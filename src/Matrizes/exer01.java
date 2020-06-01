package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class exer01 {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	System.out.print("Número de linhas ");
	int l = scan.nextInt();
	System.out.print("Número de colunas ");
	int c = scan.nextInt();

	int[][] matriz = new int[l][c];
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		matriz[i][j] = scan.nextInt();
	    }
	}
	procurarMatriz(8, matriz);
	scan.close();

    }

    public static void procurarMatriz(int n, int[][] matriz) {
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		int right, left, up, down;
		left = j - 1; 
		right = j + 1;
		up = i - 1;
		down = i + 1;
		if (matriz[i][j] == n) {
		    System.out.printf("Position %d, %d: \n", i, j);
		    if (left > 0 ) {
			System.out.print("Left: " + matriz[i][left]);
		    }
		    if (j < matriz[i].length-1) {
			System.out.print("Right: " + matriz[i][right]);
		    }
		    if (up > 0) {
			System.out.print("Up: " + matriz[up][j]);
		    }
		    if (i < matriz.length-1) {
			System.out.print("Down: " + matriz[down][j]);
		    }
		}
		System.out.println();
	    }

	}
    }

}
