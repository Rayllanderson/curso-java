package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {

    public static void main(String[] args) {
	List <Integer> list = Arrays.asList(3, 4, 5, 10, 7, 20);
	
	Stream <Integer> str1 = list.stream().map(x -> x*10);
	
	System.out.println(Arrays.toString(str1.toArray()));
	
	int sum = list.stream().reduce(0, (x, y) -> x + y);
	
	
	System.out.println(sum);
	
	List <Integer> list2 = list.stream()
		.filter(x -> x%2 == 0) //filtrou quem é par
		.map(x -> x*10)        //pegou os elementos filtrados e *10
		.collect(Collectors.toList()); // converteu pra lista
	
	System.out.println(Arrays.toString(list2.toArray()));
	}

}
