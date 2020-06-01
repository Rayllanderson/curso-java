package Lista;

public class Funcionario {
    private Integer id;
    private String nome;
    private double salario;
    
    public Funcionario(int id, String nome, double salario) {
	super();
	this.id = id;
	this.nome = nome;
	this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    
    
    

}
