package exer06;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Qual preço do Dólar atual: ");
	double valorDolar = scan.nextDouble();
	System.out.print("Quantos dólares você vai comprar? ");
	double qtdDolar = scan.nextDouble();
	double valorReal =CurrencyConverter.converterDolar(valorDolar, qtdDolar);
	System.out.printf("Com IOF de 6%%, você comprará %.2f reais", valorReal);

	scan.close();
    }

}
