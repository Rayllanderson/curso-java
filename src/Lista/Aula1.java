package Lista;

import java.util.ArrayList;
import java.util.List;

public class Aula1 {

    public static void main(String[] args) {
	List <String> list = new ArrayList<String> ();
	list.add("Ray");
	list.add("Fodase");
	list.add("João");
	list.add(2, "Carlos");
	list.add("Felipe");
	
	
	for (String x : list) {
	    System.out.println(x);
	}
	
	System.out.println("------------------------");
	
	//função lambda
	list.removeIf(x -> x.charAt(0) == 'F');
	
	for (String x : list) {
	    System.out.println(x);
	}
    }

}
