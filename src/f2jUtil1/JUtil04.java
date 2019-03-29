package f2jUtil1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Spliterator;

class JUtil04 {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add ("Бета") ;
		pq.add ("Aльфa") ;
		pq.add ("Этa") ;
		pq.add ("Гaммa") ;
		pq.add ("Эпсилон") ;
		pq.add ("Омeгa") ;
		
		System.out.println(pq);
		System.out.println(pq.comparator());
		
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add ("Бета") ;
		ad.add ("Aльфa") ;
		ad.add ("Этa") ;
		ad.add ("Гaммa") ;
		ad.add ("Эпсилон") ;
		ad.add ("Омeгa") ;
		System.out.println(ad);
		String s = ad.pop();
		System.out.println(s);
		System.out.println(ad);
		ad.push(s);
		System.out.println(ad);
		
		Iterator<String> it = ad.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------");
		for (String st : ad) {
			System.out.println(st);
		}
		System.out.println("-------------sp");
		Spliterator<String> sp = ad.spliterator();
		System.out.println(sp.estimateSize());
		while (sp.tryAdvance((a)->System.out.println(a)));
		System.out.println(sp.estimateSize());
		System.out.println("-------------al");
		sp = ad.spliterator();
		ArrayList<String> al = new ArrayList<String>();
		while (sp.tryAdvance((a)->al.add(a)));
		System.out.println(al);
		System.out.println("-------------");
		
		
	}

	

}
