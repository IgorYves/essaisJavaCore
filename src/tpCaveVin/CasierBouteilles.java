/*
 * Fichier org/gnu/test/CasierBouteilles.java
 *
 */
package tpCaveVin;

import java.util.ArrayList;

import javax.swing.JOptionPane;

//import gnu.d05_Reutilisation_Classes.metier.Boisson;
//import gnu.d05_Reutilisation_Classes.metier.BoissonAlcoolisee;
//import gnu.d07_2_Interface.metier.Boisson;
//import gnu.d07_2_Interface.metier.BoissonAlcoolisee;

class CasierBouteilles {
	public static void main(String[] args) {
		// Creation d'instances de boisson
		Boisson<String, Float> soda = new Boisson<String, Float>("Soif !", 2F);
		Boisson<String, Float> bordeaux = 
				new BoissonAlcoolisee<String, Float, Integer>("Bordeaux", 4.5f, 12);
		// Creation d'un casier de 9 boissons
		ArrayList<Boisson<String, Float>> casier = new ArrayList<Boisson<String, Float>>(9);
		// Affectation des boissons aux cases
		casier.add(soda);
		casier.add(soda);
		// La 3eme et la 4eme cases sont vides

		// Ajout de 4 bouteilles de Bordeaux
		for (int i = 4; i <= 7; i++)
			casier.add(bordeaux);
		// Affectation de la 4eme place
		casier.add(new Boisson<String, Float>("Limonade ", 2F));
		// Calcul et affichage du prix du casier
		// et du nombre de cases libres
		float prix = 0;
		int casesLibres = 0;
		for (Boisson<?, ?> b : casier) {
			// Le tableau ne peut contenir que des
			// references de classe Boisson
			// => Pas besoin de conversion
			Boisson<?, ?> boisson = b;
			if (boisson != null) {
				prix = Float.sum((float) boisson.getPrix(), prix);
			}
			else casesLibres++;
		}
		JOptionPane.showMessageDialog(null, "Valeur du casier " + prix
				+ " \u20AC" + "\n" + casesLibres + " cases libres");
		System.exit(0);
	}
}
