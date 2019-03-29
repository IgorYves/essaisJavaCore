package e8Generics;

class NGen {

	public static void main(String[] args) {
		NG iObj;
		iObj = new NG(55);
		iObj.showType();
		int var = (Integer)iObj.getObj();
		System.out.println("var = " + var);
		System.out.println();
		
		NG strObj = new NG("un string");
		strObj.showType();
		String str = (String)strObj.getObj();
		System.out.println("str = " + str);
		
		//iObj = strObj;
		//var = (Integer)iObj.getObj();
	}
}

class NG{
	Object obj;
	NG(Object o){obj = o;}
	Object getObj() {return obj;}
	void showType() {System.out.println("type de NG est : " + obj.getClass().getName());}
}