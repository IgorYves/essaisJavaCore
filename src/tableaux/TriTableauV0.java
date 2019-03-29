package tableaux;

import java.util.Scanner;
import java.util.Random;
/** version 1.0	 obsolette, voir TriTableauV1 !!!!!!!!!!!!!!!!!!!!!
 *  
 */

/**
 * @author HUGOT Yves (igor) aka _yamster
 *
 */
public class TriTableauV0 {

	/**
	 * @param args
	 */
	//exercices Darmangeat 7.* (tableaux)
	//version 1.0 (tout est dans main())
	//2do dispatch des fonctions repetitives dans les methodes
	public static void main(String[] args) {
		//entrée utilisateur
		java.util.Scanner consoleIn = new Scanner(System.in);
		System.out.println("********************");
		System.out.println("* Tri des tableaux *");
		System.out.println("********************");
		System.out.println();
		System.out.println("Entrez des nombres separes par un espace :");
		String userStr = consoleIn.nextLine();
		
		//test de roboustesse
		boolean retry=true;
		do {
			if(userStr.isEmpty()) {
				System.out.println("pas d'arguments, recommencez en entrant des arguments");
			}
			else if(userStr.contains("  ")) {
				System.out.println("un seul espase entre les arguments, recommencez SVP");
			}
			else if(userStr.matches("[^0-9]+")) {
				System.out.println("pas de lettres/signes, uniquement des nombres, recommencez SVP");
			}
			else{retry=false;};
			if(retry) {userStr = consoleIn.nextLine();};
		}while(retry);
		
		
		System.out.println("********************");
		System.out.println("vous avez entré " + userStr.trim().split(" ").length + " argument" + (userStr.trim().split(" ").length>1?"s":""));
		System.out.println("vos arguments : " + userStr.intern());
		System.out.println("-----------------");
		System.out.println("Pour avoir un tableau plus grand\n on va ajouter quelques nombres aleatoires :");
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
		System.out.println("total " + userStrArr.length + " arguments");
		System.out.println("tous arguments : " + userStr.intern());
		
		System.out.println("-----------------");
		System.out.println("On les place dans un tableau de chaines de characteres");
		System.out.print("String Array[]={\"");
		for (int i=0; i<userStrArr.length; i++) {
			System.out.print(userStrArr[i] + ((i == (userStrArr.length - 1))?"":"\",\""));
		};
		System.out.print("\"}\n");
		
		System.out.println("-----------------");
		//fin entrée utilisateur
		
		//array-string 2 array-int
		System.out.println("On convertit les strings en integers");
		int userIntArray[];
		userIntArray = new int[userStrArr.length];
		for(int i=0; i<userStrArr.length; i++) {
			userIntArray[i] = Integer.parseInt(userStrArr[i]);
		};
		System.out.print("Integer Array[]={");
		for (int i=0; i<userIntArray.length; i++) {
			System.out.print(userIntArray[i] + ((i == (userIntArray.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println("-----------------");
		//fin array-string 2 array-int
		
		//tri de tableau methode 1
		int[] intArr = userIntArray;
		System.out.println();
		System.out.println("*********************************");
		System.out.println("Méthode 1 pour trier le tableau :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println("*********************************");
		
		int step=0;
		for (int i=1, j, tmp; i<intArr.length; i++) {
			j = i;
			while(j>0 && intArr[j-1]>intArr[j]) {
				tmp = intArr[j-1];
				intArr[j-1] = intArr[j];
				intArr[j] = tmp;
				j--;
				
				//affichage step by step
				System.out.println("step "+ (step+1));
				System.out.print("Integer Array[]={");
				for (int k=0; k<intArr.length; k++) {
					System.out.print(intArr[k] + ((k == (intArr.length - 1))?"":","));
				};
				System.out.print("}\n");
				System.out.println("-----------------");
				step++;
				//fin affichage step by step
			};
		};
		
		System.out.println("-----------------");
		System.out.println("Tableau trié :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println(step + " steps");
		System.out.println("Fin méthode 1");
		System.out.println("-----------------");
		//fin tri de tableau methode 1
		
		//tri de tableau methode 2
		int userIntArray2[];
		userIntArray2 = new int[userStrArr.length];
		for(int i=0; i<userStrArr.length; i++) {
			userIntArray2[i] = Integer.parseInt(userStrArr[i]);
		};
		intArr = userIntArray2;
		System.out.println();
		System.out.println("**************************************");
		System.out.println("Méthode 2 pour trier le meme tableau :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println("**************************************");
		
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
			
			System.out.println("step "+ (current+1));
			System.out.print("Integer Array[]={");
			for (int i=0; i<intArr.length; i++) {
				System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
			};
			System.out.print("}\n");
			System.out.println("-----------------");
			
			current++;
		}while(current<intArr.length);
		
		
		/*System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");*/
		
		System.out.println("-----------------");
		System.out.println("Tableau trié :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println(current + " steps");
		System.out.println("Fin méthode 2");
		System.out.println("-----------------");
		//fin tri de tableau methode 2
		
		//tri de tableau methode 3
		int userIntArray3[];
		userIntArray3 = new int[userStrArr.length];
		for(int i=0; i<userStrArr.length; i++) {
			userIntArray3[i] = Integer.parseInt(userStrArr[i]);
		};
		intArr = userIntArray3;
		System.out.println();
		System.out.println("**************************************");
		System.out.println("Méthode 3 pour trier le meme tableau :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println("**************************************");
		
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
			
			System.out.println("step "+ (step+1));
			System.out.print("Integer Array[]={");
			for (int i=0; i<intArr.length; i++) {
				System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
			};
			System.out.print("}\n");
			System.out.println("-----------------");
			step++;
		}while(mastcontinue);
		
		System.out.println("-----------------");
		System.out.println("Tableau trié :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println(step + " steps");
		System.out.println("Fin méthode 3");
		System.out.println("-----------------");
		
		//fin tri de tableau methode 3
		
		//merge de 2 tableaux triées
		System.out.println();
		System.out.println();
		System.out.println("*****************************");
		System.out.println("* Merge de 2 tableaux triés *");
		System.out.println("*****************************");
		System.out.println();
		System.out.println("On reutilise un tableau existant\n et on ajoute un autre");
		System.out.println("");
		
		//premier tableau
		int userIntArray4[];
		userIntArray4 = new int[userStrArr.length];
		for(int i=0; i<userStrArr.length; i++) {
			userIntArray4[i] = Integer.parseInt(userStrArr[i]);
		};
		intArr = userIntArray4;
		//System.out.println();
		System.out.println("-----------------");
		System.out.println("Premier tableau :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");
		
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
		System.out.println();
		System.out.println("Deuxième tableau (generé par ordinateur) :");
		System.out.print("Integer Array2[]={");
		for (int i=0; i<machineIntArray.length; i++) {
			System.out.print(machineIntArray[i] + ((i == (machineIntArray.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println("-----------------");
		
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
		System.out.println("-----------------");
		System.out.println("Premier tableau trié :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");
		
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
		System.out.println("-----------------");
		System.out.println("Deuxième tableau trié :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<machineIntArray.length; i++) {
			System.out.print(machineIntArray[i] + ((i == (machineIntArray.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println("-----------------");
		
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
		
		System.out.println("-----------------");
		System.out.println("Resultat de fusion\n de deux tableaux triés\n (pas concatenation) :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<resultArr.length; i++) {
			System.out.print(resultArr[i] + ((i == (resultArr.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println("-----------------");
		
		//System.out.println("!!!!!!!!!! pas terminé, travail en cours !!!!!!!!!!");
		System.out.println("\n\n--------\nfin");
		
		consoleIn.close();
	};
};
