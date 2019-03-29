/**
 * tests unitaires de class FactorielleReurce
 * 
 * 
 * */

package factorielle;

class TUFactorielleRecurce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("************************");
		System.out.println("passage des arguments de -100 jusqu'a 100 :");
		System.out.println();
		for(int i = -100; i <= 100; i++) {
			System.out.println("appel " + i
					+ ((FactorielleRecurce.getFactorial(i)<0)?" : erreur signalé !":" \tOK")
					 + " -> reponse : "+ FactorielleRecurce.getFactorial(i));
		}
		int compteur = 0;
		int ncompteur = 0;
		System.out.println("************************");
		System.out.println("factorielle de 0 doit etre 1 :");
		String s = "0";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == 1) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("factorielle de 1 doit etre 1 :");
		s = "1";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == 1) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("factorielle de 5 doit etre 120 :");
		s = "5";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == 120) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("factorielle de 15 doit etre 1307674368000 :");
		s = "15";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == 1307674368000l) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("factorielle de 20 doit etre 2432902008176640000 :");
		s = "20";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == 2432902008176640000l) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("factorielle de 21 doit retourner erreur -2 :");
		s = "21";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == -2) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("factorielle de -1 doit retourner erreur -1 :");
		s = "-1";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == -1) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("factorielle de -5 doit retourner erreur -1 :");
		s = "-5";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == -1) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("passage des arguments String (attendu -3) :");
		s = "Lorem ispum";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == -3) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("passage des arguments nombre + String (attendu -2) :");
		s = "54624 ispum";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == -2) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("passage des arguments nombre + espaces en arriere :");
		s = "5   ";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == 120) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("passage des arguments nombre + espaces devant :");
		s = "  5";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == 120) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("passage des arguments vides (attendu -3) :");
		s = "";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == -3) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("passage des espaces comme argument (attendu -3) :");
		s = "     ";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == -3) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("passage des signes comme argument (attendu -3) :");
		s = " /  * - + ";
		System.out.println("appel \"" + s + "\""
				+ ((FactorielleRecurce.getFactorial(s)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(s));
		if(FactorielleRecurce.getFactorial(s) == -3) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("passage de (long)long comme argument :");
		long l = 5L;
		System.out.println("appel " + l + "L"
				+ ((FactorielleRecurce.getFactorial(l)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(l));
		if(FactorielleRecurce.getFactorial(l) == 120) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("************************");
		System.out.println("passage de (long)long comme argument :");
		l = 5555555555555555555L;
		System.out.println("appel " + l + "L"
				+ ((FactorielleRecurce.getFactorial(l)<0)?" : erreur signalé !":" \tOK")
				 + " -> reponse : "+ FactorielleRecurce.getFactorial(l));
		if(FactorielleRecurce.getFactorial(l) == -2) {
			System.out.println("----------------Test OK");
			System.out.println("tests passés : " + ++compteur);
		}
		else {System.err.println("----------------Test NOK");ncompteur++;}
		
		System.out.println("\n\tTotal tests passés OK : " + compteur);
		System.out.println("\tTotal tests passés NOK : " + ncompteur);
		/*
		System.out.println("****************************************************");
		System.out.println("Test de test (ne pas tenir compte !!!)");
		if(false) {
			System.out.println("----------------Test OK");
		}
		else {System.err.println("----------------Test NOK");}
		if(true) {
			System.out.println("----------------Test OK");
		}
		else {System.err.println("----------------Test NOK");}
		*/
	}

}
