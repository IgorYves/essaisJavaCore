package f1jLang;

class Wraps {

	public static void main(String[] args) {
		System.out.println(1/0.);
		System.out.println(1./0);
		System.out.println(1./0.);
		
		Double d1 = new Double(1/0.);
		System.out.println(d1);
		
		System.out.println(0/0.);
		Double d2 = new Double(0/0.);
		System.out.println(d2);

		System.out.println(Long.MAX_VALUE);
		Long lg = new Long(Long.MAX_VALUE);
		System.out.println(lg.toString().length());
		
		System.out.println(Integer.MAX_VALUE);
		Integer i = new Integer(Integer.MAX_VALUE);
		System.out.println(i.toString().length());
		
		int x = 150;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toOctalString(x));
		System.out.println(Integer.toHexString(x));
		
		System.out.println();
		System.out.println(Character.MAX_RADIX);
		System.out.println(Character.MAX_VALUE-1);
		System.out.println(Character.MIN_VALUE+1);
		System.out.println(Character.TYPE);
		
		System.out.println();
		for (int j=0; j<10; j++) {
			if (Character.isJavaIdentifierPart(j) || Character.isJavaIdentifierStart(j)) {
				System.out.println((char)j + "\t" 
						+ Character.isJavaIdentifierPart(j) + "\t" 
						+ Character.isJavaIdentifierStart(j));
			}
			
		}
		System.out.println(Boolean.parseBoolean(" true"));
		
		
	}

}
