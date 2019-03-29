package f2jUtil1;

import java.util.LinkedList;

class JUtil02 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("j");
		System.out.println(ll);
		ll.add("f");
		ll.add("e");
		ll.add("b");
		ll.add("n");
		System.out.println(ll);
		ll.addFirst("hh");
		System.out.println(ll);
		ll.addLast("y");
		System.out.println(ll);
		ll.add(2, "yyyyy");
		System.out.println(ll);
		int i = 3;
		String v = ll.get(i);
		ll.set(i, v + "------");
		System.out.println(ll);
		
	}

	

}
