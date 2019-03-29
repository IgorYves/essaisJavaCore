package f2jUtil1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class JUtil08 {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("Ugog Vishnu", 2.53);
		hm.put("Jim Pride", 42.05);
		hm.put("Joe Lows", 552.45);
		hm.put("Vero Lows", 982.35);
		hm.put("Kig Dovel", 22.52);
		
		Set<Map.Entry<String, Double>> st = hm.entrySet();
		for (Map.Entry<String, Double> e : st) {
			System.out.println(e.getKey() + "\t : " + e.getValue());
		}
		System.out.println("------------");
		String nom = "Ugog Vishnu";
		double sum = 100.0;
		double bal = hm.get(nom);
		hm.put(nom, bal + sum);
		for (Map.Entry<String, Double> e : st) {
			System.out.println(e.getKey() + "\t : " + e.getValue());
		}
		System.out.println("------------");
		TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());
		tm.put("Ugog Vishnu", 2.53);
		tm.put("Jim Pride", 42.05);
		tm.put("Joe Lows", 552.45);
		tm.put("Vero Lows", 982.35);
		tm.put("Kig Dovel", 22.52);
		
		Set<Map.Entry<String, Double>> st2 = tm.entrySet();
		for (Map.Entry<String, Double> e : st2) {
			System.out.println(e.getKey() + "\t : " + e.getValue());
		}
		
		System.out.println("------------");
		TCompLN comp = new TCompLN();
		Comparator<String> compLF = comp.thenComparing(new TCompFN());
		TreeMap<String, Double> tm2 = new TreeMap<String, Double>(compLF);
		tm2.put("Ugog Vishnu", 2.53);
		tm2.put("Jim Pride", 42.05);
		tm2.put("Joe Lows", 552.45);
		tm2.put("Vero Lows", 982.35);
		tm2.put("Kig Dovel", 22.52);
		
		Set<Map.Entry<String, Double>> st3 = tm2.entrySet();
		for (Map.Entry<String, Double> e : st3) {
			System.out.println(e.getKey() + "\t : " + e.getValue());
		}
		
	}
}

class TComp implements Comparator<String> {
	@Override
	public int compare (String s1, String s2) {
		int i,j,k;
		i = s1.lastIndexOf(' ');
		j = s2.lastIndexOf(' ');
		k = s1.substring(i).compareTo(s2.substring(j));
		if (k == 0) return s1.compareTo(s2);
		else return k;
	}
}

class TCompLN implements Comparator<String> {
	@Override
	public int compare (String s1, String s2) {
		return s1.substring(s1.lastIndexOf(' ')).compareToIgnoreCase(s2.substring(s2.lastIndexOf(' ')));
	}
}

class TCompFN implements Comparator<String> {
	@Override
	public int compare (String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
	}
}