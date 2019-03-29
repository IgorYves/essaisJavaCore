package eval.question;

import java.util.Random;

public class Quest7_De {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 7\n" +
"Lancer un dé ( valeur aléatoire de 1 à 6 ) 15 fois.\n" + 
"Afficher les sorties et  afficher le nombre de sorties du\n" +
"chiffre 1, de 2, de 3, de 4, de 5 et de 6\n" +
"*******************************************************************\n\n\n"
		);
		
		
///////////////////////// debut de travail
		int curr;
		int[] stats = new int[6];
		Random rnd = new Random();
		for(int i=0; i<15; i++) {
			curr = rnd.nextInt(6);
			System.out.print((curr+1) + " ");
			stats[curr]++;
		}
		System.out.println();
		System.out.println();
		for(int i=0; i<stats.length; i++) {
			System.out.println((i+1) + " : " + stats[i] + " fois");
		}
		
		System.out.println();
		System.out.println("pour les statistiques lancement 1000 fois "
									+ "\n\tsans affichage de coups");
		
		for(int i=0; i<1000; i++) {
			curr = rnd.nextInt(6);
			//System.out.print(curr + " ");
			stats[curr]++;
		}
		for(int i=0; i<stats.length; i++) {
			System.out.println((i+1) + " : " + stats[i] + " fois");
		}
	}

}
