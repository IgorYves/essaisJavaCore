package f3jUtil2;

import java.util.Currency;
import java.util.Locale;

class JUtil207 {

	public static void main(String[] args) {
		Currency c = Currency.getInstance(Locale.FRANCE);
		System.out.println(c.getCurrencyCode());
		System.out.println(c.getSymbol());
		System.out.println(c.getDefaultFractionDigits());
		System.out.println(c.getDisplayName());
		System.out.println(c.getNumericCode());
		System.out.println(c.toString());
		
		
	}
}
