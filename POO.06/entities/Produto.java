package entities;

public class Produto {
    
    private String name;
    private Double prince;
    
    public Produto() {

    }
    public Produto(String name, Double prince) {
 	super();
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
	StringBuilder s = new StringBuilder();
	s.append(name + " R$" + this.prince);
	return s.toString();
    }
    
    
    
    
    

}
