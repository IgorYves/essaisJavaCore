package carburant;

import java.util.ArrayList;

public class StationEssence {
	private ArrayList<Distributeur> distributeurs = new ArrayList<Distributeur>();

	
	public void addDistributeurs(Distributeur distributeur) {
		if (!distributeurs.contains(distributeur)) {
			distributeurs.add(distributeur);
			distributeur.stationEssence = this;
		}
	}
	public void removeDistributeurs(Distributeur distributeur) {
		if (distributeurs.contains(distributeur)) {
			distributeurs.remove(distributeur);
			distributeur.stationEssence = null;
		}
	}
}
