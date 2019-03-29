package b001;

public class HeritageMult extends Papa1 {
	Fils fils;
	HeritageMult() {fils = new Fils();}
	public static void main(String[] args) {
		HeritageMult obj = new HeritageMult();
		obj.func1();
		obj.fils.func2();
		System.out.println("----------");
		obj.fils.affich();
	}
	
	class Fils extends Papa2 {
		void affich() {
			func1();
			func2();
		}
	}
}

class Papa1 {
	public void func1() {
		System.out.println("Papa1.func1()");
	}
}
class Papa2 {
	public void func2() {
		System.out.println("Papa2.func2()");
	}
}
