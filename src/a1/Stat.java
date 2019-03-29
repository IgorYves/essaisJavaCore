package a1;

public class Stat {

	public static void main(String[] args) {
		new Stat().nonStatik();
		System.out.println("--------------");
		Stat2 s = new Stat2(5);
		Stat2 s2 = new Stat2(10);
		System.out.println(s.x);
		System.out.println(s.stat2.x);
		System.out.println(s2.x);
		System.out.println(s2.stat2.x);
		System.out.println("--------------");
		System.out.println(s.y);
		System.out.println(s.stat2.y);
		System.out.println(s2.y);
		System.out.println(s2.stat2.y);
		System.out.println("--------------");
		s.stat2.y++;
		System.out.println("--------------");
		System.out.println(s.stat2.y);
		System.out.println(s2.stat2.y);
		System.out.println("--------------");
		System.out.println(s.stat2 == s2.stat2);
		System.out.println(s.stat2 == Stat2.stat2);
	}
	
	static void statik() {
		//nonStatik();
		System.out.println("statik");
	}
	void nonStatik() {
		statik();
		System.out.println("nonStatik");
	}
}

class Stat2 {
	int x;
	int y = 0;
	static Stat2 stat2 = new Stat2(0);
	Stat2(int x) {this.x = x;}
}