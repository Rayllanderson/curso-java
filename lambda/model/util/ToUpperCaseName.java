package model.util;

import java.util.function.Function;

import model.entities.Produtc;

public class ToUpperCaseName implements Function<Produtc, String>{

    @Override
    public String apply(Produtc p) {
	return p.getNome().toUpperCase();
    }


}
