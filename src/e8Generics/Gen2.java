package e8Generics;

class Gen2 {

	public static void main(String[] args) {
		G2<Integer, String> isObj = new G2<Integer, String>(55, "un string");
		isObj.showTypes();
		int var = isObj.getObj1();
		System.out.println("var1 = " + var);
		String str = isObj.getObj2();
		System.out.println("var2 = " + str);
		
		G2<Integer, Integer> isObj2 = new G2<Integer, Integer>(55, 66);
		isObj2.showTypes();
		System.out.println("var1 = " + isObj2.getObj1());
		System.out.println("var2 = " + isObj2.getObj2());
		
		System.out.println();
		G2<Integer, String> isObj3 = new G2<>(55666, "un stringgggggg");
		isObj3.showTypes();
		System.out.println(isObj3.getObj1());
		System.out.println(isObj3.getObj2());
	}
}

class G2<T, V>{
	T obj1;
	V obj2;
	G2(T o1, V o2){
		obj1 = o1;
		obj2 = o2;
	}
	T getObj1() {return obj1;}
	V getObj2() {return obj2;}
	void showTypes() {
		System.out.println("type de T est : " + obj1.getClass().getName());
		System.out.println("type de V est : " + obj2.getClass().getName());
	}
}