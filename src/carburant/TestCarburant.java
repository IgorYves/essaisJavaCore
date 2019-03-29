package carburant;

public class TestCarburant {

	public static void main(String[] args) {
		Gachette gachette = new Gachette();
		Pistolet pistolet = new Pistolet();
		
		System.out.println(pistolet);
		pistolet.setGachette(gachette);
		System.out.println(pistolet);
	}

}
