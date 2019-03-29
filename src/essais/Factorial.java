package essais;

public class Factorial {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + "! = " + fact(i));
		}
		
	}
	
	private static long fact(int i) {
		if (i<=1)return 1;
		else return i*fact(i-1);
	};
	
}
