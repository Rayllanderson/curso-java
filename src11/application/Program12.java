package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class Program12 {
    
    public static void main(String[] args) {
	
	File file = new File ("C:\\Users\\Anna Lucia\\eclipse-workspace\\Arquivos-Java\\in.txt");
	Scanner scan = null;
	try {
	    scan = new Scanner(file);
	    //hasNextLine é pra testar se ainda existe uma próxima linha no arquivo
	    while (scan.hasNextLine()) {
		System.out.println(scan.nextLine());
	    }  
	}
	catch (IOException e) {
	   System.out.println("Error: " + e.getMessage());
	}
	finally {
	    if (scan != null) {
		scan.close();
	    } 
	}
    }

}
