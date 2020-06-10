package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Veiculo;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program20 {

    public static void main(String[] args) throws ParseException{
	
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner (System.in);
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm");
	
	System.out.println("Entre com os dados do aluguel");
	System.out.print("Modelo do carro: ");
	String carModel = scan.nextLine();
	System.out.print("Data que retirou o carro (dd/MM/yyyy hh:mm): ");
	Date start = sdf.parse(scan.nextLine());
	System.out.print("Data que retornou o carro (dd/MM/yyyy hh:mm): ");
	Date finish = sdf.parse(scan.nextLine());
	
	CarRental cr = new CarRental(start, finish, new Veiculo(carModel));
	
	System.out.print("Entre com o preço por hora: R$");
	double princePerHour = scan.nextDouble();
	System.out.print("Entre com o preço por dia: R$");
	double princePerDay = scan.nextDouble();
	
	RentalService rentalService = new RentalService(princePerDay, princePerHour, new BrazilTaxService());
	
	rentalService.processInvoice(cr);
	
	System.out.println("Nota físcal");
	System.out.println("Basic Payment: " + String.format("%.2f", cr.getNota().getBasicPayment()));
	System.out.println("Tax: " + String.format("%.2f", cr.getNota().getTax()));
	System.out.println("Total Payment: " + String.format("%.2f", cr.getNota().getTotalPayment()));
	
	

    }

}
