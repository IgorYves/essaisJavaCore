package e2EnumsHeritageInterfaces;

class Heritage4 {
	public static void main(String[] args) {
		//Pere P1 = new Pere();
		Fils F1 = new Fils(2, 3);
		SecondFils F2 = new SecondFils(4, 5);
		//System.out.println(P1.multiple());
		System.out.println(F1.multiple());
		System.out.println(F2.multiple());
		System.out.println("-----------");
		Pere PapaRef;
		//Paparef = P1;
		//System.out.println(Paparef.multiple());
		PapaRef = F1;
		System.out.println(PapaRef.multiple());
		PapaRef = F2;
		System.out.println(PapaRef.multiple());
		
	}
}

abstract class Pere {
	int x, y;
	abstract int multiple();
};

class Fils extends Pere {
	int x;
	int y;
	Fils(int x, int y){
		this.x = x;
		this.y = y;
	};
	int multiple() {return x*y;};
};

class SecondFils extends Pere {
	int x;
	int y;
	SecondFils(int x, int y){
		this.x = x;
		this.y = y;
	};
	int multiple() {return x*y+100;};
};