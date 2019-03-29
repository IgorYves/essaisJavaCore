package biblio.test;

import biblio.metier.AnneeIllegalArgumentException;
import biblio.metierV2.Livre;

public class TestLivre2 {

	public static void main(String[] args) 
			throws AnneeIllegalArgumentException, 
					biblio.metierV2.AnneeIllegalArgumentException {
		Livre livre1 = new Livre("Victor Hugo", 
															"Les Misérables");
		Livre livre2 = new Livre();
		livre2.setAuteur("Alexandre Dumas");
		livre2.setTitre("Les Trois Mousquetaires");
		
		System.out.println(livre1);
		System.out.println(livre2);
		
		
		
	}

}
