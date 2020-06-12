package model.entities;

public class Retangulo implements Shape1 {

    private double altura;
    private double base;
    
    public Retangulo(double altura, double base) {
	this.altura = altura;
	this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
	return base * altura;
    }
    
    
    
}
