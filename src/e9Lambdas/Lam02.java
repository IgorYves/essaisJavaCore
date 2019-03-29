package e9Lambdas;

class Lam02 {

	public static void main(String[] args) {
		L2 rev = (str) -> {
			String rez = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rez += str.charAt(i);
			}
			return rez;
		};

		System.out.println(rev.f("lambda expression"));
	}
}

interface L2 {
	String f(String i);
}