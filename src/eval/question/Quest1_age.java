package eval.question;

import java.util.Scanner;

public class Quest1_age {

	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 1\n" +
"On veut savoir quand une mère aura le double de l'âge de son fils.\n"+
"Lecture au clavier des 2 âges et présentation du résultat.\n"+
"*******************************************************************\n\n\n"
		);
		
///////////////////////// debut de travail
		int ageMere = 0;
		int ageFils = 0;
		String userStr = "";
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		
		System.out.print("Entrez l'age de la mere : ");
		userStr = ConsoleIn.nextLine();
		//********************* test de roboustesse
		boolean retry=true;
		do {
			if(userStr.isEmpty()) {
				System.out.println("pas d'entrée, recommencez SVP");
			}
			else if(userStr.matches("[^0-9]")) {
				System.out.println("des signes non admis sont presents, recommencez SVP");
			}
			else if(Integer.valueOf(userStr) > 100) {
				System.out.println("L'age est trop grand, recommencez SVP");
			}
			else{retry=false;};
			if(retry) {userStr = ConsoleIn.nextLine();};
		}while(retry);
		//********************* fin test de roboustesse
		ageMere = Integer.valueOf(userStr);
		
		System.out.println();
		System.out.print("Entrez l'age du fils : ");
		userStr = ConsoleIn.nextLine();
		//********************* test de roboustesse
		retry=true;
		do {
			if(userStr.isEmpty()) {
				System.out.println("pas d'entrée, recommencez SVP");
			}
			else if(userStr.matches("[^0-9]")) {
				System.out.println("des signes non admis sont presents, recommencez SVP");
			}
			else if(Integer.valueOf(userStr) > 100) {
				System.out.println("L'age est trop grand, recommencez SVP");
			}
			else if(Integer.valueOf(userStr) > ageMere) {
				System.out.println("L'age de fils est plus grand que l'age de la mere, recommencez SVP");
			}
			else if(Integer.valueOf(userStr) > ageMere/2) {
				System.out.println("Le double d'age de fils est deja plus grand "
								+ "\n\tque l'age de la mere, recommencez SVP");
			}
			else{retry=false;};
			if(retry) {userStr = ConsoleIn.nextLine();};
		}while(retry);
		//********************* fin test de roboustesse
		ageFils = Integer.valueOf(userStr);
		
		System.out.println();
		System.out.println(" vos entrées :");
		System.out.println(" age de mere : " + ageMere + "\n age de fils : " + ageFils);
		System.out.println();
		int ageMereOld = ageMere;
		int ageFilsOld = ageFils;
		int annees = 0;
		do {
			annees++;
			ageMereOld++;
			ageFilsOld++;
		}while(ageMereOld > (ageFilsOld*2));
		
		System.out.println(" Dans " + annees + " années mere aura " + ageMereOld 
											+ " et fils aura " + ageFilsOld);
		
		
		System.out.print("\n------------\n\tfin");
		ConsoleIn.close();//fermeture de Scanner

	}//fin main

}
