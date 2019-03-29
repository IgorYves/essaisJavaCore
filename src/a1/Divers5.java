package a1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Divers5 {
	
	public static void main(String[] args) {
		Functn f = (x) -> x*x;
		
		System.out.println(f.fun(5));
		
		System.out.println("getClass :");
		System.out.println(f.getClass());
		
		System.out.println("-----------");
		System.out.println("getMethods :");
		Method[] m = f.getClass().getMethods();
		for (Method method : m) {
			System.out.println(method);
		}
		System.out.println("-----------");
		System.out.println("getTypeName :");
		System.out.println(f.getClass().getTypeName());
		System.out.println("-----------");
		System.out.println("getConstructors :");
		Constructor<?>[] c = f.getClass().getConstructors();
		for (Constructor<?> constr : c) {
			System.out.println(constr);
		}
		System.out.println("-----------");
		System.out.println("getDeclaredConstructors :");
		Constructor<?>[] cd = f.getClass().getDeclaredConstructors();
		for (Constructor<?> constr : cd) {
			System.out.println(constr);
		}
	}
}



interface Functn {
	int fun(int n);
}