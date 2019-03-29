package animals;

import tpanimal.metier.Animal;
import tpanimal.metier.Chien;
import tpanimal.metier.Homme;

public class TestAnimal {

	public static void main(String[] args) throws ClassNotFoundException {
		Animal[] animaux = {
				new Animal("Truc"),
				new Animal(),
				new Chien("Medor"),
				new Homme(),
				new Homme("Robert"),
				new Chat(),
				new Chat("Minou")
		};
		
		for (Animal animal : animaux) {
			System.out.println(animal);
		}
		
		System.out.println(animaux[6] instanceof Chat);
		
		System.out.println(Class.forName("animals.Chat").isInstance(animaux[6]));
		
	}

}
