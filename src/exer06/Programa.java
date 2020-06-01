package exer06;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Qual pre�o do D�lar atual: ");
	double valorDolar = scan.nextDouble();
	System.out.print("Quantos d�lares voc� vai comprar? ");
	double qtdDolar = scan.nextDouble();
	double valorReal =CurrencyConverter.converterDolar(valorDolar, qtdDolar);
	System.out.printf("Com IOF de 6%%, voc� comprar� %.2f reais", valorReal);

	scan.close();
    }

}
