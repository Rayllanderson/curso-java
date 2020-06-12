package application;

import java.util.HashMap;
import java.util.Map;

class Producto{
    
    private String nome;
    private Double prince;
    
    public Producto(String nome, Double prince) {
	this.nome = nome;
	this.prince = prince;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrince() {
        return prince;
    }

    public void setPrince(Double prince) {
        this.prince = prince;
    }
    
    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Producto other = (Producto) obj;
	if (nome == null) {
	    if (other.nome != null)
		return false;
	} else if (!nome.equals(other.nome))
	    return false;
	return true;
    } 
}

public class Map02 {

    public static void main(String[] args) {
	
	Map <Producto, Integer> map = new HashMap<>();
	
	Producto p1 = new Producto("Tv", 1299.99);
	Producto p2 = new Producto("Geladeira", 2399.99);
	Producto p3 = new Producto("PS4", 1499.99);
	Producto p4 = new Producto("Iphone", 4299.99);
	
	//estoque
	map.put(p1, 150);
	map.put(p2, 60);
	map.put(p3, 100);
	map.put(p4, 550);
	
	for (Producto key : map.keySet() ) {
	    System.out.println(key + ": " + map.get(key) + " unidades");
	}

    }

}
