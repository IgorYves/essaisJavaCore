package ex11;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class esss {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		System.out.println(df.format(6.1));
		System.out.println("---------------------------");
		
		DecimalFormat df2 = new DecimalFormat();
		df2.setMaximumFractionDigits(2);
		df2.setRoundingMode(RoundingMode.DOWN);
		System.out.println(df2.format(6.115));
		
	}

}
