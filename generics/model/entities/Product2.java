package model.entities;

public class Product2 implements Comparable<Product2>{
    
    private String name;
    private Double prince;
    
    public Product2(String name, Double prince) {
	this.name = name;
	this.prince = prince;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrince() {
        return prince;
    }
    public void setPrince(Double prince) {
        this.prince = prince;
    }

    @Override
    public String toString() {
	return name + ", R$" + String.format("%.2f",prince);
    }

    @Override
    public int compareTo(Product2 other) {
	// TODO Auto-generated method stub
	return this.prince.compareTo(other.getPrince());
    }
    
    

}
