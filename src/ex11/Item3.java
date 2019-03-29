package ex11;

class Item3 {
	
	public static void main(String[] args) {
		long l = 255067511305279L;
		System.out.println(l + " - " + verifieNoSS(l));
		System.out.println();
		l = 255067511305265L;
		System.out.println(l + " - " + verifieNoSS(l));
		System.out.println("---------------");
		
		String str = "2.55.06.75.113.052<79>";
		System.out.println(str + " - " + verifieNoSS(str));
		System.out.println();
		str = "2.55.06.75.113.052<65>";
		System.out.println(str + " - " + verifieNoSS(str));
		
	}
	
	static boolean verifieNoSS (String s) {
		return verifieNoSS(Long.valueOf(s.trim().replaceAll("[^0-9]", "")));
	}
	
	static boolean verifieNoSS (long noSS) {
		if (noSS > 2_999_999_999_999_99L || noSS < 999_999_999_999_99L) return false;
		if (97 - (noSS / 100 % 97) == (noSS % 100))return true;
		else return false;
	}
	
}
