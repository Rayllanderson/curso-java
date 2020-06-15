package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.entities.Produtc;

public class StreamExer {

    public static void main(String[] args) {
	
	List <Produtc> list = new ArrayList<>();
	
	String path = "C:\\Users\\Anna Lucia\\eclipse-workspace\\Arquivos-Java\\Stream.txt";
	
	try (BufferedReader br = new BufferedReader(new FileReader (path))){
	    
	    String itensCsv = br.readLine();
	    
	    while(itensCsv != null) {
		String [] dados = itensCsv.split(",");
		list.add(new Produtc(dados[0], Double.parseDouble(dados[1])));
		itensCsv = br.readLine();
	    }
	    
	   // list.forEach(System.out::println);
	    
	    Comparator <String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
	    
	    double avg = list.stream()
		    .map(p ->p.getPrince())
		    .reduce(0.0, (p1, p2) -> p1 + p2) / list.size();
	    
	   System.out.println("AVG: " + String.format("%.2f", avg));
	   
	   List<String> names = list.stream()
		   .filter(p -> p.getPrince() <avg)
		   .map(p -> p.getNome())
		   .sorted(comp.reversed())
		   .collect(Collectors.toList());
	   
	   names.forEach(System.out::println);
	    
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

}
