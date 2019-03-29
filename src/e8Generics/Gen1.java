package e8Generics;

class Gen1 {

	public static void main(String[] args) {
		G<Integer> iObj;
		iObj = new G<Integer>(55);
		iObj.showType();
		int var = iObj.getObj();
		System.out.println("var = " + var);
		System.out.println();
		
		G<String> strObj = new G<String>("un string");
		strObj.showType();
		String str = strObj.getObj();
		System.out.println("str = " + str);
		
		//iObj = strObj;
		//var = iObj.getObj();
	}
}

class G<T>{
	T obj;
	G(T o){obj = o;}
	T getObj() {return obj;}
	void showType() {System.out.println("type de T est : " + obj.getClass().getName());}
}