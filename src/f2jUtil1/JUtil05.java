package f2jUtil1;

import java.util.EnumSet;

enum days {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

class JUtil05 {

	public static void main(String[] args) {
		EnumSet<days> es = EnumSet.of(days.MONDAY, days.THURSDAY);
		
		
		System.out.println(es);
		
		
	}

	

}
