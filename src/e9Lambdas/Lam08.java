package e9Lambdas;

class Lam08 {

	public static void main(String[] args) {
		String strIn = "bla bla2 bla3";
		String strOut, strOut2;
		
		C8 strOps = new C8();
		strOut = strOp(strIn, strOps::strReverse);
		strOut2 = strOps.strReverse(strIn);
		
		System.out.println(strIn);
		System.out.println(strOut);
		System.out.println(strOut2);
	}
	
	static String strOp(String s, StrFunc2 sf) {
		return sf.func(s);
	}
}

class C8 {
	String strReverse(String str) {
		String result = "";
		for(int i=str.length()-1; i>=0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
}

interface StrFunc2 {
	String func(String s);
}