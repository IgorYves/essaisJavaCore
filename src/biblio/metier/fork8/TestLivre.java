package biblio.metier.fork8;

import biblio.metier.AnneeIllegalArgumentException;
import biblio.metier.EmpruntException;

public class TestLivre {

	public static void main(String[] args) 
			throws AnneeIllegalArgumentException, EmpruntException {
		
		Livre livre1 = new Livre("Albert Uderzo", "Asterix");
		Livre livre2 = new Livre("Georges Remi", "Tintin");
		
		Utilisateur userToto = new Utilisateur(1, "To", "To");
		Utilisateur userZorro = new Utilisateur(1, "Zor", "Ro");
		
		System.out.println(livre1.isDispo());
		System.out.println(livre2.isDispo());
		
		userToto.setEmprunt(livre1);
		userZorro.setEmprunt(livre2);
		
		System.out.println("------------");
		System.out.println(livre1.getEmprunteur());
		System.out.println(livre2.getEmprunteur());
		
		livre1.setEmprunteur(userToto);
		System.out.println("------------");
		System.out.println(livre1.getEmprunteur());
		System.out.println(livre2.getEmprunteur());
		
		livre1.setEmprunteur(null);
		System.out.println("------------");
		System.out.println(livre1.getEmprunteur());
		System.out.println(livre2.getEmprunteur());
		
		
		
	}

}
