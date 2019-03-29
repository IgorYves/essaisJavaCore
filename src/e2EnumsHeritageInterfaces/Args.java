package e2EnumsHeritageInterfaces;

class Args {
	static int x = 1;
	public Args() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		System.out.println(fnct(x));
		System.out.println(x);
	}
	
	static int fnct(int a) {return ++a;};
	
	
	
}
