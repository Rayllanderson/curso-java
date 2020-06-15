package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import model.entities.Produtc;
import model.util.PrinceUpdate;

public class ConsumerT {

    public static void main(String[] args) {
	
	//método void, sem retorno
	
	Scanner scan = new Scanner(System.in);
	
	List<Produtc> list = new ArrayList<>();

	list.add(new Produtc("Ryzen 5 3600", 1499.99));
	list.add(new Produtc("Ryzen 5 2600", 799.99));
	list.add(new Produtc("Ryzen 3 1600", 699.99));
	list.add(new Produtc("Intel core i9-9900KF", 4369.90));
	list.add(new Produtc("Intel core i7", 900.00));
	
	System.out.print("Quantos % de desconto? ");
	double desconto = scan.nextDouble();
	scan.close();
	
	// 1 metodo, metodo normal
	/*for (Produtc p : list) {
	    p.setPrince(p.getPrince() * 1.1); 
	}
	//2 metodo
	list.forEach(new PrinceUpdate());
	
	//3 método
	list.forEach(Produtc::staticProductUpdate);
	
	//4 método
	list.forEach(Produtc::nonStaticProductUpdate);
	
	//5 método
	double factor = 1.1;
	
	Consumer<Produtc> consumer = p -> {
	    p.setPrince(p.getPrince() * factor);
	};
	list.forEach(consumer);*/
	
	//6 método
	System.out.println("Valor com " + desconto + "% de desconto: ");
	list.forEach(p -> p.setPrince(p.getPrince() - (p.getPrince() * (desconto/100))));

	list.forEach(System.out::println);

    }

}
