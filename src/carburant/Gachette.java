package carburant;

public class Gachette {
	Pistolet pistolet;

	public void setPistolet(Pistolet pistolet) {
		if (pistolet != null) {
			this.pistolet = pistolet;
			if (pistolet.gachette != this) pistolet.gachette = this;
		}
	}
}
