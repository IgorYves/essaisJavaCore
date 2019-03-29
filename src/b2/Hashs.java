package b2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Hashs {

	public static void main(String[] args) {
		H1 h1 = new H1(1);
		H1 h2 = new H1(2);
		H1 h3 = new H1(3);
		
		Hashtable<H1, String> ht = new Hashtable<>();
		ht.put(h1, "-1-");
		ht.put(h2, "-1-");
		ht.put(h3, "-3-");
		ht.put(h3, "-31-");
		Set<H1> keys = ht.keySet();
		for (H1 key : keys) {
			System.out.println(ht.get(key));
		}
		System.out.println("-------------------");
		HashMap<H1, String> hm = new HashMap<>();
		hm.put(h1, "-4-");
		hm.put(h2, "-4-");
		hm.put(h3, "-6-");
		hm.put(h3, "-61-");
		keys = hm.keySet();
		for (H1 key : keys) {
			System.out.println(hm.get(key));
		}
		
		
		
	}

}

class H1 {
	private int i;

	public H1(int i) {
		super();
		this.i = i;
	}

	@Override
	public int hashCode() {
		return 1;
	}
	
}