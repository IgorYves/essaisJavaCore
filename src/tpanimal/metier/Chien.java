package tpanimal.metier;

public class Chien extends Mamifere {

	public Chien() {}
	public Chien(String nom) {super(nom);}
	
	@Override
	public String toString() {
		return super.toString() + " Je suis un chien.";
	}
}
