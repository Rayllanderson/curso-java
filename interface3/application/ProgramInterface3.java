package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Funcionario1;

public class ProgramInterface3 {

    public static void main(String[] args) {

	List<Funcionario1> list = new ArrayList<>();

	String path = "C:\\Users\\Anna Lucia\\eclipse-workspace\\Arquivos-Java\\ola.txt";
	
	try (BufferedReader br = new BufferedReader(new FileReader(path))) {

	    String itensCsv = br.readLine();
	    while (itensCsv != null) {
		String [] dados = itensCsv.split(",");
		list.add(new Funcionario1(dados[0], Double.parseDouble(dados[1])));
		itensCsv = br.readLine();
	    }
	    //System.out.println("maria".compareTo("alex"));
	    Collections.sort(list);
	    
	    for (Funcionario1 s : list) {
		System.out.println(s.getNome() + ", R$" + s.getSalario());
	    }

	} catch (FileNotFoundException e) {
	    System.out.println("opora, n achei esse arquivo não. verifica isso ai direito");
	    
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

}
