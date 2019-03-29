package ex11;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

class Item1 {
	private static final double taux = 6.55957;
	
	public static void main(String[] args) {
		
		System.out.println(franc2euro(100000.25));
		System.out.println(euro2franc(10000.55));
		System.out.println("---------------------------");
		
		System.out.println(arrondi(36.115));
		System.out.println(arrondi(36.114));
		System.out.println("---------------------------");
		
		System.out.println(trunk(36.115));
		System.out.println(trunk(36.114));
		
		
		
	}

	static String euro2franc(long l) {return euro2franc((double)l);}
	static String euro2franc(int i) {return euro2franc((double)i);}
	static String euro2franc(double e) {
		return NumberFormat.getCurrencyInstance().format(taux * e).replace('€', 'F');
	}
	static String franc2euro(long l) {return franc2euro((double)l);}
	static String franc2euro(int i) {return franc2euro((double)i);}
	static String franc2euro(double f) {
		return NumberFormat.getCurrencyInstance().format(f/taux);
	}
	static String arrondi(double d) {
		Double dd = d;
		return arrondi(dd.toString());
	}
	static String arrondi(String s) {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		return df.format(Double.valueOf(s)).toString();
	}
	static String trunk(double d) {
		Double dd = d;
		return trunk(dd.toString());
	}
	static String trunk(String s) {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		df.setRoundingMode(RoundingMode.DOWN);
		return df.format(Double.valueOf(s)).toString();
	}
}
