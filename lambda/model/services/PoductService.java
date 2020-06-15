package model.services;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Produtc;

public class PoductService {

    public double filteredSum(List<Produtc> list, Predicate<Produtc> criterio) {
	double sum = 0.0;

	for (Produtc p : list) {
	    if (criterio.test(p)){
		sum += p.getPrince();
	    }
	}

	return sum;
    }

}
