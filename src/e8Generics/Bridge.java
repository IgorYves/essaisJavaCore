package e8Generics;

class Bridge {

	public static void main(String[] args) {
		GB2 strObj1 = new GB2("bla");
		System.out.println(strObj1.getObj());
	}
}

class GB<T>{
	T obj;
	GB(T o){obj = o;}
	T getObj(){
		System.out.print("getObj from GB ");
		return obj;
	}
}

class GB2 extends G6<String>{
	GB2(String o){super(o);}
	@Override
	String getObj(){
		System.out.print("getObj from GB2 ");
		return obj;
	}
}