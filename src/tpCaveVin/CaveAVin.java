
package tpCaveVin;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

//import gnu.d05_Reutilisation_Classes.metier.Boisson;
//import gnu.d05_Reutilisation_Classes.metier.BoissonAlcoolisee;
//import gnu.d07_2_Interface.metier.Boisson;
//import gnu.d07_2_Interface.metier.BoissonAlcoolisee;

class CaveAVin {
	public static void main(String[] args) {
		// Creation d'instances de boisson
		Boisson<String, Float> soda = new Boisson<String, Float>("Soif !", 2F);
		Boisson<String, Float> bordeaux = 
				new BoissonAlcoolisee<String, Float, Integer>("Bordeaux", 4.5f, 12);

		// Creation d'un ensemble illimite
		//ArrayList<Boisson<String, Float>> caveAVin = new ArrayList<Boisson<String, Float>>();
		List<Boisson<String, Float>> caveAVin = new ArrayList<Boisson<String, Float>>();
		
		// Ajout des boissons dans la cave a vin
		caveAVin.add(soda);
		caveAVin.add(soda);
		// La 3eme et la 4eme places sont vides
		caveAVin.add(null);
		caveAVin.add(null);

		// Ajout de 4 bouteilles de Bordeaux
		for (int i = 4; i <= 7; i++)
			caveAVin.add(bordeaux);

		// Affectation de la 4eme place
		caveAVin.set(3, new Boisson<String, Float>("Limonade", 2F));
		
		// Calcul et affichage du prix du casier
		// et du nombre de places laissees vide
		float prix = 0;
		int placesVides = 0;
		for (Boisson<?, ?> b : caveAVin) {
			// L'ensemble peut contenir n'importe
			// quel objet => Conversion de la
			// reference en classe Boisson
			Boisson<?, ?> boisson = b;
			if (boisson != null)
				prix = Float.sum((float) boisson.getPrix(), prix);
			else
				placesVides++;
		}
		JOptionPane.showMessageDialog(null, "Valeur de la cave : " + prix
				+ " \u20AC" + "\n" + placesVides + " place vide");
		System.exit(0);
	}
}
