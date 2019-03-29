package e9Lambdas;

class Lam12 {

	public static void main(String[] args) {
		UneFunc12<Integer> unConstr12 = Class12<Integer>::new;
		Class12<Integer> mc = unConstr12.func(1001);
		System.out.println(mc.getVal());
	}
}

class Class12<T> {
	private T val;
	Class12(T v){val = v;}
	Class12(){val = null;}
	T getVal() {return val;}
}

interface UneFunc12<T> {
	Class12<T> func(T x);
}