package model.services;

import java.security.InvalidParameterException;

public interface Emprestimo {
    
    double getTaxaJuros();
    
    default double pagamento(double quantia, int mes) {
	if (mes <= 0) {
	    throw new InvalidParameterException("opa... o mês precisa ser maior que zero");
	}
	return quantia * Math.pow((1 + getTaxaJuros()/100), mes);
    }

}
