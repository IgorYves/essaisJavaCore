package s48_afpa_ex.ex03;

import fr.afpa.outils.*;
class CentreEquestreV1 {

	public static void main(String[] args) {
		String nom, prenom;
		char rep;
		do {
			System.out.print("Nom du cavalier : ");
			nom = Console.in.readLine();
			System.out.print("Prenom du cavalier : ");
			prenom = Console.in.readLine();
			
			System.out.print("\n\nCavalier : ");
			System.out.println("\t" + prenom + " " + nom);
			
			System.out.print("\n\nVoulez vous continuer : ");
			rep = Console.in.readChar();
			
		}while(rep == 'o');
		System.out.print("\n------------\n\tfin");
	}

}
