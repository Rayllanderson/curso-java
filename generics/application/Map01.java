package application;

import java.util.Map;
import java.util.TreeMap;

public class Map01 {

    public static void main(String[] args) {
	
	Map <String, String> cookies = new TreeMap<>();
	
	cookies.put("username", "Gilgamesh");
	cookies.put("email", "GilgameshSama@gmail.com");
	cookies.put("phone", "99923999");
	
	System.out.println("Contains 'phone'? " + cookies.containsKey("phone"));
	System.out.println("Phone number: " + cookies.get("phone"));
	System.out.println("Adress: " + cookies.get("Adress")); //nao existe, logo retorna nulo
	System.out.println("Size: " +cookies.size());
	//cookies.remove("email");
	
	System.out.println();
	System.out.println("All cookies: " );
	for (String key : cookies.keySet()) {
	    System.out.println(key + ": " + cookies.get(key));
	}
	
	

    }

}
