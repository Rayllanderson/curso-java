package application;

import java.io.File;
import java.util.Scanner;

public class Program16 {
    
    public static void main(String[] args) {

   	Scanner scan = new Scanner(System.in);

   	System.out.print("Entre com o caminho de uma pasta: ");
   	String caminhoPasta = scan.nextLine();
   	
   	File path = new File (caminhoPasta);
   	
   	System.out.println("getName: " + path.getName());
   	System.out.println("getParent: " + path.getParent());
   	System.out.println("getPath: " + path.getPath());
   	System.out.println(path.getFreeSpace());
   	
   	scan.close();
   	
    }

}
