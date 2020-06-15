package model.entities;

public class Produtc {// implements Comparable<Produtc>{

    private String nome;
    private Double price;

    public Produtc(String nome, Double price) {
	this.nome = nome;
	this.price = price;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Double getPrince() {
	return price;
    }

    public void setPrince(Double price) {
	this.price = price;
    }

    public boolean nonStaticProductPredicate() {
	return getPrince() < 300;
    }

    public static boolean staticProductPredicate(Produtc p) {
	return p.getPrince() < 300;
    }
    
    public static void staticProductUpdate(Produtc p) {
	p.setPrince(p.getPrince() * 1.1);
    }
    public void nonStaticProductUpdate() {
 	price *= 1.1;
     }
    
    public static String staticUpperCaseNome(Produtc p) {
	return p.getNome().toUpperCase();
    }
    
    public String nonStaticUpperCaseNome() {
 	return nome.toUpperCase();
     }
    
    @Override
    public String toString() {
	return nome + ", R$" + String.format("%.2f", price);
    }

    /*
     * @Override public int compareTo(Produtc other) { return
     * nome.compareToIgnoreCase(other.getNome()); }
     */

}
