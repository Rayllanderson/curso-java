package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.entities.Produtc;
import model.util.ToUpperCaseName;

public class FunctionT {

    public static void main(String[] args) {
	
	//Manipula��o, digamos assim
	
	List<Produtc> list = new ArrayList<>();
	
	list.add(new Produtc("Rx 570", 442.99));
	list.add(new Produtc("Ryzen 5 2600", 799.99));
	list.add(new Produtc("AB-320MK", 575.99));
	list.add(new Produtc("RAM 4gb", 2*147.99));
	
       /* - primeiro converti minha lista pra stream
        * 
	* - fun��o map - vai fazer tal a��o para cada elementos da lista
	* 
	* - gerando uma nova lista */
	
	//List <String> names = list.stream().map(new ToUpperCaseName()).collect(Collectors.toList());
	
	//2 m�todo
	//List <String> names = list.stream().map(Produtc :: staticUpperCaseNome).collect(Collectors.toList());
	
	//3 m�todo
	//List <String> names = list.stream().map(Produtc :: nonStaticUpperCaseNome).collect(Collectors.toList());
	
	//4 m�todo
	//Function<Produtc, String> func = p -> p.getNome().toUpperCase();
	//List <String> names = list.stream().map(func).collect(Collectors.toList());

	
	// 5 m�todo
	List <String> names = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
	
	names.forEach(System.out::println);

    }

}
