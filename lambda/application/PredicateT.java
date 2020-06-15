package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.entities.Produtc;
import model.util.ProductPredicate;


public class PredicateT {

    public static void main(String[] args) {
	
	//boolean. é como se fosse um if, uma situação. p -> p.getPrince < 3; 
	
	List<Produtc> list = new ArrayList<>();

	list.add(new Produtc("Rx 570", 442.99));
	list.add(new Produtc("Ryzen 5 2600", 799.99));
	list.add(new Produtc("AB-320MK", 575.99));
	list.add(new Produtc("RAM 4gb", 2*147.99));
	
	list.removeIf(new ProductPredicate());
	list.removeIf(Produtc::staticProductPredicate);
	list.removeIf(Produtc::nonStaticProductPredicate);
	
	double  minValue = 300;
	
	Predicate<Produtc> pred = p -> p.getPrince() < minValue;
	
	list.removeIf(pred);
	list.removeIf(p -> p.getPrince() < minValue);

	
	list.forEach(System.out::println);
    }

}
