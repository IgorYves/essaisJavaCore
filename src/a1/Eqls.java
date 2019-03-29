package a1;

class Eqls {

	public static void main(String[] args) {
		Tst o1 = new Tst();
		Tst o2 = new Tst();
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
		System.out.println("----------------");
		
		String s1 = new String("55");
		String s2 = new String("55");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("----------------");
		
		String s3 = "77";
		String s4 ="77";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println("----------------");
		
		System.out.println(s2.getClass().getName());
		
		System.out.println(null == null);
		System.out.println("----------------");
		Tst t1 = null;
		Tst t2 = null;
		System.out.println(t1 == t2);
		//System.out.println(t1.equals(t2));
		String ts1 = null;
		String ts2 = null;
		System.out.println(ts1 == ts2);
		//System.out.println(ts1.equals(ts2));
	}

}

class Tst {
	int i;
	Tst() {i = 5;}
}