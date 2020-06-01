package exer01;

public class Funcionário {
    private String nome;
    private double salarioBruto;
    private double imposto;
    
    public Funcionário(String nome, double salarioBruto) {
	super();
	this.nome = nome;
	this.salarioBruto = salarioBruto;
	this.imposto = 1000.00;
    }
    
    public String getNome() {
	return this.nome;
    }
    
    public Funcionário() {}


    public double salarioLiquido() {
	return this.salarioBruto - imposto;
    }
    
    public void incrementarPorcetagem(double porcetagem) {
	 porcetagem = (porcetagem / 100) * this.salarioBruto;
	 this.salarioBruto += porcetagem;
    }
    
    public void updateData() {
	System.out.println("Updated data: " + this.nome + ", R$ " + this.salarioLiquido());
    }
    
    @Override
    public String toString() {
	return "Funcionário: " + nome + ", salarioBruto: R$ " + this.salarioLiquido();
    }
    
    
    
}
