package a1;

public class Herit {

	public static void main(String[] args) {
		//Fis.metPI();
		//Fis.metPS();

	}
}

class Pap {
	static void metPS() {System.out.println("metPS");}
	void metPI() {System.out.println("metPI");}
}
class Fis extends Pap {
	//void metPS() {System.out.println("metFI");}
	//static void metPI() {System.out.println("metFS");}
}