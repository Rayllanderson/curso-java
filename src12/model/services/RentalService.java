package model.services;

import model.entities.CarRental;
import model.entities.NotaFiscal;

public class RentalService {
    
    private Double princePerDay;
    private Double princePerHour;
    
    private BrazilTaxService taxService;

    public RentalService(Double princePerDay, Double princePerHour, BrazilTaxService taxService) {
	this.princePerDay = princePerDay;
	this.princePerHour = princePerHour;
	this.taxService = taxService;
    }
    
    public void processInvoice (CarRental carRental) {
 	long t1 = carRental.getStart().getTime();
 	long t2 = carRental.getFinish().getTime();
 	double hours = (double) (t2 - t1) / 1000 / 60 / 60;
 	 double basicPayment;
 	if (hours <=12.00) {
 	   basicPayment = Math.ceil(hours) * princePerHour;
 	}else {
 	    basicPayment = Math.ceil(hours/24) * princePerDay;
 	}
 	double tax = taxService.tax(basicPayment);
 	
 	carRental.setNota(new NotaFiscal(basicPayment, tax));
    }

}
