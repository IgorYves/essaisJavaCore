package biblio.metier;

import java.util.Date;

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
		if (emprunt == null) return false;
		
//		Calendar calendarEmprunt = new GregorianCalendar();
//		calendarEmprunt.setTime(emprunt.getDateImprunt());
//		calendarEmprunt.clear(Calendar.HOUR_OF_DAY);
//		calendarEmprunt.clear(Calendar.MINUTE);
//		calendarEmprunt.clear(Calendar.SECOND);
//		calendarEmprunt.clear(Calendar.MILLISECOND);
//		calendarEmprunt.add(Calendar.DAY_OF_YEAR, dureeMaxPret);
//		if (calendarEmprunt.after(new GregorianCalendar())) return false;
		
		//if (emprunt.getDateImprunt().getTime() > (new Date().getTime() - dureeMaxPret*24*60*60*1000)) return false;
		if ((emprunt.getDateImprunt().getTime() 
						- emprunt.getDateImprunt().getTime()%(24*60*60*1000)) 
				>= (new Date().getTime() - (new Date().getTime()%(24*60*60*1000)) 
						- dureeMaxPret*24*60*60*1000)) return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", idUtilisateur : " + idUtilisateur;
	}

	

}
