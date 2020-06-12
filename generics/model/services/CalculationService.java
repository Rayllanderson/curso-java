package model.services;

import java.util.List;


public class CalculationService {
   		  
    public static <T extends Comparable<? super T>> T maxValue(List <T> list) {
	if (list == null) {
	    throw new IllegalArgumentException("Lista vazia");
	}
	T max = list.get(0);
	for (T item : list) {
	    if (item.compareTo(max) > 0) {
		max = item;
	    }
	}
	return max;
    }
}
