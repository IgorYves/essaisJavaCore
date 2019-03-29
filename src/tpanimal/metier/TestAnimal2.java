package tpanimal.metier;

import java.io.Serializable;

public class TestAnimal2 {

	public static void main(String[] args) {
		Animal[] animaux = new Animal[5];
		animaux[0] = new Animal("Truc");
		animaux[1] = new Animal();
		animaux[2] = new Chien("Medor");
		animaux[3] = new Homme();
		animaux[4] = new Homme("Robert");
		
		for (int i=0; i<animaux.length; i++) {
			System.out.println(animaux[i]);
			System.out.println(animaux[i].getNom());
			System.out.println();
		}
		///////////////////////////
		System.out.println("--------------------");
		Nommable[] animaux2 = new Animal[5];
		animaux2[0] = new Animal("Truc");
		animaux2[1] = new Animal();
		animaux2[2] = new Chien("Medor");
		animaux2[3] = new Homme();
		animaux2[4] = new Homme("Robert");
		
		for (int i=0; i<animaux2.length; i++) {
			System.out.println(animaux2[i]);
		}
		System.out.println(animaux2[4] instanceof Nommable);
		///////////////////////////
		System.out.println("--------------------");
		Comparable<Animal>[] animaux3 = new Animal[5];
		animaux3[0] = new Animal("Truc");
		animaux3[1] = new Animal();
		animaux3[2] = new Chien("Medor");
		animaux3[3] = new Homme();
		animaux3[4] = new Homme("Robert");
		
		for (int i=0; i<animaux3.length; i++) {
			System.out.println(animaux3[i]);
		}
		System.out.println(animaux3[4] instanceof Comparable);
		System.out.println("--------------------");
		System.out.println(animaux3[4] instanceof Serializable);
		System.out.println(animaux3[0] instanceof Serializable);
	}

}
