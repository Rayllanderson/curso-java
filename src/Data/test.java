package Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {
    
    public static void main(String[] args) throws ParseException {
	Calendar cl = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	Date d1 = sdf.parse("21/06/2020");
	
	cl.setTime(d1);
	cl.add(cl.MONTH, 3);
	d1 = cl.getTime();	
	System.out.println(sdf.format(d1));
		
	
    }

}
