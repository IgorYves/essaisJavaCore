package biblio.test;

import java.util.TreeMap;

import biblio.metier.AnneeIllegalArgumentException;
import biblio.metier.Livre;

public class TestLivre {

	public static void main(String[] args) throws AnneeIllegalArgumentException {
		biblio.metier.Livre livre1 = new biblio.metier.Livre("Victor Hugo", 
															"Les Misérables");
		biblio.metier.Livre livre2 = new biblio.metier.Livre();
		livre2.setAuteur("Alexandre Dumas");
		livre2.setTitre("Les Trois Mousquetaires");
		
		livre1.setNbPages(2_000);
		livre2.setNbPages(700);
		livre2.setNbPages(-100);
		livre2.setPrix(-10.0);
		livre2.setPrix(5000.2);
		livre2.setPrix(5000.2);
		
		System.out.println(livre1.isPrixFixed());
		System.out.println(livre2.isPrixFixed());
		System.out.println("---------");
		
		System.out.println();
		System.out.println(livre1.getAuteur());
		System.out.println(livre2.getAuteur());
		System.out.println("---------");
		System.out.println(livre1.afficheToi());
		System.out.println(livre2.afficheToi());
		System.out.println("---------");
		System.out.println(livre1.getAuteur());
		System.out.println(livre2.getAuteur());
		System.out.println("---------");
		System.out.println("Total des pages de deux livres : " 
								+ (livre1.getNbPages()+livre2.getNbPages()));
		System.out.println("---------");
		System.out.println(livre1);
		System.out.println(livre2);
		
		System.out.println("---------");
		
		
		TreeMap<Integer, Livre> livres = new TreeMap<Integer, Livre>();
		livres.put(livre1.getNbPages(), livre1);
		livres.put(livre2.getNbPages(), livre2);
		
		System.out.println("auteur de plus grande livre est " 
						+ livres.get(livres.lastKey()).getAuteur());
		System.out.println("---------");
		livre1.setDispo();
		livre2.setRented();
		try {
			livre1.setAnnee(1995);
		} catch (AnneeIllegalArgumentException e) {
			System.out.println("****************");
			System.out.println(e);
			System.out.println("****************");
		}
		try {
			livre2.setAnnee(2995);
		} catch (AnneeIllegalArgumentException e) {
			System.out.println("****************");
			System.out.println(e);
			System.out.println("****************");
		}
		System.out.println(livre1);
		System.out.println(livre2);
		
	}

}
