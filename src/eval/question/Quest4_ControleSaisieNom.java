package eval.question;

import java.util.Scanner;

public class Quest4_ControleSaisieNom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 4\n" +
"On demande la saisie d’un nom de famille.\n"+
"La saisie sera redemandée tant que :\n"+
"	le nom contiendra un caractère numérique ,\n"+
"	La longueur sera inférieure à 2,\n"+
"	La longueur sera supérieure à 10 .\n"+
"*******************************************************************\n\n\n"
		);
		
		
///////////////////////// debut de travail
		String userStr = "";
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		
		System.out.print("Entrez votre nom de famille : ");
		userStr = ConsoleIn.nextLine();
		//********************* test de roboustesse
		boolean retry=true;
		do {
			if(userStr.isEmpty()) {
				System.out.println("pas d'entrée, recommencez SVP");
			}
			else if(userStr.matches(".*[0-9]+.*")) {
				System.out.println("des signes non admis sont presents, recommencez SVP");
			}
			else if(userStr.length() > 10) {
				System.out.println("nom est trop grand, recommencez SVP");
			}
			else if(userStr.length() < 2) {
				System.out.println("nom est trop petit, recommencez SVP");
			}
			else{retry=false;};
			if(retry) {userStr = ConsoleIn.nextLine();};
		}while(retry);
		//********************* fin test de roboustesse
		
		System.out.println("Nom de famille saisie : " + userStr);
		
		

		System.out.print("\n------------\n\tfin");
		ConsoleIn.close();//fermeture de Scanner

	}//fin main

}
