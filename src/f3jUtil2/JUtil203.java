package f3jUtil2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

class JUtil203 {

	public static void main(String[] args) {
		Date d = new Date(-10000000000000L);
		System.out.println(d);
		d = new Date();
		System.out.println(d);
		System.out.println("---------------");
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR) 
						+ " " + cal.get(Calendar.MONTH) 
						+ " " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("---------------");
		
		GregorianCalendar gk = new GregorianCalendar();
		System.out.println(gk.get(Calendar.YEAR) 
				+ " " + gk.get(Calendar.MONTH) 
				+ " " + gk.get(Calendar.DAY_OF_MONTH));
		System.out.println("---------------");
		
		gk.setTime(new Date(0));
		System.out.println(gk.get(Calendar.YEAR) 
						+ " " + gk.get(Calendar.MONTH) 
						+ " " + gk.get(Calendar.DAY_OF_MONTH));
		d = gk.getTime();
		System.out.println(d);
		System.out.println("---------------");
		
		Locale loc = new Locale("FRENCH", "FRANCE");
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd MMMMM yyyy  HH:mm");
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(new Date()));
		
		
		
	}
}
