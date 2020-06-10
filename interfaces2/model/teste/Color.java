package model.teste;

public enum Color {
 
    
    BLACK(1), WHITE(2);
    

    private int valor;

    Color(int valor) {
	this.valor = valor;
    }

    public int getValor() {
	return this.valor;
    }


}
