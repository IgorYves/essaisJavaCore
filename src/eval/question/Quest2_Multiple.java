package eval.question;

/**
 * ceci est un programme  qui affiche les nombres 
 * 		entiers multiplesde 5 entre 1 et 20.
 * on utilise une boucle pour ce programme
 * saisie utilisateur n'est pas demandé
 * 
 * @author HUGOT Yves
 *
 */

/**
 * args - pas des arguments
 */
public class Quest2_Multiple {

	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 2\n" +
"Ecrivez un programme  qui affiche les nombres entiers multiples\n" +
" de 5 entre 1 et 20.\n" +
"Documenter la classe de ce programme avec un commentaire javadoc et générez\n"+
"la javadoc.\n"+
"*******************************************************************\n\n\n"
		);
		
		
		
///////////////////////// debut de travail
		/**
		 * valeurs de variables diviseur (nbDiv) et maximum (nbMax) peut etre changer
		 * par l'entrée utilisateur (non implementé dans cette version)
		 */
		
		int nbDiv = 5;
		int nbMax = 20;
		System.out.println("Multiples de " + nbDiv + " entre 1 et " + nbMax + " sont :\n");
		for(int x=1; x<=nbMax; x++) {
			if(x%nbDiv == 0) {System.out.print("  " + x);}
		};
		System.out.print("\n------------\n\tfin");
	}
}
