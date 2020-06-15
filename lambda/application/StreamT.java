package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamT {

    public static void main(String[] args) {
	//acesso sequencial
	
	List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
	
	//criando uma stream a partir da lista
	Stream<Integer> st1 = list.stream().map(x -> x*10);
	System.out.println(Arrays.toString(st1.toArray()));
	
	//criando uma stream a partir do streamOf
	Stream <String> st2 = Stream.of("Luffy", "Zoro", "Jo�o");
	System.out.println(Arrays.toString(st2.toArray()));
	
	Stream <Integer> st3 = Stream.iterate(0, x -> x + 2);
	System.out.println(Arrays.toString(st3.limit(10).toArray()));
	
	Stream <Long> st4 = Stream.iterate(new Long [] {0L, 1L}, p-> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
	System.out.println(Arrays.toString(st4.limit(20).toArray()));

    }

}
