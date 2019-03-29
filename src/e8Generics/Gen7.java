package e8Generics;

class Gen7 {

	public static void main(String[] args) {
		G7<Integer> intObj1 = new G7<Integer>(55);
		G72<Integer> intObj2 = new G72<Integer>(44);
		G7<String> strObj1 = new G7<String>("bla");
		G72<String> strObj2 = new G72<String>("bla2");
		System.out.println(intObj1.getObj());
		System.out.println(intObj2.getObj());
		System.out.println(strObj1.getObj());
		System.out.println(strObj2.getObj());
		
		System.out.println("--------------");
		G7 raw = new G7 (new Integer(5));
		System.out.println(raw.getObj());
		G7<Integer> raw2 = new G7 (new Integer(6));
		System.out.println(raw2.getObj());
		G7<Integer> raw3 = new G7<> (new Integer(7));
		System.out.println(raw3.getObj());
		
		
	}

}

class G7<T>{
	T obj;
	G7(T o){obj = o;}
	T getObj(){
		System.out.print("getObj from G7 ");
		return obj;
	}
}

class G72<T> extends G6<T>{
	G72(T o){super(o);}
	@Override
	T getObj(){
		System.out.print("getObj from G72 ");
		return obj;
	}
}