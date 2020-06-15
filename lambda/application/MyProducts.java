package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Produtc;

public class MyProducts {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	double []placaVideo = new double [3];
	//valor 
	placaVideo[0] = 522.47;
	//frete
	placaVideo[1] = 52.92;
	//desconto
	placaVideo[2] = 16.00;
	
	double []processador = new double [3];
	//valor 
	processador[0] = 535.00;
	//frete
	processador[1] = 0.0;
	//cooler
	processador[2] = 80.00;	

	List<Produtc> list = new ArrayList<>();
	list.sort((p1, p2) -> -p1.getPrince().compareTo(p2.getPrince()));
	list.add(new Produtc("Ryzen 5 2600", processador[2] + processador[1]+ processador[0]));
	list.add(new Produtc("Rx 580", placaVideo[0]+ placaVideo[1]- placaVideo[2]));
	list.add(new Produtc("AB450M-HD", 613.00));
	list.add(new Produtc("2x RAM 8gb", 2 * 147.99));
	list.add(new Produtc("SSD 240GB", 135.00));
	list.add(new Produtc("HD 1TB", 235.00));

	System.out.println("[1] - Ordernar por Nome");
	System.out.println("[2] - Ordernar por Preço");
	int op = scan.nextInt();

	if (op == 1) {
	    System.out.println("[1] - Ordem Crescente");
	    System.out.println("[2] - Ordem Decrescente");
	    int op1 = scan.nextInt();
	    if (op1 == 1) {
		list.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
	    }else
		list.sort((p1, p2) -> - p1.getNome().compareTo(p2.getNome()));
	}else if (op == 2){
	    System.out.println("[1] - Menor Preço");
	    System.out.println("[2] - Maior Preço");
	    int op1 = scan.nextInt();
	    if (op1 == 1) {
		list.sort((p1, p2) -> p1.getPrince().compareTo(p2.getPrince()));
	    }else
		list.sort((p1, p2) -> - p1.getPrince().compareTo(p2.getPrince())); 
	}
	scan.close();
	
	list.forEach(System.out::println);
	
	double sum = 0;
	for (Produtc p : list) {
	    sum +=p.getPrince();
	}
	System.out.println();
	System.out.println("Valor total: R$" + sum);
    }

}
