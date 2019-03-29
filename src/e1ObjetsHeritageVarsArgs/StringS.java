package e1ObjetsHeritageVarsArgs;

class StringS {
	public static void main(String[] args) {
		for(String x : args) {System.out.println("arg : " + x);};
		System.out.println("************");
		
		String str1 = "string 1";
		System.out.println(str1);
		String str11 = "string 1";
		System.out.println(str11);
		System.out.println(str11.equals(str1));
		System.out.println(str11.length());
		System.out.println(str11.charAt(2));
		
		System.out.println("****************");
		String str3 = "str";
		String str4 = "str";
		String str5 = new String("str");
		String str6 = new String("str");
		System.out.println("str3==str4 : " + (str3==str4));
		System.out.println("str3==str5 : " + (str3==str5));
		System.out.println("str5==str6 : " + (str5==str6));
		System.out.println("------------");
		System.out.println("str3.equals(str4) : " + (str3.equals(str4)));
		System.out.println("str3.equals(str5) : " + (str3.equals(str5)));
		System.out.println("str5.equals(str6) : " + (str5.equals(str6)));
	}

}
