package e8Generics;

class NonGen {

	public static void main(String[] args) {
		Gn<String> ob = new Gn<String>("salut", 55);
		System.out.println(ob.getNum());
		System.out.println(ob.getObj());
	}

}

class NGn{
	int num;
	NGn(int i){	num = i;}
	int getNum() {return num;}
}

class Gn<T> extends NGn{
	T obj;
	Gn(T o, int i){
		super(i);
		obj = o;
	}
	T getObj() {return obj;}
}