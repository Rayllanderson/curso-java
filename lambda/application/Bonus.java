package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Produtc;
import model.services.PoductService;

public class Bonus {

    public static void main(String[] args) {
	
	List<Produtc> list = new ArrayList<>();

	list.add(new Produtc("Ryzen 5 3600", 1499.99));
	list.add(new Produtc("Ryzen 5 2600", 799.99));
	list.add(new Produtc("Ryzen 3 1600", 699.99));
	list.add(new Produtc("Intel core i9-9900KF", 4369.90));
	list.add(new Produtc("Rx 570", 442.99));
	list.add(new Produtc("Ryzen 5 2600", 799.99));
	list.add(new Produtc("AB-320MK", 575.99));
	list.add(new Produtc("RAM 4gb", 2*147.99));
	
	PoductService ps = new PoductService();
	
	double sum = ps.filteredSum(list, p -> p.getNome().charAt(0) == 'A');
	list.forEach(System.out::println);
	
	System.out.println(sum);

    }

}
