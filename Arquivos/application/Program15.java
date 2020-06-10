package application;

import java.io.File;
import java.util.Scanner;

public class Program15 {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.print("Entre com o caminho de uma pasta: ");
	String caminhoPasta = scan.nextLine();
	
	File path = new File(caminhoPasta);
	
	File [] folders = path.listFiles(File::isDirectory);
	
	System.out.println("PASTAS: ");
	for (File f : folders) {
	    System.out.println(f);
	}
	
	File []files = path.listFiles(File ::isFile);
	
	System.out.println("ARQUIVOS: ");
	for (File file : files) {
	    System.out.println(file);
	}
	
	boolean sucess = new File (caminhoPasta + "\\pastaTeste").mkdir();
	System.out.println("Diretório criado: " + sucess);
	
	scan.close();
    }

}
