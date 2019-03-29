/** version 1.1 obsolette
 *  - etude des chiffres cryptographiques
 * 	- generation de tableau de caracteres latins MAJUSCULES+minuscules+signes
 *  - chiffrement avec decallage des caracteres
 *  - encryption avec string fournis par user
 * 
 * 	inspiré par les exercices Darmangeat 9.* (cryptographie)
 * 
 *  2do maybe un algorytme simple de "vrais" encryption (pas 3DES ou AES bien sur)
 */
/**
 * @author HUGOT Yves (igor) aka _yamster
 *
 */
package crypto;

import java.util.Scanner;
import java.util.*;

public class CriptoV1 {
	private static char[] abc;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		abc = alfabet();
		//echoArr(abc);
		
		java.util.Scanner consoleIn = new Scanner(System.in);
		echo("*****************");
		echo("* Cryptographie *");
		echo("*****************");
		echo();
		echo("Entrez le texte à encoder");
		echo(0, "C'est à vous : ");
		String userStr = consoleIn.nextLine();
		//echo(userStr);
		
		//********************* test de roboustesse
		boolean retry=true;
		do {
			if(userStr.isEmpty()) {
				echo("pas de texte, recommencez en entrant votre texte");
			}
			else if(userStr.matches("[^0-9A-Za-z.,!? ]+")) {
				echo("des signes non admis sont presents, recommencez SVP");
				echo(0, "signes possibles ");
				echoArr(0, alfabet());
				echo();
			}
			else{retry=false;};
			if(retry) {userStr = consoleIn.nextLine();};
		}while(retry);
		
		//userStr = "Lorem ipsum dolor sit amet";
		echo("********************");
		echo("vous avez entré \"" + userStr + "\"");
		echo("pour avoir plus de texte on va en ajouter :\n");
		String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \n"
				+ "Sed non risus. Suspendisse lectus tortor, dignissim sit amet, \n"
				+ "adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. \n"
				+ "Maecenas ligula massa, varius a, semper congue, euismod non, mi. \n"
				+ "Proin porttitor, orci nec nonummy molestie, enim est \n"
				+ "eleifend mi, non fermentum diam nisl sit amet erat. Duis semper. \n"
				+ "Duis arcu massa, scelerisque vitae, consequat in, pretium a, enim. \n"
				+ "Pellentesque congue. Ut in risus volutpat libero pharetra tempor. \n"
				+ "Cras vestibulum bibendum augue. Praesent egestas leo in pede. \n"
				+ "Praesent blandit odio eu enim. Pellentesque sed dui ut augue \n"
				+ "blandit sodales. Vestibulum ante ipsum primis in faucibus orci \n"
				+ "luctus et ultrices posuere cubilia Curae; Aliquam nibh. Mauris ac \n"
				+ "mauris sed pede pellentesque fermentum. Maecenas adipiscing ante \n"
				+ "non diam sodales hendrerit.";
		userStr += " " + lorem;
		echo(userStr);
		echo("-----------------");
		echo("on va encrypter ce texte avec une clé simple");
		echo("-----------------");
		int ikey = 1;
		String userStrCrypted = encript(ikey, userStr);
		echo("texte crypté :\n\n" + userStrCrypted);
		echo();
		echo("-----------------");
		String userStrDecrypted = decript(ikey, userStrCrypted);
		echo("texte decrypté :\n(comparez à l'original)\n\n" + userStrDecrypted);
		echo();
		
		echo("-----------------");
		echo("on va encrypter ce texte avec une clé plus grande");
		echo("-----------------");
		ikey = 20;
		userStrCrypted = encript(ikey, userStr);
		echo("texte crypté :\n\n" + userStrCrypted);
		echo();
		echo("-----------------");
		userStrDecrypted = decript(ikey, userStrCrypted);
		echo("texte decrypté :\n(comparez à l'original)\n\n" + userStrDecrypted);
		echo();
		
		echo("*******************************");
		echo();
		echo("Encodage avec une clé fournie par utilisateur");
		echo(0, "Entrez votre clé numerique (nombre) : ");
		userStr = consoleIn.nextLine();
		
		//********************* test de roboustesse
		retry=true;
		do {
			if(userStr.isEmpty()) {
				echo("pas de clé, recommencez en entrant votre clé");
			}
			else if(userStr.matches("[^0-9]+")) {
				echo("des signes non admis sont presents, recommencez SVP");
				echo(0, "signes possibles ");
				echo(0, "0 1 2 3 4 5 6 7 8 9, ou combination (un nombre)");
				echo();
			}
			else if((Integer.parseInt(userStr))%abc.length == 0) {
				echo("mauvaise clé, recommencez SVP");
				echo();
			}
			else{retry=false;};
			if(retry) {userStr = consoleIn.nextLine();};
		}while(retry);
		
		echo("vous avez entré \"" + userStr + "\" comme clé");
		ikey = Integer.parseInt(userStr);
		if(ikey>=abc.length) {ikey = ikey % abc.length;};
		
		echo("-----------------");
		echo("on va encrypter le texte précédant avec votre clé");
		echo("-----------------");
		userStrCrypted = encript(ikey, userStrDecrypted);
		echo("texte crypté :\n\n" + userStrCrypted);
		echo();
		echo("-----------------");
		userStrDecrypted = decript(ikey, userStrCrypted);
		echo("texte decrypté :\n(comparez à l'original)\n\n" + userStrDecrypted);
		echo();
		
		consoleIn.close();//fermeture de Scanner
		
		echo("\n--------\nfin");
	};//fin main
	
	//generation de tableau de characteres latins MAJUSCULES+minuscules+signes
	private static char[] alfabet() {
		char[] abcd = new char[67];
		int ind=0;
		for (int i=48; i<=57; i++) {abcd[ind++]=((char)i);};//nombres
		for (int i=65; i<=90; i++) {abcd[ind++]=((char)i);};//MAJUSCULES
		for (int i=97; i<=122; i++) {abcd[ind++]=((char)i);};//minuscules
		abcd[62] = (char)32;//espace
		abcd[63] = (char)33;//exclamation !
		abcd[64] = (char)44;//virgule ,
		abcd[65] = (char)46;//point .
		abcd[66] = (char)63;//interrogation ?
		return abcd;
	};//fin alfabet
	
	private static String encript(int i, String str) {
		String st = "";
		for(int j=0; j<str.length(); j++)
			{st += decale(i, str.charAt(j), abc);};
		return st;
	};//fin encript
	private static String encript(String i, String str) {
		
		//nothing yet
		return str;
	};
	
	private static String decript(int i, String str) {
		String st = "";
		for(int j=0; j<str.length(); j++) 
			{st += decale((-i), str.charAt(j), abc);};
		return st;
	};//fin decript
	
	private static char decale(int offset, char c, char[] codingTable) {
		char ch = c;//si carractere n'est pas dans le tableau retourne meme caractere
		int codtabLen = codingTable.length;
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
	
	//raccourcis pour System.out.println();
	//des overloads
	private static void echo() {System.out.println();};
	private static void echo(char c) {System.out.println(c);};
	private static void echo(int i) {System.out.println(i);};
	private static void echo(String str) {System.out.println(str);};
	private static void echo(int i, String str) {if(i == 0)System.out.print(str);};
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
	
}
