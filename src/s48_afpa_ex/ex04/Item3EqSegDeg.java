package s48_afpa_ex.ex04;

import java.util.*;

class Item3EqSegDeg {

	public static void main(String[] args) {
		String userStr = "";
		String[] userStrArr;
		String rep;
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		System.out.println();
		System.out.println("\t******************************");
		System.out.println("\t** Equation du second degré **");
		System.out.println("\t******************************");
		System.out.println();
		
		do {
			System.out.println(" Entrez l'expression du second degré à evaluer");
			System.out.println(" Utilisez \"x\" comme inconnu");
			System.out.println(" Separez les nombres et l'opérande par les espaces");
			System.out.println(" Forme generale : \"ax2 + bx + c = 0\"");
			System.out.println(" Nombres \"a\", \"b\" et \"c\" sont des entiers");
			System.out.println(" (example \"5x2 + 3x + 7 = 0\")");
			System.out.println(" (autres examples \"-5x2 - 7 = 0\", \"5x2 - 3x = 0\")");
			System.out.println(" \t\t\t<Entr> pour evaluer");
			System.out.println();
			System.out.print("C'est à vous \t: ");
			userStr = ConsoleIn.nextLine();
			
			//********************* test de roboustesse
			boolean retry=true;
			int[] expr;
			int delta;
			do {
				if(userStr.isEmpty()) {
					System.out.println("pas d'expression, recommencez en entrant l'expression");
				}else if(userStr.contains("  ")) {
					System.out.println("un seul espase entre les arguments, recommencez SVP");
				}else if(userStr.matches("^[-]?[0-9]*x2(( )?(\\+|-)( )?[0-9]*x)?(( )?(\\+|-)( )?[0-9]+)?( )?=( )?0$"))
					{retry=false;
				}else {
					System.out.println("expression n'est pas valide, recommencez SVP");
				};
				if(retry) {
					System.out.println();
					System.out.print("C'est à vous \t: ");
					userStr = ConsoleIn.nextLine();
				}
				System.out.println();
				System.out.print("Votre expression : \t");
				System.out.println(userStr);
				
				expr = parseExpr(userStr);
				delta = expr[1]*expr[1] - 4*expr[0]*expr[2];
				
				if(delta < 0) {
					retry=true;
					//System.out.println(delta);
					System.out.println(" \u0394 < 0, faites une autre expression SVP");
					System.out.println();
					System.out.print("C'est à vous \t: ");
					userStr = ConsoleIn.nextLine();
				};
				
			}while(retry);
			int result1, result2;
			if (delta == 0) {
				result1 = result2 = -(expr[1]/(2*expr[0]));
			} else if (delta > 0) {
				result1 = (int)(-expr[1] + Math.sqrt(delta)) / (2*expr[0]);
				result2 = (int)(-expr[1] - Math.sqrt(delta)) / (2*expr[0]);
			} else {
				System.out.println("Error");
				result1 = result2 = 0;
			};
			System.out.println("Solution :");
			System.out.println("\tx1 = " + result1);
			System.out.println("\tx2 = " + result2);
			
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
	
	static int[] parseExpr(String arg) {
		int[] ret = new int[3];
		if(!arg.matches("^[-]?[0-9]*x2(( )?(\\+|-)( )?[0-9]*x)?(( )?(\\+|-)( )?[0-9]+)?( )?=( )?0$")) {
			int[] retr = {0};
			return retr;
		}
		
		//tests des cas d'utilisation des equations courtes (non utilisé dans ce code)
		//arg = "5x2 + 3x + 2 = 0";
		//arg = "5x2 - 3x + 2 = 0";
		//arg = "5x2 + 3x - 2 = 0";
		//arg = "-5x2 + 3x - 2 = 0";
		//arg = "5x2 + 3x = 0";
		//arg = "5x2 + 2 = 0";
		//arg = "5x2 = 0";
		arg = arg.replaceAll("[ ]+", "");
		String[] temp = arg.split("x2");
		switch (temp[0]) {
			case "-" : {ret[0] = -1; break;}
			case "" : {ret[0] = 1; break;}
			default : {ret[0] = Integer.parseInt(temp[0]); break;}
		}
		if(temp[1].indexOf('x') != -1) {
			temp = temp[1].split("x");
			switch (temp[0]) {
				case "-" : {ret[1] = -1; break;}
				default : {ret[1] = Integer.parseInt(temp[0]);}
			}
		} else {ret[1] = 0;};
		if(temp[1].charAt(0) != '=') {
			temp = temp[1].split("=");
			ret[2] = Integer.parseInt(temp[0]);
		} else {
			ret[2] = 0;
		};
		
		
		
		
		return ret;
	};
	
}
