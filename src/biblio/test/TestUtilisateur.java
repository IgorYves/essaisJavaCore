package biblio.test;

import java.util.Date;

import biblio.metier.AnneeIllegalArgumentException;
import biblio.metier.EmpruntException;

public class TestUtilisateur {

	public static void main(String[] args) 
			throws AnneeIllegalArgumentException, EmpruntException {
		
		biblio.metier.Livre livre1 = new biblio.metier.Livre("Albert Uderzo", "Asterix");
		biblio.metier.Livre livre2 = new biblio.metier.Livre("Georges Remi", "Tintin");
		
		biblio.metier.Utilisateur userToto = new biblio.metier.Utilisateur(1, "To", "To");
		biblio.metier.Utilisateur userZorro = new biblio.metier.Utilisateur(1, "Zor", "Ro");
		
		System.out.println(livre1.isDispo());
		System.out.println(livre2.isDispo());
		
		userToto.setEmprunt(livre1);
		userZorro.setEmprunt(livre2);
		System.out.println();
		System.out.println(livre1.isDispo());
		System.out.println(livre2.isDispo());
		
		userToto.setEmprunt(null);
		userZorro.setEmprunt(livre1);
		System.out.println();
		System.out.println(livre1.isDispo());
		System.out.println(livre2.isDispo());
		
		System.out.println("---------------");
		System.out.println(userToto.isPretEnRetard());
		System.out.println(userZorro.isPretEnRetard());
		livre1.setDateImprunt(new Date(1_000_000_000L));
		System.out.println(userZorro.isPretEnRetard());
		livre1.setDateImprunt(new Date(new Date().getTime()-14*24*60*60*1000));
		System.out.println(userZorro.isPretEnRetard());
		livre1.setDateImprunt(new Date(new Date().getTime()-15*24*60*60*1000));
		System.out.println(userZorro.isPretEnRetard());
		livre1.setDateImprunt(new Date(new Date().getTime()-16*24*60*60*1000));
		System.out.println(userZorro.isPretEnRetard());
		
	}

}
