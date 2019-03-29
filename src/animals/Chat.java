package animals;

import tpanimal.metier.Mamifere;

public class Chat extends Mamifere {

	public Chat() {}
	public Chat(String nom) {super(nom);}
	
	@Override
	public String toString() {
		return super.toString() + " Je suis un chat.";
	}
}
