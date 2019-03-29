package e2EnumsHeritageInterfaces;

//variables non initialisèes
class TestVars {
	static int i;
	static String s;
	static boolean b;
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		System.out.println("-------------");
		Test2 T = new Test2();
		System.out.println(T.i);
		System.out.println(T.s);
		System.out.println(T.b);
	}
}

class Test2 {
	int i;
	String s;
	boolean b;
}