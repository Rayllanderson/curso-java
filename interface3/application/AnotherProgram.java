package application;

import java.security.InvalidParameterException;
import java.util.Scanner;

import model.services.Emprestimo;
import model.services.ServicoJurosBrasil;
import model.services.ServicoJurosUSA;

public class AnotherProgram {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	Emprestimo br = new ServicoJurosBrasil(2.0);
	Emprestimo usa = new ServicoJurosUSA(1.0);

	System.out.print("Emprestimo no valor de: R$");
	try {
	    double quantia = scan.nextDouble();
	    System.out.print("Será pago em quantos meses? ");
	    int months = scan.nextInt();

	    System.out.println("O valor a ser pago no Brasil após " + months + " meses: R$"
		    + String.format("%.2f", br.pagamento(quantia, months)));
	    System.out.println("O valor a ser pago nos Estados Unidos após " + months + " meses: R$"
		    + String.format("%.2f", usa.pagamento(quantia, months)));
	    
	}
	catch (InvalidParameterException e) {
	    System.out.println(e.getMessage());
	    
	}finally {
	    
	    scan.close();
	}

	
    }

}
