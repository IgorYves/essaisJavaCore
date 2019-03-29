package essais;

class Heritage3 {

	public static void main(String[] args) {
		A A1 = new A();
		System.out.println("------");
		AB AB1 = new AB();
		A1.x = 2;
		AB1.x = 5;
		AB1.y = 55;
		
		
		System.out.println("------");
		System.out.println("A1");
		A1.printVarA();
		
		
		System.out.println("------");
		System.out.println("AB1");
		AB1.printVarA();
		AB1.printVarS();
	}

}

class A {
	int x = 0;
	A(){
		System.out.println("constructeur A x = " + x);
	}
	void printVarA() {
		System.out.println("printVarA A x = " + x);
	};
	
};

class AB extends A {
	int x = 1;
	int y = 3;
	AB(){
		super();
		System.out.println("constructeur AB x = " + x);
		System.out.println("constructeur AB y = " + y);
	};
	void printVarS() {
		System.out.println("printVarS AB super.x = " + super.x);
		System.out.println("printVarS AB x = " + x);
		System.out.println("printVarS AB y = " + y);
	};
};