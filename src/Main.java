import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner (System.in);
	double x = 10.343543;
	System.out.printf("%.2f\n", x);
	System.out.printf("%.4f\n", x);
	System.out.printf("O RESULTADO FOI DE %.2f METROS \n", x);
	String nome = "Maria";
	int idade = 32;
	double salario = 917.3343;
	System.out.printf("%s tem %d anos e ganha R$ %.2f por mês\n", nome, idade, salario);
	System.out.println("Olá, testando fodase");
	scan.close();
	
    }

}
