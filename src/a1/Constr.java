package a1;

public class Constr {
	
	Constr() {
		System.out.println("constr");
		if (true) return;
		System.out.println("after return");
	}
	public static void main(String[] args) {
		new Constr();

	}

}
