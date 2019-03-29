package biblio.metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Livre implements Comparable<Livre> {
	private String titre;
	private String auteur;
	private int nbPages;
	private int prix = -1;
	private Etat statut;
	private TypeDonneesAnnee annee;
	private Date dateImprunt;
	public static SimpleDateFormat dsf = new SimpleDateFormat("dd MMMM yyyy");
	
	///////////////////////////////////////////// constr
	public Livre() 
			throws AnneeIllegalArgumentException {
		this("", "");
	}
	public Livre(String auteur, String titre) 
			throws AnneeIllegalArgumentException {
		this(auteur, titre, 0);
	}
	public Livre(String auteur, String titre, int nbPages) 
			throws AnneeIllegalArgumentException {
		this(auteur, titre, nbPages, 0);
		this.prix = -1;
	}
	public Livre(String auteur, String titre, int nbPages, double prix) 
			throws AnneeIllegalArgumentException {
		this(auteur, titre, nbPages, prix, 0);
	}
	public Livre(String auteur, String titre, int nbPages, double prix, int annee) 
			throws AnneeIllegalArgumentException {
		setAuteur(auteur);
		setTitre(titre);
		setNbPages(nbPages);
		setPrix(prix);
		setAnnee(annee);
		setDispo();
	}

	/////////////////////////////////////////////////////// get / set
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	//////////////////////////////////////
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	///////////////////////////////////////
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		if (nbPages >= 0)
			this.nbPages = nbPages;
		else {
			System.out
					.println("***********************************************");
			System.out
					.println(nbPages + " : Nombre des pages n'est pas correct");
			System.out
					.println("***********************************************");
		}
	}
	/////////////////////////////////////
	public String getPrix() {
		if (this.prix < 0)
			return "prix indeterminé";
		else if (this.prix == 0) {
			return "livre gratuite";
		} else
			return String.format("%,.2f", (double) prix / 100) + " euro"
					+ (prix / 100 == 0 || (prix / 100 % 10 == 1
							&& prix / 100 % 100 != 11 && prix / 100 % 100 != 71
							&& prix / 100 % 100 != 91) ? "" : "s");
	}
	public void setPrix(double prix) {
		if (prix >= 0 && this.prix < 0)
			this.prix = (int) (prix * 100);
		else {
			System.out
					.println("***********************************************");
			System.out.println(prix + " : Prix ne peut pas etre enregistré");
			System.out
					.println("***********************************************");
		}

	}
	public boolean isPrixFixed() {
		return this.prix < 0 ? false : true;
	}
	/////////////////////////////////////
	public void setDispo() {this.statut = Etat.Dispo;}
	public void setRented() {this.statut = Etat.Rented;}
	public void setDiscarded() {this.statut = Etat.Discarded;}
	public boolean isDispo() {return this.statut == Etat.Dispo;}
	/////////////////////////////////////
	public void setAnnee(int annee) throws AnneeIllegalArgumentException {
		this.annee = new TypeDonneesAnnee(annee);
	}
	public String getAnnee() {
		return this.annee.toString();
	}
	////////////////////////////
	public Date getDateImprunt() {
		return dateImprunt;
	}
	public void setDateImprunt(Date dateImprunt) {
		this.dateImprunt = dateImprunt;
	}
	//////////////////////////
	
	///////////////////////////////////////////////////// to string
	public String afficheToi() {
		return auteur + ", \"" + titre + "\"; " + nbPages + " page"
				+ (nbPages == 0 || (nbPages % 10 == 1 && nbPages % 100 != 11
						&& nbPages % 100 != 71 && nbPages % 100 != 91)
								? ""
								: "s")
				+ "; année " + (getAnnee().equals("0")?"inconnu":getAnnee()) + "; " + getPrix()
				+ "; " + (isDispo()?"":"non") + " disponible";
	}
	@Override
	public String toString() {
		return getClass().getName() + "@ <" + afficheToi() + ">";
	}
	///////////////////////////////////////////////////////// compare
	@Override
	public int compareTo(Livre l) {
		if (this.nbPages == l.nbPages)
			return 0;
		else if (this.nbPages > l.nbPages)
			return 1;
		else if (this.nbPages < l.nbPages)
			return -1;
		else
			return 1 / 0;
	}
	public int compare(Livre l) {
		return compareTo(l);
	}
	static public int compare2(Livre l1, Livre l2) {
		return l1.compare(l2);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auteur == null) ? 0 : auteur.hashCode());
		result = prime * result + nbPages;
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {return true;}
		if (obj == null) {return false;}
		if (!(obj instanceof Livre)) {return false;}
		Livre other = (Livre) obj;
		if (auteur == null) {
			if (other.auteur != null) {return false;}
		} else if (!auteur.equals(other.auteur)) {
			return false;
		}
		if (nbPages != other.nbPages) {
			return false;
		}
		if (titre == null) {
			if (other.titre != null) {return false;}
		} else if (!titre.equals(other.titre)) {
			return false;
		}
		return true;
	}
}
