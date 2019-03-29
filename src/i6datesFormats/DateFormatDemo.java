package i6datesFormats;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat dateFormat;
		
		dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.JAPAN);
		System.out.println(dateFormat.format(date));
		
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
		System.out.println(dateFormat.format(date));
		
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
		System.out.println(dateFormat.format(date));
		
		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ENGLISH);
		System.out.println(dateFormat.format(date));
		
		
		dateFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.US);
		System.out.println(dateFormat.format(date));
		
		dateFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.FRANCE);
		System.out.println(dateFormat.format(date));
		
		dateFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.ENGLISH);
		System.out.println(dateFormat.format(date));
		
		dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.FRANCE);
		System.out.println(dateFormat.format(date));
		
		
		
	}
}
