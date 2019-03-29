package tpanimal.metier;

import java.io.Serializable;

abstract public class Mamifere extends Animal implements Serializable {

	public Mamifere() {}
	public Mamifere(String nom) {super(nom);}
	
	@Override
	public String toString() {
		return super.toString() + " Je suis un mamifere.";
	}
}
