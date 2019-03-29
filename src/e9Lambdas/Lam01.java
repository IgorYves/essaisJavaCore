package e9Lambdas;

class Lam01 {

	public static void main(String[] args) {
		L1 fact = (n) -> {
			int res = 1;
			for(int i=1; i<=n; i++) {res *=i;}
			return res;
		};
		L1 pwr = (n) -> {
			return n*n;
		};
		System.out.println(fact.f(3));
		System.out.println(pwr.f(3));
		System.out.println(fact.f(10));
		System.out.println(pwr.f(10));
		
	}
}

interface L1{
	int f(int i);
}