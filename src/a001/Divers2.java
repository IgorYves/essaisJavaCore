/**
 * 
 */
package a001;

/**
 * @author YH
 *
 */
class Divers2 {
	/**
	 * @param args
	 * @author HY aka _yamster
	 */
	public static void main(String[] args) {
		
		System.out.println(Div22.var);
		System.out.println("------------------");
		Div22 obj22;
		System.out.println("------------------");
		obj22 = new Div22();
		System.out.println("------------------");
		Div22 obj222;
		System.out.println("------------------");
		obj222 = new Div22();
		System.out.println("------------------");
		System.out.println(Div22.var);
		
	}
}

class Div21 {
	Div21() {
		System.out.println("Div21 constr");
	}
	Div21(int i) {
		System.out.println("Div21 constr " + i);
	}
	static {
		System.out.println("Div21 after constr static");
	}
	{
		System.out.println("Div21 after constr");
	}
}

class Div22 extends Div21 {
	public static int var;
	{
		System.out.println("Div22 before constr");
	}
	
	Div22() {
		super(5);
		System.out.println("Div22 constr");
	}
	{
		System.out.println("Div22 after constr");
	}
	static {
		System.out.println("Div22 after constr static");
		var = 5;
	}
	
}

class Div23 {
	Div23() {
		System.out.println("Div23 constr");
	}
	static {
		System.out.println("Div23 after constr static");
	}
}