package ex11;

class Item2 {
	private static final double taux = 6.55957;
	
	public static void main(String[] args) {
		tracerLigne();
		System.out.println();
		tracerLigne(15);
		System.out.println();
		tracerLigne(10, 'b');
		System.out.println();
		tracerLigne('k', 5);
		System.out.println();
		
	}

	public static void tracerLigne() {
		for (int i=0; i<20; i++) {System.out.print("-");}
		System.out.println();
	}
	public static void tracerLigne(int j) {
		for (int i=0; i<j; i++) {System.out.print("-");}
		System.out.println();
	}
	public static void tracerLigne(int j, char c) {
		for (int i=0; i<j; i++) {System.out.print(c);}
		System.out.println();
	}
	public static void tracerLigne(char c, int j) {
		if(j <= 0) {System.out.println();}
		else {
			System.out.print(c);
			tracerLigne(c, --j);
		}
	}
	
	
}
