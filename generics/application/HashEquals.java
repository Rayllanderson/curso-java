package application;

import model.entities.ClienteHash;

public class HashEquals {

    public static void main(String[] args) {
	
	Integer i = 0545;
	Integer j = 0545;
	
	String a = "Monkey D. Luffy";
	String b = "Roronoa Zoro";
	
	System.out.println(i.hashCode() == j.hashCode());
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	
	System.out.println("-----------");
	
	ClienteHash c1 = new ClienteHash("Zoro da silva", "ZoroHomemPeixe@onepiece.com");
	ClienteHash c2 = new ClienteHash("Zoro da silva", "ZoroHomemSapo@naruto.com");
	ClienteHash c3 = new ClienteHash("Zorao da massa", "ZoroEspada@gmail.com");
	ClienteHash c4 = new ClienteHash("Zoro da silva", "ZoroHomemPeixe@onepiece.com");
	
	System.out.println(c1.hashCode());
	System.out.println(c4.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c3.hashCode());
	
	System.out.println(c1.equals(c2));
	System.out.println(c2.equals(c3));
	System.out.println(c1.equals(c4));
	System.out.println(c1 == c2);
	
	//equals - o equals compara os conteúdos
	//já o == vai comparar o endereço de memoria, as referencias dos objetos
	
	System.out.println();
	
	String ameno = "test";
	String bmeno = "test";
	int iai = 10;
	int oi = 10;
	double hi = 3.14;
	double sup = 3.14;
	String test = new String("Hey bro");
	String test2 = new String("Hey bro");
	boolean fodase = true;
	boolean joao = true;
	
	//o " == " funciona pra tipos literais, numeros, strings, maybe boolean? ye, boolean too. 
	// mas pra objetos não funciona
	
	System.out.println(ameno == bmeno);
	System.out.println(iai == oi);
	System.out.println(hi == sup);
	System.out.println(test == test2);
	System.out.println(fodase == joao);
	
    }

}
