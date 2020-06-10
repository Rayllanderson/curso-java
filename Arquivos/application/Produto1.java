package application;

public class Produto1 {
    
    private String nome;
    private Double preco;
    private int qtd;
    
    public Produto1(String nome, Double preco, int qtd) {
	super();
	this.nome = nome;
	this.preco = preco;
	this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }
    
    public double valorTotal() {
	return qtd * preco;
    }
    

}
