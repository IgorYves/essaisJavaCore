package e9Lambdas;

class Lam15 {

	public static void main(String[] args) {
		int y = 10;
		Fn lambd = (n) -> {
			int v = y + n;
			//y++;
			return v;
		};
		//y++;
	}
}

interface Fn {int f(int x);}