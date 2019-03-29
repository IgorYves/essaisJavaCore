package biblio.metier.fork8;

import java.util.Date;

import biblio.metier.EmpruntException;
import biblio.metier.Personne;

public class Utilisateur extends Personne {
	private int idUtilisateur;
	private Livre emprunt;
	private static final int dureeMaxPret = 15;
	
	public Utilisateur() {}
	public Utilisateur(int idUtilisateur, String prenom, String nom) {
		super(nom, prenom);
		this.idUtilisateur = idUtilisateur;
	}
	
	public Livre getEmprunt() {
		return emprunt;
	}
	public void setEmprunt(Livre emprunt) throws EmpruntException {
		if (emprunt == null) {
			if (this.emprunt != null) {
				this.emprunt.setDateImprunt(null);
				this.emprunt.setDispo();
			}
			this.emprunt = null;
		}
		else if (emprunt.isDispo()) {
			if (this.emprunt != null) {
				this.emprunt.setDateImprunt(null);
				this.emprunt.setDispo();
			}
			this.emprunt = emprunt;
			emprunt.setDateImprunt(new Date());
			emprunt.setRented();
		}
		else throw new EmpruntException();
	}
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public boolean isPretEnRetard() {
		if (emprunt == null || 
				emprunt.getDateImprunt().getTime() 
					> (new Date().getTime() - dureeMaxPret*24*60*60*1000)) 
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", idUtilisateur : " + idUtilisateur;
	}

	

}
