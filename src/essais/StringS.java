package essais;

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
		
		
		
	}

}
