package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Reservation(Integer roomNumber, Date checkIn, Date checkout) {
	this.roomNumber = roomNumber;
	this.checkIn = checkIn;
	this.checkOut = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
	//get time retorna a quantitdade de milisegundos dessa data
	long diff = checkOut.getTime() - checkIn.getTime();
	//converte o valor de milisec. pra dias
	return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

	}

    
    public void updateDates(Date checkIn, Date checkOut) {
	this.checkIn = checkIn;
	this.checkOut = checkOut;
    }

    @Override
    public String toString() {
	StringBuilder s = new StringBuilder();
	s.append("Room: " + this.roomNumber);
	s.append(", Check-in: " + sdf.format(checkIn));
	s.append(", Check-out: " + sdf.format(checkOut));
	s.append(", Duration: " + this.duration() + " noites");
	return s.toString();
    }
    
    
    
    
    
}
