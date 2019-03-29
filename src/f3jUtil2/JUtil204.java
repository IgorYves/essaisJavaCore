package f3jUtil2;

import java.util.Date;
import java.util.Random;

class JUtil204 {

	public static void main(String[] args) {
		Random r = new Random((new Date()).getTime());
		int[] x = new int[10];
		for (int i = 0; i < 100000; i++) {
			x[r.nextInt(10)]++;
		}
		
		for (int i : x) {
			System.out.println(i);
		}
		System.out.println("-------------");
		double y = 0;
		for (int i = 0; i < 100; i++) {
			System.out.println(r.nextGaussian());
		}
		
		
		
		
		
		
		
		
	}
}
