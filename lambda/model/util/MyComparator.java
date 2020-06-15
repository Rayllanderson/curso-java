package model.util;

import java.util.Comparator;

import model.entities.Produtc;

public class MyComparator implements Comparator<Produtc> {

    @Override
    public int compare(Produtc p1, Produtc p2) {
	return p1.getNome().compareToIgnoreCase(p2.getNome());
    }

}
