package tpanimal.metier;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestAnimal {

	public static void main(String[] args) {
		Animal[] animaux = {
				new Animal("Truc"),
				new Animal(),
				new Chien("Medor"),
				new Homme(),
				new Homme("Robert")
		};
		
		for (Animal animal : animaux) {
			System.out.println(animal);
		}
		
		System.out.println("------------");
		
		Stream<Animal> stream1 = Arrays.stream(animaux);
		stream1.forEach(x -> System.out.println(x));
		
		System.out.println("------------");
		
		Stream<Animal> stream2 = Stream.of(animaux);
		stream2.forEach(x -> System.out.println(x));
		
	}

}
