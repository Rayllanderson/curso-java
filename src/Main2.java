import java.util.Locale;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	
	int minutos, tarifa = 50;
	System.out.println("Quantos minutos foram consumidos?");
	minutos = scan.nextInt();
	String cara = (minutos > 100) ? "sim" : "n�o";
	if (minutos > 100) {
	   
	    tarifa += 2 * (minutos - 100);
	}
	
	System.out.println("Voc� pagar� R$" + tarifa);
	System.out.println("Est� caro? " + cara);
	
	scan.close();

    }

}
