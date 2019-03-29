package e9Lambdas;

class Lam06 {
	private static int y = 5;
	public static void main(String[] args) {
		int num = 10;
		//num = 8;
		UneFunctn uneLambda = (x) -> {
			int val = num + x + y;
			//num++;
			//num = 9;
			y++;
			return val;
		};
		//num = 6;
		
	}
}

interface UneFunctn {
	int func(int i);
}