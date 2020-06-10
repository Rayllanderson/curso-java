package entities;

public class PessoaFisica extends Pessoa{

    private Double gastoSaude;
    

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
	super(nome, rendaAnual);
	this.gastoSaude = gastoSaude;
    }


    public Double getGastoSaude() {
        return gastoSaude;
    }



    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }


    @Override
    public double calcularImposto() {
	double imposto = 0.0;
	if (rendaAnual < 20000.00) {
	    imposto += rendaAnual * 15/100;
	}else {
	    imposto += rendaAnual * 25/100;
	}
	if (this.gastoSaude > 0) {
	    imposto -= gastoSaude * 50/100;
	}
	return imposto;
    }

}
