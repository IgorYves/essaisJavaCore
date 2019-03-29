package e9Lambdas;

class Lam07 {

	public static void main(String[] args) {
		String strIn = "bla bla2";
		String strOut;
		String strOut2;
		String strOut3;
		String strOut4;
		
		strOut = strOp(strIn, C7::toUppCse);
		strOut2 = strOp(strIn, C71::subStr);
		strOut3 = strOp(strIn, C7::strReverse);
		strOut4 = C7.strReverse(strIn);
		
		System.out.println(strIn);
		System.out.println(strOut);
		System.out.println(strOut2);
		System.out.println(strOut3);
		System.out.println(strOut4);
	}
	
	static String strOp(String s, StrFunc sf) {
		return sf.func(s);
	}
}

interface StrFunc {
	String func(String s);
}
class C7 {
	static String strReverse(String str) {
		String result = "";
		for(int i=str.length()-1; i>=0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
	static String toUppCse(String str) {
		return str.toUpperCase();
	}
}
class C71 {
	static String subStr(String str) {
		return str.substring(1, 5);
	}
}
