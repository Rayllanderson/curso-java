package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdfMoment = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdfBirth = new SimpleDateFormat ("dd/MM/yyyy");
    
    private Client client;
    private Date moment;
    private OrderStatus status;
    
    private List <OrderItem> pedido = new ArrayList<>();

    public Order(Client client, Date moment, OrderStatus status) {
	this.client = client;
	this.moment = moment;
	this.status = status;
    }
    
    //-------------------

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getPedido() {
        return pedido;
    }

    //------------------
    
    public void addItem(OrderItem item) {
	this.pedido.add(item);
    }
    
    public void removeItem(OrderItem item) {
	this.pedido.remove(item);
    }
    
    public double total() {
	double sum = 0;
	for(OrderItem o : pedido) {
	    sum += o.subTotal();
	}
	return sum;
    }

    @Override
    public String toString() {
	StringBuilder s = new StringBuilder();
	s.append("RESUMO DO PEDIDO: \n");
	s.append("Momento da compra: " + sdfMoment.format(moment));
	s.append("\nStatus do pedido: " + this.status.toString());
	s.append("\nNome do cliente: " + this.client.getName());
	s.append(" (" + sdfBirth.format(client.getBirthDate())+ ") - ");
	s.append(this.client.getEmail());
	s.append("\nItens pedidos: \n");
	for (OrderItem o : pedido ) {
	    s.append(o.getProduct().getNome() + ", ");
	    s.append("R$ " + o.getProduct().getPrince() + " ");
	    s.append("Quantidade: " + o.getQuantity() + " ");
	    s.append("SubTotal: R$" + o.subTotal() + "\n");
	}
	s.append("Total da soma de todos os produtos: " + this.total());
	return s.toString();
    }
    
    
    
    
    


}
