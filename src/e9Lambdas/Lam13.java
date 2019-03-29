package e9Lambdas;

class Lam13 {

	public static void main(String[] args) {
		UneFunc13<Class13<Double>, Double> unClassConstr = Class13<Double>::new;
		Class13<Double> ucl = unClassFactory(unClassConstr, 10.22);
		System.out.println(ucl.getVal());
		
		UneFunc13<Class132, String> unClassConstr2 = Class132::new;
		Class132 ucl2 = unClassFactory(unClassConstr2, "bla");
		System.out.println(ucl2.getVal());
		
		System.out.println("----------");
		Class13<Double> ucl3 = unClassFactory(Class13<Double>::new, 565.55);
		System.out.println(ucl3.getVal());
		
		Class132 ucl4 = unClassFactory(Class132::new, "Lorem");
		System.out.println(ucl4.getVal());
		
		
	}
	
	static <R,T> R unClassFactory(UneFunc13<R,T> constr, T v) {
		return constr.func(v);
	}
}

class Class132 {
	String str;
	Class132(String s){str = s;}
	Class132(){str = "";}
	String getVal() {return str;}
}

class Class13<T> {
	private T val;
	Class13(T v){val = v;}
	Class13(){val = null;}
	T getVal() {return val;}
}

interface UneFunc13<R, T> {
	R func(T x);
}