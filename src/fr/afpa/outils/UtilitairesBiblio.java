package fr.afpa.outils;

import java.util.Date;

class UtilitairesBiblio {
	public final static int dureeMaxPret = 15;
	
	
	public static void main(String[] args) {
		Date date2test = new Date();
		
		//tests
		for (int i=0; i<20; i++) {
			System.out.println(i + " jour" + (i==0?"":"s") + " passés, retard : "
						+ isPretEnRetard(new Date(date2test.getTime() - i*(1000*60*60*24))));
		}
		//System.out.println(isPretEnRetard(new Date(date2test.getTime() - 16*(1000*60*60*24))));
		
		

	}
	public static boolean isPretEnRetard(Date dateOut) {
		return isPretEnRetard(dateOut, new Date(), dureeMaxPret);
	}
	public static boolean isPretEnRetard(Date dateOut, Date now, int dureeMax) {
		boolean ret = false;
		long jourOut = dateOut.getTime()/(1000*60*60*24);
		long jourNow = now.getTime()/(1000*60*60*24);
		if ((jourNow - jourOut) > dureeMaxPret) {ret = true;}
		return ret;
	}

}

class Livre {
	int bookId;
	String title;
	String autor;
	String isbn;
	EtatLivre etat;
	boolean dispo;
	int currentUserId;
	
	Livre() {
		bookId = 0;
		title = "";
		autor = "";
		isbn = "";
		etat = EtatLivre.NOTKNOWN;
		dispo = false;
		currentUserId = 0;
	}
	Livre(int bookId) {
		this.bookId = bookId;
		title = "Dummy";
		autor = "Dummy";
		isbn = "Dummy";
		etat = EtatLivre.NOTKNOWN;
		dispo = false;
		currentUserId = 0;
		//connectDB
		//getInfos
		//putInfos dans vars
	}
	public void setTitle(String t) {title = t;};
	public void setAutor(String a) {autor = a;};
	public void setIsbn(String i) {isbn = i;};
	public void setEtat(EtatLivre e) {etat = e;};
	public void setDispo(boolean d) {dispo = d;};
	public void setUserId(int u) {currentUserId = u;};
	
	
}