package eval.question;

import java.util.Scanner;

public class Quest6_PrenomLongTri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 6\n" +
"Demander 5 prénoms et les stocker dans un tableau.\n" +
"Les réafficher « triés » de telle sorte que le prénom le plus long\n" +
"soit en premier etc.\n" +
"Par exemple avec Didier, Bernard, Christine, Ahn, Ali\n" +
"Le programme affichera\n" +
"Christine, Bernard, Didier, Ahn, Ali\n" +
"*******************************************************************\n\n\n"
		);
		
///////////////////////// debut de travail
		String[] prenoms = new String[5];
		String userStr = "";
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		System.out.println("Entrez 5 prenoms SVP");
		boolean retry=true;
		int compt = 0;
		do {
			System.out.print("Entrez prenom : ");
			userStr = ConsoleIn.nextLine();
			if(userStr.length() != 0) {
				prenoms[compt++] = userStr;
			}
			else System.out.println("entre vide !!! recommencez SVP");
			if(compt >= 5)retry = false;
		}while(retry);
		ConsoleIn.close();//fermeture de Scanner
		//////// fin entrees utilisateur
		
		//echoArr(prenoms);
		
		String tmp;
		for (int i=1, j; i<prenoms.length; i++) {
			j = i;
			while(j>0 && prenoms[j-1].length()>prenoms[j].length()) {
				tmp = prenoms[j-1];
				prenoms[j-1] = prenoms[j];
				prenoms[j] = tmp;
				j--;
			};
		};

		System.out.println("Vos prenoms :");
		//echoArr(prenoms);
		
		for(int i=0; i < prenoms.length; i++) {
			System.out.print(prenoms[i] + (i<(prenoms.length-1)?", ":""));
		}
		System.out.print("\n------------\n\tfin");
		

	}//fin main
	
	//raccourcis pour System.out.println();
	//des overloads
	private static void echo() {
		System.out.println();
	};
	private static void echo(String str) {
		System.out.println(str);
	};
	private static void echo(int i, String str) {
		if(i == 0)System.out.print(str);
	};
	
	//print Array sur ecran sous forme {val, val, ...}
	//Integers
	private static void echoArr(int arr[]) {
		echo(0, "Integer Array[]={");
		for (int i=0; i<arr.length; i++) {
			echo(0, arr[i] + ((i == (arr.length - 1))?"":","));
		};
		echo(0, "}\n");
	};
	//Strings
	private static void echoArr(String arr[]) {
		echo(0, "String Array[]={\"");
		for (int i=0; i<arr.length; i++) {
			echo(0, arr[i] + ((i == (arr.length - 1))?"":"\",\""));
		};
		echo(0, "\"}\n");
		
	};
	
}
