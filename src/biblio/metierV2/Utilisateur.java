package biblio.metierV2;

import java.util.ArrayList;
import java.util.Date;

public class Utilisateur extends Personne {
	private int idUtilisateur;
	private static final int nbMaxPrets = 5;
	private static final int dureeMaxPret = 15;
	private ArrayList<Livre> livres = new ArrayList<Livre>();
	
	public Utilisateur() {}
	public Utilisateur(int idUtilisateur, String prenom, String nom) {
		super(nom, prenom);
		this.idUtilisateur = idUtilisateur;
	}
	
	//---------------------------
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	//---------------------------
	public void addLivre(Livre livre) throws BiblioException {
		if (livres.size() < nbMaxPrets) {
			livres.add(livre);
			livre.setRented();
			return;
		}
		throw new BiblioException();
	}
	public void clearLivres() {
		if (livres.size() > 0) {
			livres.forEach(l->l.setDispo());
			livres.clear();
		}
	}
	public Livre findLivreByTitre(String titre) {
		for (int i=0; i<livres.size(); i++) {
			if (livres.get(i).getTitre().equals(titre)) return livres.get(i);
		}
		return null;
	}
	public ArrayList<Livre> findAllLivres() {return livres;}
	public void setLivres(ArrayList<Livre> livres) {
		this.livres = livres;
		this.livres.forEach(l->l.setRented());
	}
	public boolean containsLivre(Livre livre) {return livres.contains(livre);}
	public void removeLivre(Livre livre) {
		if (livres.contains(livre)) {
			livres.remove(livre);
			livre.setDispo();
		}
	}
	//---------------------------
	
	@Override
	public String toString() {
		String retourString = super.toString() + ", idUtilisateur : " + idUtilisateur;
		
		if (livres.size() == 1)
			retourString += ", livre en pret : " + livres.get(0).toString();
		else if (livres.size() > 1) {
			retourString += ", livres en pret : ";
			retourString += livres;
		}
		return retourString;
	}
	
	private boolean isPretEnRetard(Livre livre) {
		if ((livre.getDateImprunt().getTime() 
						- livre.getDateImprunt().getTime()%(24*60*60*1000)) 
					< (new Date().getTime() - (new Date().getTime()%(24*60*60*1000)) 
							- dureeMaxPret*24*60*60*1000)) return true;
		return false;
	}
	public int getNbRetards() {
		if (livres.size() < 1) return 0;
		int retards = 0;
		for (int i=0; i<livres.size(); i++) {
			if (isPretEnRetard(livres.get(i))) retards++;
		}
		return retards;
	}
	public boolean isConditionsPretAcceptees() {
		return getNbRetards() < 1 && livres.size() < nbMaxPrets;
	}
}
