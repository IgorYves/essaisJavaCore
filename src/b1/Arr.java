package b1;

import java.util.ArrayList;

public class Arr {

	public static void main(String[] args) {
		A2 a2 = new A2();
		ArrayList<A2> arrL = new ArrayList<>();
		arrL.add(a2);
		arrL.add(a2);
		arrL.add(a2);
		arrL.add(a2);
		arrL.add(a2);
		System.out.println(arrL.size());
		arrL.stream().forEach(a->a.fun());
	}

}
class A2 {
	static int i = 1;
	
	void fun() {
		System.out.println(i);
	}

	public A2() {
		i++;
	}
	
}