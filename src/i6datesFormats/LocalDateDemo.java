package i6datesFormats;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateDemo {

	public static void main(String[] args) {
		System.out.println(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		
		System.out.println(LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
		
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy',' HH'h'mm'\"'ss''")));
		
		LocalDateTime localDateTime = LocalDateTime.parse("samedi 19 janvier 2019, 15h49\"13'", 
											DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy',' HH'h'mm'\"'ss''"));
		
		System.out.println(localDateTime);
	}
}
