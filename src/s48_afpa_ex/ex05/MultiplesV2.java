package s48_afpa_ex.ex05;

import java.util.Scanner;

class MultiplesV2 {
	public static void main(String[] args) {
		int nbDiv = 1;
		int nbMax = 100;
		int span;
		int div = 50;
		
		System.out.println("\nAffichage des MULTIPLES");
		System.out.println();
		
		String userStr = "";
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		
		do {
			System.out.println();
			System.out.print("entrez le multiple : ");
			nbDiv = Integer.parseInt(ConsoleIn.nextLine());
			System.out.print("entrez le maximum : ");
			nbMax = Integer.parseInt(ConsoleIn.nextLine());
			span = 2 + Integer.toString(nbMax).length();
			
			System.out.println("\nAffichage des MULTIPLES de " + nbDiv + " entre 1 et " + nbMax + "\n");
			//String[] affich = new String[nbMax+1];
			for(int x=1; x<=nbMax; x++) {
				int space = span - Integer.toString(x).length() - 2;
				String spce = "";
				for (int i=0; i<space; i++) {spce += " ";}
				if(x%nbDiv == 0) {System.out.print(spce + "(" + x + ")");}
				else {System.out.print(spce + " " + x + " ");};
				
				if(x%10 == 0)System.out.println();
				if(x%div == 0) {
					System.out.print("\n continuer ? ");
					userStr = ConsoleIn.nextLine();
					System.out.println();
				}
			};
			
			System.out.print("\n\nVoulez vous recommencer ? \"o\" pour oui, ou autre pour non ? ");
			userStr = ConsoleIn.nextLine();
			
		}while(userStr.contentEquals("o"));
	
		System.out.print("\n------------\n\tfin");
		ConsoleIn.close();//fermeture de Scanner
	}//fin main
}
