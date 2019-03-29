package i4reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		String className = "java.awt.Dimension";
		Class<?> classDimension = Class.forName(className);
		
		System.out.println(className);
		
		System.out.println("----------");
		System.out.println("getConstructors :");
		Constructor[] constructors = classDimension.getConstructors();
		Arrays.stream(constructors).forEach((a)->{System.out.printf("%s\n", a);});
		
		System.out.println("----------");
		System.out.println("getFields :");
		Field[] fields = classDimension.getFields();
		Arrays.stream(fields).forEach((a)->{System.out.printf("%s\n", a);});
		
		System.out.println("----------");
		System.out.println("getMethods :");
		Method[] metods = classDimension.getMethods();
		Arrays.stream(metods).forEach((a)->{System.out.printf("%s\n", a);});
		
		System.out.println("----------");
		System.out.println("getDeclaredMethods :");
		Method[] declaredMmetods = classDimension.getDeclaredMethods();
		Arrays.stream(declaredMmetods).forEach((a)->{System.out.printf("%s\n", a);});
		
		

	}

}
