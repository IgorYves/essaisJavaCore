package e8Generics;

class Gen6 {

	public static void main(String[] args) {
		G6<Integer> intObj1 = new G6<Integer>(55);
		G62<Integer> intObj2 = new G62<Integer>(44);
		G6<String> strObj1 = new G6<String>("bla");
		G62<String> strObj2 = new G62<String>("bla2");
		System.out.println(intObj1 instanceof G6);
		System.out.println(intObj2 instanceof G62);
		System.out.println(strObj1 instanceof G6);
		System.out.println(strObj2 instanceof G62);
		System.out.println();
		System.out.println(intObj2 instanceof G6<?>);
		System.out.println(intObj1 instanceof G62<?>);
		System.out.println(strObj2 instanceof G6<?>);
		System.out.println(strObj1 instanceof G62<?>);
		System.out.println();
		System.out.println(intObj2 instanceof G6);
		System.out.println(intObj1 instanceof G62);
		System.out.println();
		//System.out.println(intObj1 instanceof G6<Integer>);
		
		G6<Integer> intObj3 = intObj2;
		System.out.println(intObj3 instanceof G6<?>);
	}

}

class G6<T>{
	T obj;
	G6(T o){obj = o;}
	T getObj(){return obj;}
}

class G62<T> extends G6<T>{
	G62(T o){super(o);}
}