package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;

public class Program2 {

    public static void main(String[] args) throws ParseException {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	SimpleDateFormat maskBirth = new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.println(" *** Entre com os dados do cliente *** ");
	System.out.print("Nome: ");
	String nome = scan.nextLine();
	System.out.print("Data de nascimento (DD/MM/YYYY): ");
	Date birthDate = maskBirth.parse(scan.next());
	Client cliente = new Client(nome, birthDate);

	System.out.println(" *** Entre com os dados da compra *** ");
	System.out.print("Qual status atual do pedido: ");
	scan.nextLine();
	String statusPedido = scan.nextLine();
	Order order = new Order(cliente, new Date(), OrderStatus.valueOf(statusPedido));
	
	System.out.print("Quantos serão os pedidos para esta compra? ");
	int n = scan.nextInt();
	for (int i = 0; i < n; i++) {
	    scan.nextLine();
	    System.out.println("PEDIDO #"+ (i+1));
	    System.out.println("Nome do produto: ");
	    String nomePoduto = scan.nextLine();
	    System.out.println("Preço do produto: ");
	    double precoPoduto = scan.nextDouble();
	    System.out.println("Quantidade: ");
	    int qtd = scan.nextInt();
	    OrderItem pedido = new OrderItem(nomePoduto, qtd, precoPoduto);
	    order.addItem(pedido);
	}
	
	System.out.println(order);
	
	scan.close();
	
    }

}
