package s48_afpa_ex.tp_args;

import java.util.Arrays;
//import fr.afpa.outils.*;
import java.util.Arrays;

class TriParam3 {
	public static void main(String[] args) {
		if(args.length > 0) {
			System.out.println("arguments avant triage :");
			for(int i=0; i<args.length; i++) {
				System.out.println("\t\t\t" + args[i]);
			};	
			Arrays.sort(args);
			System.out.println("arguments avant triage :");
			for(int i=0; i<args.length; i++) {
				System.out.println("\t\t\t" + args[i]);
			};
		} else {
			System.out.println("Ceci est une programme pour affichage des arguments\n"
					+ "\tqu'on passe en ligne de commande en lancant ce fichier.\n"
					+ "Vous n'avez pas passé des arguments à ce programme.\n"
					+ "Pour passer des arguments sous Eclipse utilisez\n"
					+ "\tla boite de dialogue de \"Run\"");
		};
	}
}
