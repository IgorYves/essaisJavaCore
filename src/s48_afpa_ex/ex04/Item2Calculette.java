package s48_afpa_ex.ex04;

import java.util.*;

class Item2Calculette {
	static final int PRECISION = 3;
	public static void main(String[] args) {
		String userStr = "";
		String[] userStrArr;
		String rep;
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		System.out.println();
		System.out.println("\t****************");
		System.out.println("\t** Calculette **");
		System.out.println("\t****************");
		System.out.println();
		do {
			System.out.println("Entrez l'expression à evaluer");
			System.out.println("Separez les nombres et l'opérande par les espaces");
			System.out.println("Opérandes pris en compte : \"+\", \"-\", \"*\", \"/\"");
			System.out.println("(example \"45 + 93\", <Entr> pour evaluer)");
			System.out.println();
			System.out.print("C'est à vous \t: ");
			userStr = ConsoleIn.nextLine();
			
			//********************* test de roboustesse
			boolean retry=true;
			do {
				if(userStr.isEmpty()) {
					System.out.println("pas d'arguments, recommencez en entrant des arguments");
				}
				else if(userStr.contains("  ")) {
					System.out.println("un seul espase entre les arguments, recommencez SVP");
				}
				else if(userStr.matches("[-]?[0-9]+[ ][/*\\-+][ ][\\-]?[0-9]+")){retry=false;}
				else {
					System.out.println("pas de lettres/signes, uniquement des nombres, recommencez SVP");
				};
				if(retry) {
					System.out.println();
					System.out.print("C'est à vous \t: ");
					userStr = ConsoleIn.nextLine();
				}
			}while(retry);
			
			userStrArr = userStr.trim().split(" "); 
			int uVal1 = Integer.parseInt(userStrArr[0]);
			int uVal2 = Integer.parseInt(userStrArr[2]);
			switch (userStrArr[1]) {
				case "+" : System.out.println("\t\t  " + userStr + " = " + (uVal1+uVal2)); break;
				case "-" : System.out.println("\t\t  " + userStr + " = " + (uVal1-uVal2)); break;
				case "*" : System.out.println("\t\t  " + userStr + " = " + (uVal1*uVal2)); break;
				case "/" : 
					if(uVal1%uVal2 == 0) {
						System.out.println("\t\t  " + userStr + " = " + (uVal1/uVal2));
						break;
					}
					double dVal1 = (double)uVal1;
					String ret = Double.toString(dVal1/uVal2);
					ret = ret.split("[.]")[0] + "." + ret.split("[.]")[1].substring(0, PRECISION);
					System.out.println("\t\t  " + userStr + " = " + ret);
					break;
				default  : System.out.println("erreur d'evaluation" + userStr);
			};
			
			System.out.print("\n\nVoulez vous continuer : ");
			rep = ConsoleIn.nextLine();
			while(!rep.contentEquals("o") && !rep.contentEquals("n")) {
				System.out.print("\n\nVoulez vous continuer ? o (oui) ou n (non) ? ");
				rep = ConsoleIn.nextLine();
			};
			System.out.println("****************");
		}while(rep.contentEquals("o"));
		System.out.print("\n------------\n\tfin");
		
		ConsoleIn.close();//fermeture de Scanner
	}//fin main
}
