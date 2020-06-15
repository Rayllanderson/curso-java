package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Funcionario0;

public class StreamExer2 {

    public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String path = "C:\\Users\\Anna Lucia\\eclipse-workspace\\Arquivos-Java\\Funcionarios.txt";
	
	List <Funcionario0> list = new ArrayList<>();
	
	try (BufferedReader br = new BufferedReader(new FileReader (path))){
	    
	    String itensCsv = br.readLine();
	    while (itensCsv != null) {
		String [] dados = itensCsv.split(",");
		list.add(new Funcionario0(dados[0], dados[1], Double.parseDouble(dados[2])));
		itensCsv = br.readLine();
	    }
	    
	    System.out.print("Consultar funcionarios com o salário maior que: R$");
	    double value = scan.nextDouble();

	    List <String> email = list.stream()
		    .filter(x -> x.getSalary() > value)
		    .map(x -> x.getEmail())
		    .sorted()
		    .collect(Collectors.toList());
	    
	    if (email.isEmpty()) {
		System.out.println("ops, parece que ninguém recebe mais que R$" + String.format("%.2f", value));
	    }else {
		System.out.println("Email das pessoas com o salário maior que R$" + String.format("%.2f", value) + ": ");
		    
		email.forEach(System.out::println);
	    }
	    
	    System.out.println();
	    
	    System.out.print("Digite uma letra: ");
	    char letra = scan.next().charAt(0);
	    
	    double sum = list.stream()
		    .filter( x -> x.getNome().charAt(0) == letra)
		    .map(x -> x.getSalary())
		    .reduce(0.0, (f1, f2) -> f1 + f2);
	    
	    if (sum == 0) {
		System.out.println("Não foram encontrados funcionários iniciando com a letra " + letra);
	    }else
		System.out.println("Soma dos salários de todas as pessoas que começam com a letra "+ letra +": " + String.format("%.2f", sum));
	     
	} 
	catch (IOException e) {
	    e.printStackTrace();
	}
	
	scan.close();
    }

}
