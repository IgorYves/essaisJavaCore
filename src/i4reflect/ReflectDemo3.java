package i4reflect;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectDemo3 {

	public static void main(String[] args) 
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className = "i4reflect.A";
		Class<?> class2test = Class.forName(className);
		
		System.out.println(className);
		
		System.out.println("----------");
		System.out.println("getFields :");
		Field[] fields = class2test.getDeclaredFields();
		Arrays.stream(fields).forEach((f)->{System.out.printf("%s\n", f);});
		
		System.out.println("----------");
		Object obj = class2test.newInstance();
		//Arrays.stream(obj.getClass().getFields()).forEach((f)->{System.out.printf("%s -- %s\n", f, f.get(obj));});
		Arrays.stream(obj.getClass().getFields())
									//.map((f)->{if(!f.isAccessible()) f.setAccessible(true); return f;})
									.peek((f)->{try {
										System.out.println(f.get(obj));
									} catch (IllegalArgumentException | IllegalAccessException e) {
										e.printStackTrace();
									}})
									//.map((f)->{if(!f.isAccessible()) f.setAccessible(false); return f;})
								.forEach((f)->{System.out.printf("%s\n", f);});
		System.out.println("----------");
		
		int numField = 4;
		fields[numField].setAccessible(true);
		System.out.println(fields[numField] + " --> " + fields[numField].getInt(obj));
		fields[numField].setInt(obj, 100 + fields[numField].getInt(obj));
		System.out.println(fields[numField] + " --> " + fields[numField].getInt(obj));
		
		System.out.println(((A)obj).getN());
		
		System.out.println(((A)obj).k);
		fields[numField].setAccessible(false);
	}

}
