package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.entities.Product2;
import model.services.CalculationService;


public class CalculationProgram {

    public static void main(String[] args) {
	String path = "C:\\Users\\Anna Lucia\\eclipse-workspace\\Arquivos-Java\\in1.txt";
	List <Product2> list = new ArrayList<>();
	List <Double> princes = new ArrayList<>();
	
	try (BufferedReader br = new BufferedReader(new FileReader(path))){
	    
	    String products = br.readLine();
	    while (products != null) {
		String[] dados = products.split(",");
		list.add(new Product2(dados[0], Double.parseDouble(dados[1])));
		products = br.readLine();
	    }
	    
	    for (Product2 p : list) {
		princes.add(p.getPrince());
	    }

	    for (Product2 p : list) {
		System.out.println(p.getName() + ", R$" + p.getPrince() );
		
	    }
	    System.out.println();
	   //String nomeMax =  CalculationService.maxValue(list).getName();
	   //double princeMax =  CalculationService.maxValue(list).getPrince();
	  System.out.println("Produto com maior valor: " + CalculationService.maxValue(list));
	    
	    
	    
	}catch (FileNotFoundException e) {
	    e.printStackTrace();
	}catch (IOException e) {
	    e.printStackTrace();
	}

    }

}
