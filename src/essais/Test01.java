package essais;

public class Test01 {
	
	public static void main(String[] args) {
		Stack Stk = new Stack(5);
		int j=0;
		//System.out.println(j+"\t");
		while (Stk.put(++j)) {};
		
		System.out.println("------------");
		
		do {
			System.out.println(Stk.get());
		} while (Stk.currentPos>=0);
		
		System.out.println("------------");
		
		
		for(int i=1; i<12; i++) {
			System.out.println(i+"\t"+Stk.put(i));
		};
		
		
		System.out.println("------------");
		
		do {
			System.out.println(Stk.get());
		} while (Stk.currentPos>=0);
		
		/*for (int i=0; i<12; i++) {
			System.out.println(Stk.get());
		}*/
		
		
	}

}
