package biblio.test;

import biblio.metier.AnneeIllegalArgumentException;
import biblio.metier.EmpruntException;
import biblio.metierV2.BiblioException;
import biblio.metierV2.Livre;
import biblio.metierV2.Utilisateur;

public class TestUtilisateur2 {

	public static void main(String[] args) 
			throws AnneeIllegalArgumentException, EmpruntException, 
					biblio.metierV2.AnneeIllegalArgumentException, BiblioException {
		
		Livre livre1 = new Livre("Albert Uderzo", "Asterix");
		Livre livre2 = new Livre("Georges Remi", "Tintin");
		
		Utilisateur userToto = new Utilisateur(1, "To", "To");
		Utilisateur userZorro = new Utilisateur(1, "Zor", "Ro");
		
		userToto.addLivre(livre1);
		userToto.addLivre(livre2);
		
		System.out.println(userToto);
		userToto.clearLivres();
		System.out.println(userToto);
		userToto.addLivre(livre1);
		System.out.println(userToto);
		userToto.addLivre(livre2);
		
		System.out.println(userToto.findLivreByTitre("Tintin"));
		System.out.println(userToto.findLivreByTitre("Bla"));
		
	}

}
