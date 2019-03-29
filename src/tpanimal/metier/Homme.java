package tpanimal.metier;

public class Homme extends Mamifere {

	public Homme() {}
	public Homme(String nom) {super(nom);}
	
	@Override
	public String toString() {
		return super.toString() + " Je suis un homme.";
	}
}
