package a001;

public class Stat {

	public static void main(String[] args) {
		Stat.fun(1);
		
		Stat obj = new Stat();
		obj.fun(2);
		obj.fun(2.0);

	}
	
	static void fun(int i) {System.out.println("stat " + i);}
	void fun(double d) {System.out.println("inst " + d);}
}
