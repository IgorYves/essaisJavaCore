package s48_afpa_ex.tp_args;

//import fr.afpa.outils.*;

class TriParam2 {
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println("\t" + args[i]);
		};
		if(args.length < 1) {
			System.out.println("Ceci est une programme pour affichage des arguments\n"
					+ "\tqu'on passe en ligne de commande en lancant ce fichier.\n"
					+ "Vous n'avez pas passé des arguments à ce programme.\n"
					+ "Pour passer des arguments sous Eclipse utilisez\n"
					+ "\tla boite de dialogue de \"Run\"");
		};
	}
}
