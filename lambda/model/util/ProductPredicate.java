package model.util;

import java.util.function.Predicate;

import model.entities.Produtc;

public class ProductPredicate implements Predicate<Produtc>{

    @Override
    public boolean test(Produtc p) {
	return p.getPrince() < 300.00;
    }
    

}
