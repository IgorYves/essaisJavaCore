package carburant.fork1;

public class Pistolet {
	private Gachette gachette;

	public void setGachette(Gachette gachette) {
		this.gachette = gachette;
	}

	public Gachette getGachette() {
		return gachette;
	}
	
	@Override
	public String toString() {
		return "Pistolet [gachette=" + gachette + "]";
	}
}
