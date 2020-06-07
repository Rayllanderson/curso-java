package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program14 {
    
    public static void main(String[] args) {
	
	String [] lines = new String [] {"Good morning", "Good afternoon", "Good night"};
	
	String caminhoArquivo = "C:\\Users\\Anna Lucia\\eclipse-workspace\\Arquivos-Java\\out.txt";
	
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo, true))){
	    for (String line : lines) {
		bw.write(line);
		bw.newLine();
	    }
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
