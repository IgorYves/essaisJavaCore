package tpanimal.metier;

public class Poisson extends Animal {

	public Poisson() {}
	public Poisson(String nom) {super(nom);}
	
	@Override
	public String toString() {
		return super.toString() + " Je suis un poisson.";
	}
}
