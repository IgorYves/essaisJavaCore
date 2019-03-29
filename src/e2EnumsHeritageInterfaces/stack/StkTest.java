package e2EnumsHeritageInterfaces.stack;

class StkTest {

	public static void main(String[] args) {
		InterfaceStack is;
		FxdStack fs = new FxdStack(5);
		DynStack ds = new DynStack(5);
		
		is = fs;
		for (int i = 0; i < 10; i++) {is.put(i);}
		is = ds;
		for (int i = 0; i < 10; i++) {is.put(i);}
		
		System.out.println("fix");
		is = fs;
		for (int i = 0; i < 10; i++) {System.out.println(i + " " + is.get());}
		System.out.println("---------------");
		System.out.println("dyn");
		is = ds;
		for (int i = 0; i < 10; i++) {System.out.println(i + " " + is.get());}
		System.out.println("---------------");
		System.out.println(is.isEmpty());
		System.out.println(InterfaceStack.getConst());
	}

}
