package tableaux;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class TriDichotomique {
	static final char[] CHARUSED = alfabet();
	static final int LMAXDICTRY = 1000;
	static final int LMAXWORD = 8;
	static final int LMINWORD = 3;
	static private String[] dictionnaire = new String[LMAXDICTRY];
	static private Random rnd = new Random();
	
	public static void main(String[] args) {
		
		java.util.Scanner consoleIn = new Scanner(System.in);
		echo("**************************");
		echo("* Recherche dichotomique *");
		echo("**************************");
		echo();
		echo("On genere un tableau de strings aleatoires");
		echo("\tmots dans dictionnaire : " + LMAXDICTRY);
		echo("\tmots de " + LMINWORD + " à " + LMAXWORD + " caracteres");
		
		int iDic = 0;
		while(iDic < LMAXDICTRY) {
			String word = genereteWord();
			if(getArrayIndex(word, dictionnaire) == -1) {
				dictionnaire[iDic] = word;
				iDic++;
			};
		};
		
		echo("---------------");
		echoArr(dictionnaire);
		echo("---------------");
		
		echo("on trie le tableau dans l'ordre alphabetique");
		Arrays.sort(dictionnaire);
		echo("---------------");
		echoArr(dictionnaire);
		echo("---------------");
		
		String userStr = "";
		boolean retryfind;
		do {
			retryfind = false;
			echo();
			echo("***************************");
			echo("Entrez le mot à rechercher dans le dictionnaire");
			echo(0, "C'est à vous : ");
			userStr = consoleIn.nextLine();
			boolean retry=true;
			do {
				if(userStr.isEmpty()) {echo("pas de mot, recommencez SVP");}
				else if(userStr.matches("[^a-zA-Z]+")) {
					echo("pas des nombres, recommencez SVP");
				}
				else{retry=false;};
				if(retry) {userStr = consoleIn.nextLine();};
			}while(retry);
			
			echo("---------------");
			int wordPstn = getArrayIndex(userStr, dictionnaire, true, 0, dictionnaire.length);
			if(wordPstn != -1) {
				echo("Votre mot \"" + userStr + "\" se trouve dans le dictionnaire "
															+ "(pos." + wordPstn + ")");
				
			}else {echo("Votre mot \"" + userStr + "\" ne se trouve pas dans le dictionnaire");};
			echo();
			echo("---------------");
			echo("Chercher encore ? \"y\" (yes) ou \"o\" (oui) pour continuer");
			echo(0, "C'est à vous : ");
			userStr = consoleIn.nextLine();
			if(userStr.equals("y") || userStr.equals("o")) {retryfind = true;};
		}while(retryfind);
		
		
		
		echo("\n\n--------\nfin");
		
		consoleIn.close();//fermeture de Scanner
	}//fin main
	
	private static String genereteWord() {
		String word = "";
		int wLength = LMINWORD;
		boolean go = true;
		do { wLength = rnd.nextInt(LMAXWORD);
			if(wLength > LMINWORD) {go = false;};
		} while(go);
		for(int i=0; i<wLength; i++) {
			word += CHARUSED[rnd.nextInt(CHARUSED.length)];
		};
		return word;
	};
	
	//generation de tableau de characteres latins minuscules
	private static char[] alfabet() {
		char[] abcd = new char[26];
		int ind=0;
		for (int i=97; i<=122; i++) {abcd[ind++]=((char)i);};//minuscules
		return abcd;
	};//fin alfabet
	
	//raccourcis pour System.out.println();
	//des overloads
	private static void echo() {System.out.println();};
	private static void echo(char c) {System.out.println(c);};
	private static void echo(int i) {System.out.println(i);};
	private static void echo(String str) {System.out.println(str);};
	private static void echo(int i, String str) {if(i == 0)System.out.print(str);};
	//Strings
	private static void echoArr(String arr[]) {
		echo(0, "String Array[]={\"");
		for (int i=0; i<arr.length; i++) {
			if((i+1)%5 == 0) {echo(0, arr[i] + ((i == (arr.length - 1))?"":"\",\n\t\t\""));}
			else {echo(0, arr[i] + ((i == (arr.length - 1))?"":"\",\""));};
		};
		echo(0, "\"}\n");
		
	};
	private static void echoArr(char arr[]) {
		echo(0, "Characters Array[]={");
		for (int i=0; i<arr.length; i++) {
			echo(0, arr[i] + ((i == (arr.length - 1))?"":","));
		};
		echo(0, "}\n");
	};//fin echoArr char
	private static void echoArr(int j, char arr[]) {
		if(j==0) {
			for (int i=0; i<arr.length; i++) {
				echo(0, arr[i] + ((i == (arr.length - 1))?"":" "));
			};
		};
	};//fin echoArr integer
	
	private static int getArrayIndex (char c, char[] arr) {
		for(int i=0; i<arr.length; i++) {if(arr[i] == c) return i;};
		return 0;
	};
	private static int getArrayIndex (String c, String[] arr) {
		for(int i=0; i<arr.length; i++) {if(arr[i] == c) return i;};
		return -1;
	};
	
	//recherche recursive dichotomique
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
