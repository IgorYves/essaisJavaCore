package projet01;

public class Test5 {

	public static void main(String[] args) {
		long ts = System.currentTimeMillis();
		System.out.println(ts);
		
		for(int i=0; i<100; i++) {
			ts = System.currentTimeMillis();
			System.out.println(ts);
		};

	}

}
