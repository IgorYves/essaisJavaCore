package a1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Divers3 {
	
	public static void main(String[] args) {
		D5 o = new D5(3);
		o.get();
		//D5 o2 = new D5();
		System.out.println(o.x);
		o.plusOne();
		System.out.println(o.x);
		System.out.println(D5.x);
		System.out.println("-----------");
		o.plusTwo();
		System.out.println(o.x);
		System.out.println(D5.x);
		System.out.println("-----------");
		D5.plusTwo();
		System.out.println(o.x);
		System.out.println(D5.x);
		System.out.println("-----------");
		Method[] m = o.getClass().getMethods();
		for (Method method : m) {
			System.out.println(method);
		}
		System.out.println("-----------");
		System.out.println(o.getClass().getTypeName());
		System.out.println("-----------");
		Constructor<?>[] c = o.getClass().getConstructors();
		for (Constructor<?> constr : c) {
			System.out.println(constr);
		}
		System.out.println("-----------");
		Constructor<?>[] cd = o.getClass().getDeclaredConstructors();
		for (Constructor<?> constr : cd) {
			System.out.println(constr);
		}
	}
}

class D5 {
	static int x;
	D5() {x = 1;}
	public D5(int i) {x = i;}
	public int get() {return x;}
	static {x=1;}
	void plusOne() {x++;}
	static void plusTwo() {x += 2;}
}
