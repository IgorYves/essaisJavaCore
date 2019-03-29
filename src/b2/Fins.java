package b2;

public class Fins {

	public static void main(String[] args) {
		System.out.println(fun());
		

	}

	private static int fun() {
		for (int i = 0; i < 1; i++) {
			
			try {
				return 1;
			}
			finally {
				break;
			}
		
		}
		return 2;
	}
	
}
