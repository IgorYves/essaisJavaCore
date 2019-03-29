package s48_afpa_ex.ex04;

import java.util.Scanner;

class Tests {

	public static void main(String[] args) {
		String userStr = "1 - 1";
		System.out.println(userStr.matches("[-]?[0-9]+[ ][/*\\-+][ ][-]?[0-9]+"));
		
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		String s = "";
		for (int i = 0; i <10; i++) {
			System.out.println(i);
			System.out.print("continuer ? (o/n)");
			s = ConsoleIn.next();
		}
		
		
		System.out.print("\n------------\n\tfin");
		ConsoleIn.close();//fermeture de Scanner
	}

}
