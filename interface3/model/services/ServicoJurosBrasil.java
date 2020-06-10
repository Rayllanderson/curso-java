package model.services;

public class ServicoJurosBrasil implements Emprestimo{
    
    private Double taxaJuros;

    public ServicoJurosBrasil(Double taxaJuros) {
	this.taxaJuros = taxaJuros;
    }

    @Override
    public double getTaxaJuros() {
        return taxaJuros;
    }

}
