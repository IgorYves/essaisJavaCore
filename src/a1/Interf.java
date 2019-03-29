package a1;

class Interf {

	public static void main(String[] args) {
		Int.fun();

	}
}

interface Int {
	int ONE = 1;
	static void fun() {
		System.out.println("interface");
	}
}