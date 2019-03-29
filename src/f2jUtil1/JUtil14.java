package f2jUtil1;

import java.util.Properties;
import java.util.Set;

class JUtil14 {

	public static void main(String[] args) {
		Properties pr = System.getProperties();
		System.out.println(pr);
		System.out.println("------------");
		Set<?> st = pr.keySet();
		for (Object o : st) {
			System.out.println(o + "\t" + pr.getProperty((String)o));
		}
		System.out.println("------------");
		System.out.println(pr.getProperty("inexistant"));
		System.out.println("------------");
		System.out.println(pr.getProperty("inexistant", "defau propr"));
		System.out.println("------------");
		System.out.println();
		
		Properties pr4 = new Properties();
		pr4.put("odinnadtsat", "onze");
		pr4.put("dvenadtsat", "douze");
		pr4.put("trinadsat", "treize");
		pr4.put("chetirnadsat", "quatorze");
		pr4.put("pyatnadsat", "quinze");
		
		Properties pr2 = new Properties(pr4);
		pr2.put("shest", "six");
		pr2.put("sem", "sept");
		pr2.put("vosem", "huit");
		pr2.put("devyat", "neuf");
		pr2.put("desyat", "dix");
		
		Properties pr3 = new Properties(pr2);
		pr3.put("raz", "un");
		pr3.put("dva", "deux");
		pr3.put("tri", "troi");
		pr3.put("chetyre", "quatre");
		pr3.put("pyat", "cinq");
		
		System.out.println(pr3.getProperty("raz"));
		System.out.println(pr3.getProperty("vosem"));
		System.out.println(pr3.getProperty("trinadsat"));
		
		System.out.println("------------");
		
		
		
		
	}
}
