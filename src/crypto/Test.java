//ceci est un fichier des tests, tout code est utilisé en fichiers principales
package crypto;

class Test {
	static String key = "tabczf";
	static String str = "kabcdDFGefghijklmn58oprst";
	static char[] abc = {'a','b','c','d','e','f','g','h','i','k','l',
						'm','n','o','p','r','s','t','q','w','x','y','z'};
	static int salt = 80;
	
	public static void main(String[] args) {
		System.out.println("key : " + key);
		System.out.println("str : " + str);
		System.out.println("str encripted : " + encript(key, str));
	
	}
	
	private static String encript(String key, String str) {
		String st = "";
		//int i = 0;
		int currKey;
		char[] keyArr = key.toCharArray();
		int[] keyArrInt = new int[keyArr.length];
		for(int k=0; k<keyArr.length; k++) {
			keyArrInt[k] = getArrayIndex(keyArr[k], abc) + salt;
		};
		for(int j=0; j<str.length(); j++){
			currKey = keyArrInt[j%(keyArrInt.length)];
			st += decale(currKey, str.charAt(j), abc);
		};
		return st;
	}
	
	private static int getArrayIndex (char c, char[] arr) {
		for(int i=0; i<arr.length; i++) {if(arr[i] == c) return i;};
		return -1;
	};
	
	
	private static char decale(int offset, char c, char[] codingTable) {
		char ch = c;//si carractere n'est pas dans le tableau retourne meme caractere
		int codtabLen = codingTable.length;
		offset = offset%codtabLen;
		for(int i=0; i<codtabLen; i++) {
			if(c == codingTable[i]) {
				if((i+offset) < codtabLen && (i+offset) >= 0)
					{ch = codingTable[i+offset];break;}
				else if((i+offset) >= codtabLen)
					{ch = codingTable[i+offset-codtabLen];break;}
				else if((i+offset) < 0)
					{ch = codingTable[i+offset+codtabLen];break;};
			};
		};
		return ch;
	};//fin decale
	
}
