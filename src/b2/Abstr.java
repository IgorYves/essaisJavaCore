package b2;

public class Abstr {

	public static void main(String[] args) {
		long t1, t2, i, j;
		long diff1 = 0;
		long diff2 = 0;
		int genIter = 1_000_000_000;
		int intIter = 1_000;
		
		for (int k = 0; k < genIter; k++) {
			t1 = System.nanoTime();
			for (i = 0; i < intIter; i++) {}
			t2 = System.nanoTime();
			diff1 += t2 - t1;
			
			t1 = System.nanoTime();
			for (i = 0; i < intIter; ++i) {}
			t2 = System.nanoTime();
			diff2 += t2 - t1;
		}
		
		System.out.println(diff1/genIter);
		System.out.println(diff2/genIter);
		
	}
	
//	ClassAbstr fun() {
//		return 
//	}
}

abstract class ClassAbstr {
	public static int i = 1;
}