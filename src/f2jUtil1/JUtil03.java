package f2jUtil1;

import java.util.TreeSet;

class JUtil03 {

	public static void main(String[] args) {
		//HashSet<String> hs = new HashSet<String>();
		//LinkedHashSet<String> hs = new LinkedHashSet<String>();
		TreeSet<String> hs = new TreeSet<String>();
		
		hs.add ("Бета") ;
		hs.add ("Aльфa") ;
		hs.add ("Этa") ;
		hs.add ("Гaммa") ;
		hs.add ("Эпсилон") ;
		hs.add ("Омeгa") ;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(hs);
		}
		System.out.println(hs.subSet("Бета", "Омeгa"));
		
	}

	

}
