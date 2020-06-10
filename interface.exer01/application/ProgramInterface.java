package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Prestacoes;
import model.services.ContratService;
import model.services.PayPalService;

public class ProgramInterface {
    
    public static void main(String[] args) throws ParseException {
	
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner (System.in);
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	Contract contrato;
	
	System.out.print("Número do contrato: ");
	int numContrato = scan.nextInt();
	System.out.println("Data (dd/mm/yyyy): ");
	Date data = sdf.parse(scan.next());
	System.out.println("Valor do contrato: R$");
	double value = scan.nextDouble();
	System.out.print("Dividido em quantas parcelas? ");
	int prestacoes = scan.nextInt();
	
	contrato = new Contract(numContrato, data, value);
	ContratService service = new ContratService(new PayPalService());
	service.calcular(contrato, prestacoes);
	
	System.out.println("Valores: ");

	    for (Prestacoes p : contrato.getList()) {
		System.out.println(p);
	    }
	scan.close();
    }

}
