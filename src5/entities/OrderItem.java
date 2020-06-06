package entities;

public class OrderItem {
    
    private Product product;
    private Integer quantity;
    
    public OrderItem() {
    }

    public OrderItem(String nome, Integer quantity, double prince) {
	product = new Product();
	this.quantity = quantity;
	this.product.setPrince(prince);
	this.product.setNome(nome);
    }

    public Integer getQuantity() {
        return quantity;
    }
    

    public Product getProduct() {
	return product;
    }
    
    public double subTotal() {
	return quantity * product.getPrince();
    }
    
    

}
