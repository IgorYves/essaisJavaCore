package f2jUtil1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class JUtil09 {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(8);
		ll.add(28);
		ll.add(83);
		ll.add(55);
		ll.add(5);
		ll.add(6);
		System.out.println(ll);
		Comparator<Integer> comp = Collections.reverseOrder();
		Collections.sort(ll, comp);
		System.out.println(ll);
		Collections.shuffle(ll);
		System.out.println(ll);
		System.out.println(Collections.min(ll));
		System.out.println(Collections.max(ll));
		
		
	}
}
