package eval.question;

import java.util.Scanner;

public class Quest3_Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 3\n" +
"L'utilisateur saisit 5 nombres maximum.\n"+
"Chaque nombre saisi est suivi de la touche [Entrée].\n"+
"La saisie est terminée quand les 5 nombres sont saisis ou si on entre le nombre zéro.\n"+
"Réafficher la liste des nombres saisis sous la forme d'une addition avec la somme de ses nombres.\n"+ 
"( exemple: 8 + 9 + 2 + 1  = 20 )\n"+
"*******************************************************************\n\n\n"
		);
		
///////////////////////// debut de travail
		int[] nombrs = {0,0,0,0,0};
		String userStr = "";
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		
		
		boolean retry=true;
		int compt = 0;
		do {
			System.out.print("Entrez votre nombre : ");
			userStr = ConsoleIn.nextLine();
			if(Integer.valueOf(userStr) == 0) {retry=false;}
			else{nombrs[compt++] = Integer.valueOf(userStr);};
		}while(retry && compt < 5);
		
		System.out.println("Resultat :");
		int sum = 0;
		for (int i=0; i<nombrs.length; i++) {
			if(i == 0) {System.out.print(nombrs[i]);}
			else if(nombrs[i] != 0) {System.out.print(" + " + nombrs[i]);}
			sum += nombrs[i];
		}
		System.out.print(" = " + sum);
		
		System.out.print("\n------------\n\tfin");
	}

}
