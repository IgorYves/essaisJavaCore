package e3TryCatchAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class YHMeta{
	public static void main(String args[]) {
		uneMethode();
		System.out.println();
		uneMethode2();
		System.out.println();
		uneMethode3();
	}
	
	public static void uneMethode() {
		TryCatch2 obj = new TryCatch2();
		try {
			Class<?> c = obj.getClass();
			Method m = c.getMethod("metode");
			YHAnnotation annot = m.getAnnotation(YHAnnotation.class);
			System.out.println(annot.str() + " : " + annot.val());
		}
		catch (NoSuchMethodException e) {
			System.out.println("Methode pas trouvée");
		}
	}
	public static void uneMethode2() {
		TryCatch2 obj = new TryCatch2();
		try {
			Class<?> c = obj.getClass();
			Method m = c.getMethod("metode", int.class, double.class);
			YHAnnotation annot = m.getAnnotation(YHAnnotation.class);
			System.out.println(annot.str() + " : " + annot.val());
		}
		catch (NoSuchMethodException e) {
			System.out.println("Methode pas trouvée");
		}
	}
	public static void uneMethode3() {
		TryCatch2 obj = new TryCatch2();
		try {
			Annotation annot[] = obj.getClass().getAnnotations();
			for(Annotation a : annot) {
				System.out.println(a);
			}
			Method m = obj.getClass().getMethod("metode");
			annot = m.getAnnotations();
			for(Annotation a : annot) {
				System.out.println(a);
			}
			
		}
		catch (NoSuchMethodException e) {
			System.out.println("Methode pas trouvée");
		}
	}
}