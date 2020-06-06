package entities;

public class ProdutoImportado extends Produto{
    
    private Double taxaAlfandega;
    public ProdutoImportado() {
	super();
    }

    public ProdutoImportado(String name, Double prince, Double taxaAlfandega) {
	super(name, prince);
	this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Taxa da Alfândega: R$" + this.taxaAlfandega;
    }

}
