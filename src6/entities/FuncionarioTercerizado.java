package entities;

public class FuncionarioTercerizado extends Funcionario{

    private Double additionalCharge;

    public FuncionarioTercerizado() {
  	super();
      }
    
    public FuncionarioTercerizado(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
	super(name, hours, valuePerHour);
	this.additionalCharge = additionalCharge;
    }
    
    @Override
    public double payment() {
	
        return super.payment() + this.additionalCharge * 10/100 + this.additionalCharge;
    }
    
}
