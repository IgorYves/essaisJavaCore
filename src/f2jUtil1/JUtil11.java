package f2jUtil1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class JUtil11 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(5, 3);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		v.addElement(6);
		System.out.println("-------------");
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		System.out.println("-------------");
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		System.out.println("-------------");
		Enumeration<Integer> vEnum = v.elements();
		while (vEnum.hasMoreElements()) {
			System.out.print(vEnum.nextElement() + " ");
		}
		
		System.out.println("\n-------------");
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println("\n-------------");
		for (Integer i : v) {
			System.out.print(i + " ");
		}
	}
}
