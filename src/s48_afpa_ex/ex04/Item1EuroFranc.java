package s48_afpa_ex.ex04;

import fr.afpa.outils.*;
import java.text.*;

class Item1EuroFranc {
	
	public static void main(String[] args) {
		int euros = 0;
		char rep;
		System.out.println();
		System.out.println("***********************************");
		System.out.println("** Convertisseur Euros -> Francs **");
		System.out.println("***********************************");
		do {
			System.out.print("Entrez la somme à convertir \t: ");
			euros = Console.in.readInt();
			DecimalFormat df = new DecimalFormat();
			System.out.println("\t" + NumberFormat.getCurrencyInstance().format(euros) + " =");
			df.setMaximumFractionDigits(2);
			System.out.println("\t\t\t" + df.format(6.56 * euros) + " F");
			df.setMaximumFractionDigits(5);
			System.out.println("\t\t\t" + df.format((6.56 * euros)/1000) + " KF");
			df.setMaximumFractionDigits(8);
			System.out.println("\t\t\t" + df.format((6.56 * euros)/1000000) + " MF");
			
			System.out.print("\n\nVoulez vous continuer : ");
			rep = Console.in.readChar();
			while(rep != 'o' && rep != 'n') {
				System.out.print("\n\nVoulez vous continuer ? o (oui) ou n (non) ? ");
				rep = Console.in.readChar();
			};
		}while(rep == 'o');
		System.out.print("\n------------\n\tfin");
	}
}
