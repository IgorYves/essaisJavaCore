package factorielle;

import java.util.Scanner;

class FactorielleBoucle {
	 
	public static void main(String[] args) {
		int fact = 10;
		long rez = 1;
		
		System.out.println();
		System.out.println("\t****************************");
		System.out.println("\t** Factorielle par boucle **");
		System.out.println("\t****************************");
		System.out.println();
		
		System.out.println("Entrez le nombre : ");
		
		String userStr = "";
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		userStr = ConsoleIn.nextLine();
		
		//********************* test de roboustesse
		boolean retry=true;
		do {
			if(userStr.isEmpty()) {
				System.out.println("pas de nombre, recommencez en entrant votre nombre");
			}
			else if(userStr.matches("[^0-9]")) {
				System.out.println("des signes non admis sont presents, recommencez SVP");
			}
			else if(Integer.valueOf(userStr) > 20) {
				System.out.println("votre nombre est trop grand pour java, recommencez SVP");
			}
			else if(Integer.valueOf(userStr) < 0) {
				System.out.println("nombre negative n'a pas de factorielle, recommencez SVP");
			}
			else{retry=false;};
			if(retry) {userStr = ConsoleIn.nextLine();};
		}while(retry);
		//********************* fin test de roboustesse
		
		fact = Integer.valueOf(userStr);
		if(fact == 0) {rez = 1;}
		else if(fact == 1) {rez = 1;}
		else {rez = getFactoriel(fact);}
			
		System.out.println(fact + "! = " + rez);

		System.out.print("\n------------\n\tfin");
		ConsoleIn.close();//fermeture de Scanner

	}//fin main
	
	static private long getFactoriel(int i) {
		long rez = 1;
		boolean continu = true;
		int current = 1;
		do {
			rez *= current++;
			if(current-1 == i) {continu = false;}
		}while(continu);
		
		return rez;
	}
	
}
