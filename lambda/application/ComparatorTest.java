package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Produtc;

public class ComparatorTest {

    public static void main(String[] args) {

	//serve pra comparação
	
	Scanner scan = new Scanner(System.in);

	List<Produtc> list = new ArrayList<>();

	list.add(new Produtc("Ryzen 5 3600", 1499.99));
	list.add(new Produtc("Ryzen 5 2600", 799.99));
	list.add(new Produtc("Ryzen 3 1600", 699.99));
	list.add(new Produtc("Intel core i9-9900KF", 4369.90));
	list.add(new Produtc("Rx 570", 442.99));
	list.add(new Produtc("Ryzen 5 2600", 799.99));
	list.add(new Produtc("AB-320MK", 575.99));
	list.add(new Produtc("RAM 4gb", 2*147.99));

	System.out.println("[1] - Ordernar por Nome");
	System.out.println("[2] - Ordernar por Preço");
	int op = scan.nextInt();
	//Comparator<Produtc> p0 = (p1, p2) -> -p1.getNome().compareToIgnoreCase(p2.getNome());
	if (op == 1) {
	    System.out.println("[1] - Ordem Crescente");
	    System.out.println("[2] - Ordem Decrescente");
	    int op2 = scan.nextInt();
	    if (op2 == 2) {
		list.sort((p1, p2) -> -p1.getNome().compareToIgnoreCase(p2.getNome()));
	    } else
		list.sort((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));
	} else if (op == 2) {
	    System.out.println("[1] - Menor Preço");
	    System.out.println("[2] - Maior Preço");
	    int op2 = scan.nextInt();
	    if (op2 == 1) {
		list.sort((p1, p2) -> p1.getPrince().compareTo(p2.getPrince()));
	    } else
		list.sort((p1, p2) -> -p1.getPrince().compareTo(p2.getPrince()));
	} else
	    System.out.println("Opção inválida. Ordenando por ordem que foi adicionado.");
	
	list.forEach(System.out::println);

	// Collections.sort(list);
	// list.forEach(System.out::println);
	// list.sort(new MyComparator());

	// muito grande, com lambda fica do proximo jeito, saca so
	/*
	 * Comparator<Produtc> comparator = new Comparator<Produtc>() {
	 * 
	 * @Override public int compare(Produtc p1, Produtc p2) { return
	 * p1.getNome().compareToIgnoreCase(p2.getNome()); } };
	 */

	// Comparator <Produtc> comparator = (p1, p2) ->
	// p1.getNome().compareToIgnoreCase(p2.getNome());

	// list.sort((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));
	
	scan.close();
    }

}
