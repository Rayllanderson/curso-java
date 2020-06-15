package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circle;
import model.entities.Retangulo;
import model.entities.Shape1;

public class FigurasGeometricas {

    public static void main(String[] args) {
	
	List <Shape1> myShapes = new ArrayList<>();
	
	myShapes.add(new Retangulo(2, 3));
	myShapes.add(new Circle(2.0));
	
	List <Circle> myCircles = new ArrayList<>();
	
	myCircles.add(new Circle(2.0));
	myCircles.add(new Circle(3.0));
	
	
	System.out.println("Soma de todas as areas: " + String.format("%.2f",totalArea(myCircles)));

    }
    
    public static double totalArea(List<? extends Shape1> list) {
	double sum = 0;
	for (Shape1 s: list) {
	    sum +=s.area();
	}
	return sum;
    }
}
