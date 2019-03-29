package carburant;

public class Distributeur {
	int numeroDistributeur;
	StationEssence stationEssence;
	
	Distributeur(int numeroDistributeur) {
		this.numeroDistributeur = numeroDistributeur;
	}
	
	public void addStationEssence(StationEssence stationEssence) {
		if (this.stationEssence == null && stationEssence != null) {
			this.stationEssence = stationEssence;
		}
	}
	public void removeStationEssence(StationEssence stationEssence) {
		if (stationEssence != null && this.stationEssence == stationEssence) {
			stationEssence.removeDistributeurs(this);
			this.stationEssence = null;
		}
	}
	
}
