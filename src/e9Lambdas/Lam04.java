package e9Lambdas;

class Lam04 {

	public static void main(String[] args) {
		String inStr = "bla1 bla2 bla3 bla4";
		System.out.println(inStr);
		String outStr;
		outStr = strFunc(inStr, (str) -> str.toUpperCase());
		System.out.println(outStr);
		
		outStr = strFunc(inStr, (str) -> {
			String result = "";
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) != ' ') {
					result += str.charAt(i);
				}
			}
			return result;
		});
		System.out.println(outStr);
		
		StrFuncInterf reverse = (str) -> {
			String result = "";
			for(int i=str.length()-1; i>=0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		System.out.println(strFunc(inStr, reverse));
	}
	
	static String strFunc(String s, StrFuncInterf strFInterf) {
		return strFInterf.func(s);
	}
}

interface StrFuncInterf{
	String func(String s);
}