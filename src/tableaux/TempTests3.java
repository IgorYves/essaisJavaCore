package tableaux;

public class TempTests3 {
	public static void main(String[] args) {
		
		TT2 o = new TT2();
		System.out.println(o.i);
		met(o);
		met(o);
		
		System.out.println(o.i);
		
		
	};
	
	static void met (TT2 obj) {
		obj.i += 2;
		
		
	};
	
	
	
}

