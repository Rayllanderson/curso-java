package curso_java;

public class Triangulo {
    private double a;
    private double b;
    private double c;
    
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    
    public double area () {
	double p = (this.a + this.b + this.c )/ 2;
	return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
