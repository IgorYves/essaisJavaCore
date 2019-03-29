package projet01;

import java.util.Scanner;
import java.util.Random;
/** darm 7.1
 * 
 */

/**
 * @author HUGOT Yves (igor) aka _yamster
 *
 */
public class primo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		//entr� utilisateur
		java.util.Scanner consoleIn = new Scanner(System.in);
		System.out.println("********************");
		System.out.println("* Tri des tableaux *");
		System.out.println("********************");
		System.out.println();
		System.out.println("Entrez des nombres separes par un espace :");
		String userStr = consoleIn.nextLine();
		boolean retry=true;
		do {
			if(userStr.isEmpty()) {
				System.out.println("pas d'arguments, recommencez en entrant des arguments");
			}
			else if(userStr.contains("  ")) {
				System.out.println("un seul espase entre les arguments, recommencez SVP");
			}
			else if(userStr.matches(".*[a-zA-Z]+.*")) {
				System.out.println("pas de lettres, uniquement des nombres, recommencez SVP");
			}
			else{retry=false;};
			if(retry) {userStr = consoleIn.nextLine();};
		}while(retry);
		
		
		System.out.println("*****************");
		System.out.println("vous avez entr� " + userStr.trim().split(" ").length + " argument" + (userStr.trim().split(" ").length>1?"s":""));
		System.out.println("vous arguments : " + userStr.intern());
		
		System.out.println("Pour avoir un tableau plus grand\n on va ajouter des nombres aleatoires :");
		Random rnd = new Random();
		int rndInt;
		for(int i=0; i<2; i++) {
			userStr += " " + rnd.nextInt(1000);
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
		//fin entr� utilisateur
		
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
				System.out.println("step "+ step);
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
		System.out.println("Tableau tri� :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println("-----------------");
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
			
			System.out.println("step "+ current);
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
		System.out.println("Tableau tri� :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");
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
			
			System.out.println("step "+ step);
			System.out.print("Integer Array[]={");
			for (int i=0; i<intArr.length; i++) {
				System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
			};
			System.out.print("}\n");
			System.out.println("-----------------");
			step++;
		}while(mastcontinue);
		
		System.out.println("-----------------");
		System.out.println("Tableau tri� :");
		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");
		System.out.println("Fin méthode 3");
		System.out.println("-----------------");
		
		//fin tri de tableau methode 3
		
		//merge de 2 tableaux tri�es
		System.out.println();
		System.out.println();
		System.out.println("*****************************");
		System.out.println("* Merge de 2 tableaux triés *");
		System.out.println("*****************************");
		System.out.println();
		System.out.println("On reutilise un tableau existant et on ajoute un autre");
		System.out.println("");
		

		
		
		
		
		
		
		System.out.println("--------\nfin");
		
		consoleIn.close();
	};
};
