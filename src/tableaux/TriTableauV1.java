package tableaux;

import java.util.Scanner;
import java.util.Random;
/** version 1.1	 obsolette, voir TriTableauV2 !!!!!!!!!!!!!!!!!!!!!
 * 
 */

/**
 * @author HUGOT Yves (igor) aka _yamster
 *
 */
public class TriTableauV1 {

	/**
	 * @param args
	 */
	//exercices Darmangeat 7.* (tableaux)
	//version 1.1 dispatch des fonctions repetitives dans les methodes surchargés
	//2do differents objets
	public static void main(String[] args) {
		//entrée utilisateur
		java.util.Scanner consoleIn = new Scanner(System.in);
		echo("********************");
		echo("* Tri des tableaux *");
		echo("********************");
		echo();
		echo("Entrez des nombres separes par un espace");
		echo("(essayez aussi des lettres, $%&#, multiples espaces, etc.)");
		echo(0, "C'est à vous : ");
		String userStr = consoleIn.nextLine();
		
		//test de roboustesse
		boolean retry=true;
		do {
			if(userStr.isEmpty()) {
				echo("pas d'arguments, recommencez en entrant des arguments");
			}
			else if(userStr.contains("  ")) {
				echo("un seul espase entre les arguments, recommencez SVP");
			}
			else if(userStr.matches("[^0-9]+")) {
				echo("pas de lettres/signes, uniquement des nombres, recommencez SVP");
			}
			else{retry=false;};
			if(retry) {userStr = consoleIn.nextLine();};
		}while(retry);
		
		
		echo("********************");
		echo("vous avez entré " + userStr.trim().split(" ").length + " argument" + (userStr.trim().split(" ").length>1?"s":""));
		echo("vos arguments : " + userStr.intern());
		echo("-----------------");
		echo("Pour avoir un tableau plus grand\n on va ajouter quelques nombres aleatoires :");
		userStr = userStr.trim();
		//on ajoute nombre aleatoire (de 4 à 9) des nombres aleatoires (de 0 à 10000)
		Random rnd = new Random();
		for(int i=0; i<2; i++) {
			userStr += " " + rnd.nextInt(10000);
			userStr += " " + rnd.nextInt(100);
		};
		for(int i=0; i<rnd.nextInt(5); i++) {
			userStr += " " + rnd.nextInt(100);
		};
		
		String[] userStrArr = userStr.trim().split(" ");
		echo("total " + userStrArr.length + " arguments");
		echo("tous arguments : " + userStr.intern());
		
		echo("-----------------");
		echo("On les place dans un tableau de chaines de characteres");
		echoArr(userStrArr);
		echo("-----------------");
		//fin entrée utilisateur
		
		//array-string 2 array-int
		echo("On convertit les strings en integers");
		int userIntArray[];
		userIntArray = new int[userStrArr.length];
		for(int i=0; i<userStrArr.length; i++) {
			userIntArray[i] = Integer.parseInt(userStrArr[i]);
		};
		echoArr(userIntArray);
		echo("-----------------");
		//fin array-string 2 array-int
		
		//tri de tableau methode 1
		int[] intArr = userIntArray;
		echo();
		echo("*********************************");
		echo("Méthode 1 pour trier le tableau :");
		echoArr(intArr);
		echo("*********************************");
		
		int step=0;
		for (int i=1, j, tmp; i<intArr.length; i++) {
			j = i;
			while(j>0 && intArr[j-1]>intArr[j]) {
				tmp = intArr[j-1];
				intArr[j-1] = intArr[j];
				intArr[j] = tmp;
				j--;
				
				//affichage step by step
				echo("step "+ (step+1));
				echoArr(intArr);
				echo("-----------------");
				step++;
				//fin affichage step by step
			};
		};
		
		echo("-----------------");
		echo("Tableau trié :");
		echoArr(intArr);
		echo(step + " steps");
		echo("Fin méthode 1");
		echo("-----------------");
		//fin tri de tableau methode 1
		
		//tri de tableau methode 2
		int userIntArray2[];
		userIntArray2 = new int[userStrArr.length];
		for(int i=0; i<userStrArr.length; i++) {
			userIntArray2[i] = Integer.parseInt(userStrArr[i]);
		};
		intArr = userIntArray2;
		echo();
		echo("**************************************");
		echo("Méthode 2 pour trier le meme tableau :");
		echoArr(intArr);
		echo("**************************************");
		
		int temp, current=0, min=0, minval;
		do {
			minval = intArr[current];
			min=current;
			for (int i=current+1; i<intArr.length; i++) {
				if(minval>intArr[i]){
					min=i;
					minval = intArr[i];
				};
			};
			if(min>current){
				temp = intArr[current];
				intArr[current] = intArr[min];
				intArr[min] = temp;
			};
			
			echo("step "+ (current+1));
			echoArr(intArr);
			echo("-----------------");
			
			current++;
		}while(current<intArr.length);
		
		echo("-----------------");
		echo("Tableau trié :");
		echoArr(intArr);
		echo(current + " steps");
		echo("Fin méthode 2");
		echo("-----------------");
		//fin tri de tableau methode 2
		
		//tri de tableau methode 3
		int userIntArray3[];
		userIntArray3 = new int[userStrArr.length];
		for(int i=0; i<userStrArr.length; i++) {
			userIntArray3[i] = Integer.parseInt(userStrArr[i]);
		};
		intArr = userIntArray3;
		echo();
		echo("**************************************");
		echo("Méthode 3 pour trier le meme tableau :");
		echoArr(intArr);
		echo("**************************************");
		
		step=0;//pour affichage
		//tri
		boolean mastcontinue = true;
		do {
			mastcontinue = false;
			for(int i=1; i<intArr.length; i++) {
				if(intArr[i-1]>intArr[i]) {
					temp = intArr[i-1];
					intArr[i-1] = intArr[i];
					intArr[i] = temp;
					mastcontinue = true;
				};
			};
			
			echo("step "+ (step+1));
			echoArr(intArr);
			echo("-----------------");
			step++;
		}while(mastcontinue);
		
		echo("-----------------");
		echo("Tableau trié :");
		echoArr(intArr);
		echo(step + " steps");
		echo("Fin méthode 3");
		echo("-----------------");
		
		//fin tri de tableau methode 3
		
		//merge de 2 tableaux triées
		echo();
		echo();
		echo("*****************************");
		echo("* Merge de 2 tableaux triés *");
		echo("*****************************");
		echo();
		echo("On reutilise un tableau existant\n et on ajoute un autre");
		echo("");
		
		//premier tableau
		int userIntArray4[];
		userIntArray4 = new int[userStrArr.length];
		for(int i=0; i<userStrArr.length; i++) {
			userIntArray4[i] = Integer.parseInt(userStrArr[i]);
		};
		intArr = userIntArray4;
		//echo();
		echo("-----------------");
		echo("Premier tableau :");
		echoArr(intArr);
		
		//on fabrique deuxieme tableau
		//Random rnd = new Random();//deja fait plus haut
		String machineStr = "";
		for(int i=0; i<3; i++) {
			machineStr += " " + rnd.nextInt(1000);
			machineStr += " " + rnd.nextInt(100);
		};
		for(int i=0; i<rnd.nextInt(5); i++) {
			machineStr += " " + rnd.nextInt(100);
		};
		
		String[] machineStrArr = machineStr.trim().split(" ");
		int machineIntArray[];
		machineIntArray = new int[machineStrArr.length];
		for(int i=0; i<machineStrArr.length; i++) {
			machineIntArray[i] = Integer.parseInt(machineStrArr[i]);
		};
		echo();
		echo("Deuxième tableau (generé par ordinateur) :");
		echoArr(machineIntArray);
		
		//tri tableau 1
		mastcontinue = true;
		do {
			mastcontinue = false;
			for(int i=1; i<intArr.length; i++) {
				if(intArr[i-1]>intArr[i]) {
					temp = intArr[i-1];
					intArr[i-1] = intArr[i];
					intArr[i] = temp;
					mastcontinue = true;
				};
			};
		}while(mastcontinue);
		echo("-----------------");
		echoArr(intArr);
		
		//tri tableau 2
		mastcontinue = true;
		do {
			mastcontinue = false;
			for(int i=1; i<machineIntArray.length; i++) {
				if(machineIntArray[i-1]>machineIntArray[i]) {
					temp = machineIntArray[i-1];
					machineIntArray[i-1] = machineIntArray[i];
					machineIntArray[i] = temp;
					mastcontinue = true;
				};
			};
		}while(mastcontinue);
		echo("-----------------");
		echo("Deuxième tableau trié :");
		echoArr(machineIntArray);
		
		//merge
		int[] resultArr = new int[(intArr.length+machineIntArray.length)];
		int fAindex = 0;
		int sAindex = 0;
		boolean secondArrFin = false;
		for(int i=0; i<resultArr.length; i++) {
			if(fAindex<intArr.length && (secondArrFin || intArr[fAindex]<=machineIntArray[sAindex])) {
				resultArr[i] = intArr[fAindex];
				fAindex++;
			} else {
				resultArr[i] = machineIntArray[sAindex];
				if((sAindex+1)<machineIntArray.length) sAindex++;
				else secondArrFin = true;
			};
		};
		
		echo("-----------------");
		echo("Resultat de fusion\n de deux tableaux triés\n (pas de concatenation) :");
		echoArr(resultArr);
		echo("-----------------");
		
		echo("\n\n--------\nfin");
		
		consoleIn.close();
		
	};
	
	//raccourcis pour System.out.println();
	//essai des overloads
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
	
	
};
