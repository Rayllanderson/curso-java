package entities;

public class PessoaJuridica extends Pessoa{
   
    private Integer numeroFuncionarios;

    
    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
	super(nome, rendaAnual);
	this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }


    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }


    @Override
    public double calcularImposto() {
	double imposto = 0.0;
	if (this.numeroFuncionarios > 10) {
	    imposto += rendaAnual * 14/100;
	}else
	    imposto += rendaAnual *16/100;
	
	return imposto;
    }
    
    
    
    
    
}
