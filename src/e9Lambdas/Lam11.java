package e9Lambdas;

class Lam11 {

	public static void main(String[] args) {
		UneFuncInterface11 unConstr11 = Class11::new;
		Class11 mc = unConstr11.func(100);
		System.out.println(mc.getVal());
	}
}

class Class11 {
	private int val;
	Class11(int v){val = v;}
	Class11(){val = 0;}
	int getVal() {return val;}
}

interface UneFuncInterface11 {
	Class11 func(int x);
}