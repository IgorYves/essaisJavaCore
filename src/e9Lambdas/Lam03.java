package e9Lambdas;

class Lam03 {

	public static void main(String[] args) {
		L3<String> rev = (str) -> {
			String rez = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rez += str.charAt(i);
			}
			return rez;
		};
		
		L3<Integer> fact = (n) -> {
			int res = 1;
			for(int i=1; i<=n; i++) {res *=i;}
			return res;
		};
		
		System.out.println(rev.f("lambda expression"));
		System.out.println(fact.f(5));
		System.out.println(fact.f(10));
	}

}

interface L3<T> {
	T f(T i);
}