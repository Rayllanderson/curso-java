package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Prestacoes;

public class ContratService {

    private OnlinePayment payment;
   
    public ContratService(OnlinePayment payment) {
	this.payment = payment;
    }

    public void calcular(Contract contrato, int months) {
	double media = contrato.getTotalValue() / months;
	for (int i = 1; i <= months; i++) {
	    Date data = addMonths(contrato.getDate(), i);
	    double interest = media + payment.interest(media, i);
	    double totalValue = interest + payment.paymentFee(interest);
	    contrato.addPrestacoes(new Prestacoes(data, totalValue));
	}
    }

    private Date addMonths(Date date, int n) {
	Calendar cal = Calendar.getInstance();
	cal.setTime(date);
	cal.add(Calendar.MONTH, n);
	return cal.getTime();
    }

}
