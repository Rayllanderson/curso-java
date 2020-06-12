package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {

    public static void main(String[] args) {

	Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
	Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

	// union
	// to criando um novo objeto, passando os elementos do objeto a, e em seguida
	// adicionando todos os objetos b em c, que já tinha os elementos de a
	Set<Integer> c = new TreeSet<>(a);
	c.addAll(b);
	System.out.println(c);

	// intersection
	//elementos que tem em comum nos 2 conjuntos
	Set<Integer> d = new TreeSet<>(a);
	d.retainAll(b);
	System.out.println(d);
	
	// difference
	//removendo os elementos em comum
	Set<Integer> e = new TreeSet<>(a);
	e.removeAll(b);
	System.out.println(e);

    }

}
