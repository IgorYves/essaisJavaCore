package i6datesFormats;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat;
		
		simpleDateFormat = new SimpleDateFormat("HH'h'mm'\"'ss''");
		System.out.println(simpleDateFormat.format(date));
		
	}
}
