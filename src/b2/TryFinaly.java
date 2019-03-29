package b2;

public class TryFinaly {

	public static void main(String[] args) {
		System.out.println(trFin());
		
	}
	
	private static int trFin() {
		try {
			System.out.println("trFin");
			return 1;
		}
		finally {
			System.out.println("finally");
		}
	}
}
