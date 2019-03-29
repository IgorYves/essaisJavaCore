package f2jUtil1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class JUtil07 {

	public static void main(String[] args) throws ClassNotFoundException {
		AdresseTel a1 = new AdresseTel("Joe", "15 street", "0148523697");
		//String a01 = new String("Joe");
		Adresse a01 = new Adresse("Joe");
		
		AdresseTel a2 = new AdresseTel("Jon", "55 street", "0256423697");
		//String a02 = new String("Jon");
		Adresse a02 = new Adresse("Jon", "55 street");
		
		AdresseTel a3 = new AdresseTel("Jim", "11 street", "0545469700");
		//String a03 = new String("Jim");
		Adresse a03 = new Adresse("Jim");
		
		AdresseTel a4 = new AdresseTel("Jos", "10 street", "0148456597");
		//String a04 = new String("Jos");
		Adresse a04 = new Adresse("Jos");
		
		LinkedList<AdresseTel> pq = new LinkedList<>();
		pq.add(a1);
		pq.add(a2);
		pq.add(a3);
		pq.add(a4);
		Adresse a5 =  new AdresseTel("Josee", "10 street", "0148456597");
		//Adresse a6 = a5;
		Adresse a6 = new AdresseTel("Josee", "10 street", "0148456597");
		System.out.println(a6 == a5);
		System.out.println(a6.equals(a5));
		System.out.println("--------------");
		
		//TreeMap<String, AdresseTel> tm = new TreeMap<String, AdresseTel>();
		TreeMap<Adresse, AdresseTel> tm = new TreeMap<Adresse, AdresseTel>();
		tm.put(a01, a1);
		tm.put(a02, a2);
		tm.put(a03, a3);
		tm.put(a04, a4);
		/*
		 * Set<Map.Entry<String, AdresseTel>> st = tm.entrySet(); for
		 * (Map.Entry<String, AdresseTel> e : st) {
		 * System.out.println(e.getKey() + "\t : " + e.getValue()); }
		 */
		Set<Map.Entry<Adresse, AdresseTel>> st = tm.entrySet();
		for (Map.Entry<Adresse, AdresseTel> e : st) {
			System.out.println(e.getKey() + "\t : " + e.getValue());
		}
		System.out.println("-----------------");
		System.out.println(a1);
		System.out.println(a1.getClass());
		System.out.println(Class.forName("f2.C"));
		System.out.println(f2jUtil1.C.class);
		C c = new C();
		System.out.println(c.getClass());
		System.out.println(c.getClass().getName());
		System.out.println("-----------------");
		System.out.println(Class.forName("f2.Adresse"));
		System.out.println(Class.forName("f2.Adresse").getFields());
		System.out.println(Class.forName("f2.Adresse").getFields().length);
		System.out.println(Class.forName("f2.Adresse").getConstructors());
		System.out.println(Class.forName("f2.Adresse").getConstructors().length);
		System.out.println(Class.forName("f2.Adresse").getMethods());
		System.out.println(Class.forName("f2.Adresse").getMethods().length);
		System.out.println(Class.forName("f2.Adresse").getInterfaces());
		System.out.println(Class.forName("f2.Adresse").getSuperclass());
		System.out.println(Class.forName("f2.Adresse").getPackage());
		System.out.println("---");
		for (Object o : Class.forName("f2.Adresse").getMethods()) System.out.println(o);
		
		
		System.out.println("-----------------");
		TreeMap<Adresse, AdresseTel> tm2 = new TreeMap<Adresse, AdresseTel>((new testComparator()).reversed());
		tm2.put(a01, a1);
		tm2.put(a02, a2);
		tm2.put(a03, a3);
		tm2.put(a04, a4);
		Set<Map.Entry<Adresse, AdresseTel>> st2 = tm2.entrySet();
		for (Map.Entry<Adresse, AdresseTel> e : st2) {
			System.out.println(e.getKey() + "\t : " + e.getValue());
		}
		
		System.out.println("-----------------");
		TreeMap<Adresse, AdresseTel> tm3 = new TreeMap<Adresse, AdresseTel>((k1, k2) -> k1.name.compareTo(k2.name));
		tm3.put(a01, a1);
		tm3.put(a02, a2);
		tm3.put(a03, a3);
		tm3.put(a04, a4);
		Set<Map.Entry<Adresse, AdresseTel>> st3 = tm3.entrySet();
		for (Map.Entry<Adresse, AdresseTel> e : st3) {
			System.out.println(e.getKey() + "\t : " + e.getValue());
		}
		
		
	}
}

class C {static{System.out.println("charg C");}}

class testComparator implements Comparator<Adresse> {
	@Override
	public int compare (Adresse a1, Adresse a2) {
		return a1.name.compareTo(a2.name);
	}
}

class Adresse implements Comparable<Object> {
	String name;
	String adr;
	Adresse() {
		this.name = "-";
		this.adr = "-";
	}
	Adresse(String name) {
		this.name = name;
		this.adr = "";
	}
	Adresse(String name, String adr) {
		this.name = name;
		this.adr = adr;
	}
	@Override
	public String toString() {
		return name + (adr==null||adr.length()==0 ? "" : ", " + adr);
	}
	@Override
	public int compareTo(Object o) {
		return name.compareTo(o.getClass().getName());
	}
	//String getName() {return name;}
}

class AdresseTel extends Adresse {
	String tel;
	AdresseTel(String name, String adr, String tel) {
		super (name, adr);
		this.tel = tel;
	}
	@Override
	public String toString() {
		return name + ", " + adr + ", " + tel;
	}
}