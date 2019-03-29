package tpanimal.metier;

public class Animal implements Nommable, Comparable<Animal> {
	String nom;
	
	public Animal() {nom = "inconu";}
	public Animal(String nom) {this.nom = nom;}
	
	@Override
	public String toString() {
		if (!nom.equals(new String("inconu")))
			return "Je suis un animal de nom " + nom +  ".";
		return "Je suis un animal.";
	}
	@Override
	public String getNom() {
		return nom;
	}
	@Override
	public int compareTo(Animal anotherAnimal) {
		int longMin = Math.min(nom.length(), anotherAnimal.nom.length());
		char ch1[] = nom.toCharArray();
		char ch2[] = anotherAnimal.nom.toCharArray();
		for (int i=0; i<Math.min(nom.length(), anotherAnimal.nom.length()); i++) {
			if (ch1[i] != ch2[i]) {return ch1[i] - ch2[i];}
		}
		return nom.length() - anotherAnimal.nom.length();
    }
}
