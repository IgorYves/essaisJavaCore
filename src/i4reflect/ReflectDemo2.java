package i4reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException {
		String className = "i4reflect.A";
		Class<?> classDimension = Class.forName(className);
		
		System.out.println(className);
		
		System.out.println("----------");
		System.out.println("getDeclaredMethods :");
		Method[] declaredMmetods = classDimension.getDeclaredMethods();
		Arrays.stream(declaredMmetods).forEach((m)->{System.out.printf("%s  %s\n", m.getModifiers(), m);});
		System.out.println("----------");
		System.out.println("----------");
		Arrays.stream(declaredMmetods).forEach((m)->
						{if(Modifier.isPublic(m.getModifiers()))System.out.printf("public -- %s\n", m);});
		System.out.println("----------");
		System.out.println("----------");
		Arrays.stream(declaredMmetods).forEach((m)->
						{if(Modifier.isFinal(m.getModifiers()))System.out.printf("final -- %s\n", m);});
		

	}
}

class A {
	public static int i = 1;
	public int j = 2;
	public final int k = 3;
	private static int m = 4;
	private int n = 5;
	
	static public void s1() {}
	static protected void s2() {}
	static void s3() {}
	static private void s4() {}
	
	public void a1() {}
	protected void a2() {}
	void a3() {}
	private void a4() {}
	
	final public void f1() {}
	final protected void f2() {}
	final void f3() {}
	final private void f4() {}
	
	public int getN() {return n;}
}