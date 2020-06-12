package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {

    public static void main(String[] args) {
	// nao possui posição: pega pra mim o elemento na posicao [i]. isnt exists
	// nao repete elementos

	Set<String> set = new HashSet<>();
	set.add("notbook");
	set.add("Tv");
	set.add("Smartphone");
	set.add("Ps4");

	//System.out.println(set.contains("Tv"));

	// hashSet imprimindo sem ordem
	// HashSet nao garante a ordem, mas muito rápido
	imprimir(set);
	System.out.println();

	Set<String> setT = new TreeSet<>();
	setT.add("notbook");
	setT.add("Tv");
	setT.add("Smartphone");
	setT.add("Ps4");

	/* imprime em ordem, mas uma ordem ae, parece alfabetica, mas considera
	 * minuscula e maicula, coisa assim
	 * porém mais lento
	 */
	imprimir(setT);
	
	System.out.println();

	Set<String> setL = new LinkedHashSet<>();
	setL.add("notbook");
	setL.add("Tv");
	setL.add("Smartphone");
	setL.add("Ps4");
	setL.add("Ps4");

	// mantém a ordem que os elementos são inseridos, porém muuuito mais lento
	imprimir(setL);
	
	System.out.println();
	//remova da lista qualquer elemento que seja maior ou igual a 3
	//setL.removeIf(x -> x.length() >= 3);
	
	setL.add("Tablet");
	
	//remova da lista qualquer elemento tal que a primeira letra comece com T
	//setL.removeIf(x -> x.charAt(0) == 'T');
	
	imprimir(setL);

    }
    
    public static void imprimir(Set <? extends Object> set) {
	for (Object p : set) {
	    System.out.println(p);
	}
    }

}
