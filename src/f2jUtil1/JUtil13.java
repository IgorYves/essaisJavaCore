package f2jUtil1;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

class JUtil13 {

	public static void main(String[] args) {
		Hashtable<String, Double> ht = new Hashtable<String, Double>();
		ht.put("Ugog Vishnu", 2.53);
		ht.put("Jim Pride", 42.05);
		ht.put("Joe Lows", 552.45);
		ht.put("Vero Lows", 982.35);
		ht.put("Kig Dovel", 22.52);
		
		Enumeration<String> en = ht.keys();
		String s;
		while (en.hasMoreElements()) {
			s = en.nextElement();
			System.out.println(s + "\t" + ht.get(s));
		}
		System.out.println("------------");
		System.out.println(ht.containsKey("Jim Pride"));
		System.out.println(ht.containsValue(2.53));
		System.out.println(ht.isEmpty());
		System.out.println(ht.get("Joe"));
		System.out.println(ht.size());
		System.out.println(ht.toString());
		
		System.out.println("------------");
		Set<String> st = ht.keySet();
		Iterator<String> it = st.iterator();
		while (it.hasNext()) {
			s = it.next();
			System.out.println(s + "\t" + ht.get(s));
		}
		
		
	}
}
