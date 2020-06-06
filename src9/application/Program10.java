package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.*;

public class Program10 {

    public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Scanner scan = new Scanner(System.in);

	System.out.print("Número do quarto: ");
	int numero = scan.nextInt();
	System.out.print("Data de Check-in (DD/MM/AAAA): ");
	Date checkIn = sdf.parse(scan.next());
	System.out.print("Data de Check-out (DD/MM/AAAA): ");
	Date checkOut = sdf.parse(scan.next());

	// after = !(o checkout aconteceu depois do check in?)
	if (!checkOut.after(checkIn)) {
	    System.out.println("Erro na reserva: a data de check-out precisa ser uma data maior que a do check in");
	} else {
	    Reservation reservation = new Reservation(numero, checkIn, checkOut);
	    System.out.println(reservation);

	    System.out.println();

	    System.out.println("Update das datas: ");
	    System.out.print("Data de Check-in (DD/MM/AAAA): ");
	    checkIn = sdf.parse(scan.next());
	    System.out.print("Data de Check-out (DD/MM/AAAA): ");
	    checkOut = sdf.parse(scan.next());

	    Date now = new Date();
	    if (checkIn.before(now) || checkOut.before(now)) {
		System.out.println("Erro na reserva: Reservações só podem acontecer em datas futuras");
	    } else if (!checkOut.after(checkIn)) {
		System.out.println("Erro na reserva: a data de check-out precisa ser uma data maior que a do check in");
	    } else {
		reservation.updateDates(checkIn, checkOut);
		System.out.println("Updated");
		System.out.println(reservation);
	    }

	}
	scan.close();
	
    }

}
