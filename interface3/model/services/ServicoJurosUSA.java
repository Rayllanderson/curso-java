package model.services;


public class ServicoJurosUSA implements Emprestimo{
    
    private Double taxaJuros;

    public ServicoJurosUSA(Double taxaJuros) {
	this.taxaJuros = taxaJuros;
    }

    @Override
    public double getTaxaJuros() {
        return taxaJuros;
    }

}
