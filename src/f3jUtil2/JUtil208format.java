package f3jUtil2;

import java.util.Date;
import java.util.Formatter;

class JUtil208format {

	public static void main(String[] args) {
		Formatter f = new Formatter();
		for (double d=100.0; d<110.0; d+=1.5) {
			f.format("%8.2f %<-10.2e %<10g %n", d);
		}
		System.out.println(f);
		
		f.close();
		f = new Formatter();
		Date d = new Date();
		System.out.println(f.format("\n%%\n%n %ta %<tA %<Ta %<tb %<tB \n %<tc \n %<tF %<tT", d));
		
		f.close();
		f = new Formatter();
		for (int i=8; i<13; i++) {
			f.format("\n%5d", i);
		}
		System.out.println(f);
		
		f.close();
		f = new Formatter();
		String s = "abcdefgh";
		System.out.println(f.format("bla bla %20.5s %<15.20s", s));
		
		f.close();
		f = new Formatter();
		for (double d1=-100.0; d1<120.0; d1+=51.5) {
			f.format("|%10.2f | %<+-10g|%< -10.2f | %<(10.2f |%n", d1);
		}
		System.out.println(f);
		
		double nmbr = 10000000000000D;
		f.close();
		f = new Formatter();
		f.format("|%,30.2f|%n"
				+ "|%<30.2f|%n"
				+ "|%<,30f|%n"
				+ "|%<30f|",
				nmbr);
		System.out.println(f);
		
		System.out.println();
		f.close();
		f = new Formatter();
		System.out.println(f.format("%S", "bla bla"));
		
		System.out.println();
		f.close();
		f = new Formatter();
		System.out.println(f.format("%2$d %3$d %3$d", 1, 2, 3));
		
		System.out.println();
		f.close();
		try (Formatter f2 = new Formatter()) {
			System.out.println(f2.format("%d in hex : %<x (%1$X)", 253, 2, 3));
		};
		//no close
		
		System.out.println();
		System.out.printf("%2$d %3$d %3$d", 1, 2, 3);
		
		
	}
}
