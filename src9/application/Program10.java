package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


import model.entities.*;
import model.exceptions.DomainException;

public class Program10 {

    public static void main(String[] args) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Scanner scan = new Scanner(System.in);

	try {
	    System.out.print("Número do quarto: ");
	    int numero = scan.nextInt();
	    System.out.print("Data de Check-in (DD/MM/AAAA): ");
	    Date checkIn = sdf.parse(scan.next());
	    System.out.print("Data de Check-out (DD/MM/AAAA): ");
	    Date checkOut = sdf.parse(scan.next());

	    Reservation reservation = new Reservation(numero, checkIn, checkOut);
	    System.out.println(reservation);

	    System.out.println();

	    System.out.println("Update das datas: ");
	    System.out.print("Data de Check-in (DD/MM/AAAA): ");
	    checkIn = sdf.parse(scan.next());
	    System.out.print("Data de Check-out (DD/MM/AAAA): ");
	    checkOut = sdf.parse(scan.next());
	    reservation.updateDates(checkIn, checkOut);

	    System.out.println("Updated");
	    System.out.println(reservation);
	} catch (ParseException e) {
	    System.out.println("Formato de data inválido. Digite uma nesse formato (dd/mm/aaaa)");
	}catch (DomainException e) {
	    System.out.println("Erro na reserva: " + e.getMessage());
	}catch(RuntimeException e) {
	    System.out.println("Erro inesperado");
	}
	finally {
	    scan.close();
	}

    }

}
