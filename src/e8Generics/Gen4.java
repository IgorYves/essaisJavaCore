package e8Generics;

class Gen4 {
	
	public static void main(String[] args) {
		Integer[] nums = {1,2,3,4,5,6};
		if(isIn(2, nums))System.out.println("2 ok");
		if(!isIn(7, nums))System.out.println("7 nok");
		System.out.println();
		
		String[] strs = {"bla","bla1","bla2","bla3","bla4","bla5"};
		if(isIn("bla", strs))System.out.println("bla ok");
		
		boolean is = Gen4.<Integer, Integer>isIn(2, nums);
		System.out.println(is);
		
		System.out.println();
		GenConstruct test = new GenConstruct(100);
		GenConstruct test2 = new GenConstruct(100.55F);
		test.showValeur();
		test2.showValeur();
	}
	
	static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
		for(int i=0; i<y.length; i++) if(x.equals(y[i])) return true;
		return false;
	}

}

class GenConstruct{
	private double d;
	<T extends Number> GenConstruct(T arg) {d = arg.doubleValue();}
	void showValeur() {System.out.println(d);}
}