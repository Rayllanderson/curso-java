package model.util;

import java.util.function.Consumer;

import model.entities.Produtc;

public class PrinceUpdate implements Consumer<Produtc>{

    @Override
    public void accept(Produtc p) {
	p.setPrince(p.getPrince() * 1.1);
    }

}
