package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import model.entities.Candidatos;

public class MapExercicio {

    public static void main(String[] args) {
	String path = "C:\\Users\\Anna Lucia\\eclipse-workspace\\Arquivos-Java\\votacaoCsv.txt";
	
	try (BufferedReader br = new BufferedReader(new FileReader (path))){
	    
	    Map <Candidatos, Integer> map = new HashMap<>();
	    
	    String itensCsv = br.readLine();
	    while (itensCsv != null) {
		int sum = 0;
		String [] dados = itensCsv.split(",");
		Candidatos c = new Candidatos(dados[0]);
		sum = Integer.parseInt(dados[1]);
		if (map.containsKey(c)) {
		   sum += map.get(c);
		   
		}
		map.put(c, sum);
		itensCsv = br.readLine();
	    }
	    System.out.println("Quantidade Total de votos: ");
	    for (Candidatos c1 : map.keySet()) {
		System.out.println(c1 + ": " + map.get(c1));
	    }
	} catch (FileNotFoundException e) {
	   
	    e.printStackTrace();
	} catch (IOException e) {
	  
	    e.printStackTrace();
	}

    }

}
