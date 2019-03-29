package s48_afpa_ex.ex03;

import fr.afpa.outils.*;

class CentreEquestreV2 {

	public static void main(String[] args) {
		String nom, prenom, adresse, cheval1, cheval2, cheval3, carteFNTE;
		char rep;
		do {
			System.out.println("--------------------------------------");
			System.out.print("Nom du cavalier \t: ");
			nom = Console.in.readLine();
			System.out.print("Prenom du cavalier \t: ");
			prenom = Console.in.readLine();
			System.out.print("Adresse du cavalier \t: ");
			adresse = Console.in.readLine();
			System.out.print("Cheveaux preferes \t: ");
			cheval1 = Console.in.readLine();
			System.out.print("\t\t\t: ");
			cheval2 = Console.in.readLine();
			System.out.print("\t\t\t: ");
			cheval3 = Console.in.readLine();
			System.out.print("No carte FNTE \t\t: ");
			carteFNTE = Console.in.readLine();
			
			System.out.print("\n\nCavalier no " + carteFNTE);
			System.out.println("\n\t" + prenom + " " + nom);
			System.out.println("\t" + adresse);
			System.out.println("\tChevaux : " + cheval1 + " " + cheval2 + " " + cheval3);
			
			System.out.print("\n\nVoulez vous continuer : ");
			rep = Console.in.readChar();
			
			while(rep != 'o' && rep != 'n') {
				System.out.print("\n\nVoulez vous continuer ? o (oui) ou n (non) ? ");
				rep = Console.in.readChar();
			};
				
		}while(rep == 'o');
		System.out.print("\n------------\n\tfin");
	}

}
