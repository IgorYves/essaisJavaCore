package a1;

class Divers4 {
	
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1|true);
		System.out.println(b2|true);
		System.out.println(b1|false);
		System.out.println(b2|false);
		System.out.println("--------------");
		System.out.println(b1&true);
		System.out.println(b2&true);
		System.out.println(b1&false);
		System.out.println(b2&false);
		System.out.println("--------------");
		System.out.println(true^true);
		System.out.println(false^true);
		System.out.println(true^false);
		System.out.println(false^false);
		System.out.println("--------------");
		for (int i = 0; i < 10; i++) {
			System.out.println(b1^=true);
		}
		
		
		
	}
}
