package exer06;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    
    public static double converterDolar (double valorDolar, double qtdDolar) {
	return valorDolar * qtdDolar * (1.0 + IOF);
    }

}
