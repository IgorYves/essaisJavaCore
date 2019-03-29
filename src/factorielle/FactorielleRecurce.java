package factorielle;

import java.util.Scanner;

class FactorielleRecurce {

	public static void main(String[] args) {
		long rez = 1;
		System.out.println();
		System.out.println("\t***************************");
		System.out.println("\t** Factorielle recurcive **");
		System.out.println("\t***************************");
		System.out.println();
		
		System.out.println("Entrez le nombre : ");
		
		String userStr = "";
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		userStr = ConsoleIn.nextLine();
		
		rez = getFactorial(userStr);
		
		if(rez == -1) {
			System.out.println("nombre negative n'a pas de factorielle, recommencez SVP");
		}
		else if(rez == -2) {
			System.out.println("votre nombre est trop grand pour java, recommencez SVP");
		}
		else if(rez == -3) {
			System.out.println("votre entrée n'est pas un nombre, recommencez SVP");
		}
		else if(rez < -3) {
			System.out.println("erreur inconnu");
		}
		else {
			System.out.println("-----------------");
			System.out.println(userStr + "! = " + rez);
			System.out.println("-----------------");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("pour info :");
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + "! = " + fact(i));
		}
		System.out.println("21! = " + "\u221E");
		System.out.print("\n------------\n\tfin");
		ConsoleIn.close();//fermeture de Scanner
	}//fin main
	
	public static long getFactorial(String s) {
		s = s.trim();
		if(s.matches("[^0-9]+"))return -3;
		if(s.length() == 0)return -3;
		if(s.length() > 2)return -2;
		int i = Integer.valueOf(s);
		return getFactorial(i);
	}
	public static long getFactorial(long i) {
		if(i < 0)return -1;
		if(i > 20)return -2;
		return fact((int)i);
	}
	public static long getFactorial(int i) {
		if(i < 0)return -1;
		if(i > 20)return -2;
		return fact(i);
	}
	private static long fact(int i) {
		if (i<=1)return 1;
		else return i*fact(i-1);
	};
}
