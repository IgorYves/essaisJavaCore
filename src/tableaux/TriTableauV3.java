package tableaux;

import java.util.Scanner;
import java.util.Random;
import javax.swing.Box;

/** version 1.3 beta, utilisez V2 pour demo !!!!!!!!!!!!!!!!!!!!!
 *  - étude d'efficacité des differents méthodes de tri de tableaux
 *  	(les méthodes sont imaginé par moi même, 
 *  			mais doivent etre inventé depuis des lustres)
 *  - entrées utilisateur, verification des saisies, regex
 *  - tri des tableaux par differents methodes
 *  - affichage "step by step" et temps d'execution
 *  - merge des tableaux deja triés
 *  - surcharge des methodes (fonctions)
 *  - gestion de pluriels
 *  - etude de swing
 *  
 *  utilisation : Scanner, Random,
 *  			new, if/else, while, do/while, for, ternaire,
 *  			trim, split, isempty, contains, matches, 
 *  			nextin, parseint, currentTimeMillis, etc...
 *  
 *  inspiré par les exercices Darmangeat 7.* (tableaux)
 *  
 *  version 1.3 par rapport 1.0 :
 *  	dispatch des fonctions repetitives dans les methodes surchargés
 * 		affichage de temps d'execution
 * 		utilisation swing
 * 	
 *  2do : plusieurs objets, 
 *  		utilisation des variables de classe
 */
 
/**
 * @author HUGOT Yves (igor) aka _yamster
 */
public class TriTableauV3 {

	public static void main(String[] args) {
		//pour les tests de temps d'execution
		long timestamp1, timestamp2;
		
		//********************* entrée utilisateur
		java.util.Scanner consoleIn = new Scanner(System.in);
		echo("********************");
		echo("* Tri des tableaux *");
		echo("********************");
		echo();
		echo("Entrez des nombres separes par un espace");
		echo("(essayez aussi des lettres, $%&#, multiples espaces, etc.)");
		echo(0, "C'est à vous : ");
		String userStr = consoleIn.nextLine();
		
		//********************* test de roboustesse
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
		echoArr(userStrArr);//on affiche le tableau
		echo("-----------------");
		//********************* fin entrée utilisateur
		
		//********************* array-string 2 array-int
		echo("On convertit les strings en integers");
		int userIntArray[];
		userIntArray = new int[userStrArr.length];
		for(int i=0; i<userStrArr.length; i++) {
			userIntArray[i] = Integer.parseInt(userStrArr[i]);
		};
		echoArr(userIntArray);//on affiche le tableau
		echo("-----------------");
		//********************* fin array-string 2 array-int
		
		//********************* tri de tableau methode 1
		int[] intArr = userIntArray.clone();
		echo();
		echo("*********************************");
		echo("Méthode 1 pour trier le tableau :");
		echoArr(intArr);//on affiche le tableau
		echo("*********************************");
		//debut de tri de tableau ---------- ------------ ------------- ---------
		timestamp1 = System.currentTimeMillis();
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
				echoArr(intArr);//on affiche le tableau
				echo("-----------------");
				step++;
				//fin affichage step by step
			};
		};
		timestamp2 = System.currentTimeMillis();
		//fin de tri de tableau ---------- ------------ ------------- ---------
		echo("-----------------");
		echo("Tableau trié :");
		echoArr(intArr);//on affiche le tableau
		echo(step + " steps, " + (timestamp2-timestamp1) + " milliseconde" + ((timestamp2-timestamp1)>1?"s":""));
		echo("Fin méthode 1");
		echo("-----------------");
		//********************* fin tri de tableau methode 1
		
		//********************* tri de tableau methode 2
		intArr = userIntArray.clone();
		echo();
		echo("**************************************");
		echo("Méthode 2 pour trier le meme tableau :");
		echoArr(intArr);//on affiche le tableau
		echo("**************************************");
		//debut de tri de tableau ---------- ------------ ------------- ---------
		timestamp1 = System.currentTimeMillis();
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
			echoArr(intArr);//on affiche le tableau
			echo("-----------------");
			
			current++;
		}while(current<intArr.length);
		timestamp2 = System.currentTimeMillis();
		//fin de tri de tableau ---------- ------------ ------------- ---------
		echo("-----------------");
		echo("Tableau trié :");
		echoArr(intArr);//on affiche le tableau
		echo(current + " steps, " + (timestamp2-timestamp1) + " milliseconde" + ((timestamp2-timestamp1)>1?"s":""));
		echo("Fin méthode 2");
		echo("-----------------");
		//********************* fin tri de tableau methode 2
		
		//********************* tri de tableau methode 3
		intArr = userIntArray.clone();
		echo();
		echo("**************************************");
		echo("Méthode 3 pour trier le meme tableau :");
		echoArr(intArr);//on affiche le tableau
		echo("**************************************");
		
		//debut de tri de tableau ---------- ------------ ------------- ---------
		timestamp1 = System.currentTimeMillis();
		step=0;//pour affichage
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
			echoArr(intArr);//on affiche le tableau
			echo("-----------------");
			step++;
		}while(mastcontinue);
		timestamp2 = System.currentTimeMillis();
		//fin de tri de tableau ---------- ------------ ------------- ---------
		echo("-----------------");
		echo("Tableau trié :");
		echoArr(intArr);//on affiche le tableau
		echo(step + " steps, " + (timestamp2-timestamp1) + " milliseconde" + ((timestamp2-timestamp1)>1?"s":""));
		echo("Fin méthode 3");
		echo("-----------------");
		
		//********************* fin tri de tableau methode 3
		
		//********************* merge de 2 tableaux triées
		echo();
		echo();
		echo("*****************************");
		echo("* Merge de 2 tableaux triés *");
		echo("*****************************");
		echo();
		echo("On reutilise un tableau existant\n et on ajoute un autre");
		echo("");
		
		//premier tableau
		intArr = userIntArray.clone();
		echo("-----------------");
		echo("Premier tableau :");
		echoArr(intArr);//on affiche le tableau
		echo("-----------------");
		
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
		echo("Deuxiem tableau (generé par ordinateur) :");
		echoArr(machineIntArray);//on affiche le tableau
		
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
		echo("Premier tableau trié :");
		echoArr(intArr);//on affiche le tableau
		//fin de tri de tableau 1
		
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
		//fin de tri de tableau 2
		echo("-----------------");
		echo("Deuxiem tableau trié :");
		echoArr(machineIntArray);//on affiche le tableau
		echo("-----------------");
		
		//merge
		int[] resultArr = new int[(intArr.length+machineIntArray.length)];
		int fAindex = 0;
		int sAindex = 0;
		boolean secondArrFin = false;
		echoArr(resultArr);//on affiche le tableau
		for(int i=0; i<resultArr.length; i++) {
			if(fAindex<intArr.length && (secondArrFin || intArr[fAindex]<=machineIntArray[sAindex])) {
				resultArr[i] = intArr[fAindex];
				fAindex++;
			} else {
				resultArr[i] = machineIntArray[sAindex];
				if((sAindex+1)<machineIntArray.length) sAindex++;
				else secondArrFin = true;
			};
			echoArr(resultArr);//on affiche le tableau
		};
		
		echo("-----------------");
		echo("Resultat de fusion\n de deux tableaux triés\n (pas de concatenation) :");
		echoArr(resultArr);//on affiche le tableau
		echo("-----------------");
		
		echo("\n\n--------\nfin");
		
		consoleIn.close();//fermeture de Scanner
		
	};//fin main
	
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
