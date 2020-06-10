package model.entities;

public class Funcionario1 implements Comparable<Funcionario1>{
    
    private String nome;
    private Double salario;
    
    public Funcionario1(String nome, Double salario) {
	this.nome = nome;
	this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    @Override
    public int compareTo(Funcionario1 otherString) {
	return - this.salario.compareTo(otherString.getSalario()); // o - (menos) é pra imprimir de forma decrescente
    }
    
    
    
    

}
