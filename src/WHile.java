import java.util.Scanner;

public class WHile {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double soma = 0, numeroDigitado;
	System.out.println("SOMAR NÚMEROS DIGITADOS ATÉ QUE SE PRESSIONE 0");
	System.out.println("Digite um numero: ");
	numeroDigitado = scan.nextDouble();
	soma += numeroDigitado;
	while (numeroDigitado != 0) {
	    System.out.println("Digite outro numero: ");
	    numeroDigitado = scan.nextDouble();
	    soma += numeroDigitado;
	}
	System.out.println("A soma total foi de " + (soma));
	scan.close();

    }

}
