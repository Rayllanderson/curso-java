package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Copy {

    public static void main(String[] args) {

	List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
	List<Double> myDouble = Arrays.asList(3.14, 2.5, 3.4);
	List<Object> myObject = new ArrayList<>();

	copy(myInts, myObject);
	print(myObject);
	copy(myDouble, myObject);
	print(myObject);
    }

    //origem - vou passar uma lista de qualquer subtipo de number, ou seja, long, short, double, int
    //destino - vou passar uma lista que é super de number, ou seja, a object
    public static void copy(List<? extends Number> origem, List<? super Number> destino) {
	for (int i = 0; i < origem.size(); i++) {
	    destino.add(origem.get(i));
	}
    }
    //vou passar uma lista que é super de number, ou seja, a object
    public static void print(List<? super Number> list) {
	if (list != null) {
	    System.out.print(list.get(0));
	}
	for (int i = 1; i < list.size(); i++) {
	    System.out.print(", "+ list.get(i));
	}
	System.out.println();
    }

}
