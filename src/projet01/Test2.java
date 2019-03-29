/**
 * 
 */
package projet01;

import java.util.Random;

/**
 * @author y
 *
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int intArr[] = {7,6,5,4,3,2,1};
		String str = "lorem ipsum";
		//System.out.println(str);
		str = "dolor sit amet";
		System.out.println(str.intern());
		System.out.println();
		
		Random rnd = new Random(); 
		int rndInt = rnd.nextInt(10000); 
		System.out.println(rndInt);
	}

}
