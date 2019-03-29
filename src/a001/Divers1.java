/**
 * 
 */
package a001;

/**
 * @author YH
 *
 */
class Divers1 {

	/**
	 * @param args
	 * @author HY aka _yamster
	 */
	public static void main(String[] args) {
		
		allCombinations(3, 2, "");
		System.out.println("-----------");
		allCombinations2(3, 2, "");
		System.out.println("-----------");
		String x = "bla";
		x = null;
		x = "5";
		
		boolean b = true;
		boolean b1 = false;
		int i = b?1:0;
		int i1 = b1?1:0;
		System.out.println(i*2-1);
		System.out.println(i1*2-1);
	}

	private static void allCombinations(int numbr, int pos, String prefix) {
		if (pos < 1) {
			System.out.println(prefix);
			return;
		}
		for (int i = 0; i <= numbr; i++) {
			prefix += i;
			allCombinations(numbr, pos-1, prefix);
			prefix = prefix.substring(0, prefix.length()-1);
		}
	}

	private static void allCombinations2(int numbr, int pos, String prefix) {
		if (pos < 1) {
			System.out.println(prefix);
			return;
		}
		for (int i = 0; i <= numbr; i++) {
			if (prefix.indexOf(Integer.toString(i)) == -1) {
				prefix += i;
				allCombinations2(numbr, pos-1, prefix);
				prefix = prefix.substring(0, prefix.length()-1);
			}
		}
	}
	
	
	/*
	 * private static int[] delOneVal(int[] a, int pos) { int[] arr = new
	 * int[a.length - 1]; for (int i = 0, j = 0; i < a.length; i++) { if (i !=
	 * pos) arr[j++] = a[i]; } return arr; }
	 */

}
