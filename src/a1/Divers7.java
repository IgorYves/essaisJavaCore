package a1;

class Divers7 {
	static private int i = 0;
	int j;
	
	public static void main(String[] args) {
		Divers7 o = new Divers7(0);
		System.out.println("------------");
		
		
		System.out.println("----------------");
		
		System.out.println(o.fun2());
	}
	
	Divers7(int x) {
		System.out.println("constr " + i++);
	}
	
	
	
	
	static String fun() {
		System.out.println("stat");
		return "stat";
	}
	String fun2() {
		System.out.println("non stat");
		return fun();
	}
	
	
}

