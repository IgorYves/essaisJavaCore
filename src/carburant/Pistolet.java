package carburant;

public class Pistolet {
	Gachette gachette;

	public void setGachette(Gachette gachette) {
		if (gachette != null) {
			this.gachette = gachette;
			if (gachette.pistolet != this)  gachette.pistolet = this;
		}
	}

	@Override
	public String toString() {
		return "Pistolet [gachette=" + gachette + "]";
	}
}
