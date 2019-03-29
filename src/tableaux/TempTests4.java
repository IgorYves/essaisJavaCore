package tableaux;

import java.util.Arrays;
import java.util.Random;

public class TempTests4 {
	public static void main(String[] args) {
		String[] dictionnaire = {"abc", "def", "zkr", "kkk", "true", "nullle", 
				"not", "or", "kto", "zdes", "eer", "wvrt", "tost", "lyamb"};
		String str = "abc";
		
		System.out.println(getArrayIndex(str, dictionnaire));
		
		System.out.println("********************");
		Arrays.sort(dictionnaire);
		System.out.println(Arrays.toString(dictionnaire));
		
		System.out.println(getArrayIndex(str, dictionnaire, true, 0, dictionnaire.length));
		
		
		
	};
	
	private static int getArrayIndex (String c, String[] arr) {
		for(int i=0; i<arr.length; i++) {if(arr[i] == c) return i;};
		return -1;
	};
	private static int getArrayIndex (String c, String[] dict, boolean sorted, int deb, int fin) {
		if(sorted) {
			int half = (fin-deb)/2 + deb;
			int rsltCompare = c.compareTo(dict[half]);
			if (rsltCompare == 0) {return half;}
			else if((fin-deb) < 2) {return -1;}
			else if (rsltCompare < 0) {return getArrayIndex(c, dict, true, deb, half);}
			else if (rsltCompare > 0) {return getArrayIndex(c, dict, true, half, fin);}
			else {return -1;}
		} else {return getArrayIndex(c, dict);}
	}
}

