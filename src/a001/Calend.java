package a001;

import java.util.Calendar;
import java.util.Date;

class Calend {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.get(Calendar.YEAR);
				
		System.out.println();

	}

}
