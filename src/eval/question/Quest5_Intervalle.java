package eval.question;

import java.util.Scanner;

public class Quest5_Intervalle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
"*******************************************************************\n" +
"Question 5\n" +
"Demander les deux intervalles [a ; b] et [c ; d]\n"+
"Si b < c ou bien a > d, l'intersection est vide\n"+
"Sinon, calculer deux variables : m (maximum de a et de c) et M (minimum de b et de d)\n"+
" et afficher l'intervalle [m; M]\n"+
"*******************************************************************\n\n\n"
		);
		
		
///////////////////////// debut de travail
		String userStr = "";
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		
		System.out.println("Saisissez SVP les deux intervales "
								+ "\n\t[a et b] et [c et d]");
		System.out.println("\t(quatre nombes au total)");
		
		System.out.print("Entrez \"a\" : ");
		userStr = ConsoleIn.nextLine();
		//********************* test de roboustesse
		boolean retry=true;
		do {
			if(userStr.isEmpty()) {
				System.out.println("pas d'entrée, recommencez SVP");
			}
			else if(userStr.matches("[^0-9]")) {
				System.out.println("des signes non admis sont presents, recommencez SVP");
			}
			else{retry=false;};
			if(retry) {userStr = ConsoleIn.nextLine();};
		}while(retry);
		//********************* fin test de roboustesse
		int a = Integer.valueOf(userStr);
		
		System.out.print("Entrez \"b\" : ");
		userStr = ConsoleIn.nextLine();
		//********************* test de roboustesse
		retry=true;
		do {
			if(userStr.isEmpty()) {
				System.out.println("pas d'entrée, recommencez SVP");
			}
			else if(userStr.matches("[^0-9]")) {
				System.out.println("des signes non admis sont presents, recommencez SVP");
			}
			else if(Integer.valueOf(userStr) < a) {
				System.out.println("intervale est vide, recommencez SVP");
			}
			else{retry=false;};
			if(retry) {userStr = ConsoleIn.nextLine();};
		}while(retry);
		//********************* fin test de roboustesse
		int b = Integer.valueOf(userStr);
		
		System.out.print("Entrez \"c\" : ");
		userStr = ConsoleIn.nextLine();
		//********************* test de roboustesse
		retry=true;
		do {
			if(userStr.isEmpty()) {
				System.out.println("pas d'entrée, recommencez SVP");
			}
			else if(userStr.matches("[^0-9]")) {
				System.out.println("des signes non admis sont presents, recommencez SVP");
			}
			else{retry=false;};
			if(retry) {userStr = ConsoleIn.nextLine();};
		}while(retry);
		//********************* fin test de roboustesse
		int c = Integer.valueOf(userStr);
		
		System.out.print("Entrez \"d\" : ");
		userStr = ConsoleIn.nextLine();
		//********************* test de roboustesse
		retry=true;
		do {
			if(userStr.isEmpty()) {
				System.out.println("pas d'entrée, recommencez SVP");
			}
			else if(userStr.matches("[^0-9]")) {
				System.out.println("des signes non admis sont presents, recommencez SVP");
			}
			else if(Integer.valueOf(userStr) < c) {
				System.out.println("intervale est vide, recommencez SVP");
			}
			else{retry=false;};
			if(retry) {userStr = ConsoleIn.nextLine();};
		}while(retry);
		//********************* fin test de roboustesse
		int d = Integer.valueOf(userStr);
		ConsoleIn.close();//fermeture de Scanner
		//////// fin entrees utilisateur
		
		if(b < c || a > d)System.out.println("intersection est vide");
		else {
			int maxAC;
			int minBD;
			if(a > c) maxAC = a;
			else maxAC = c;
			if(b > d) minBD = d;
			else minBD = b;
			if(maxAC < minBD)System.out.println("intervale : [" + maxAC + ";" + minBD + "]");
			else System.out.println();
		}
		

		System.out.print("\n------------\n\tfin");
		

	}//fin main
}
