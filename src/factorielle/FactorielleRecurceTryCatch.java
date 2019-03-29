package factorielle;

import java.util.Scanner;

class FactorielleRecurceTryCatch {

	public static void main(String[] args) {
		long rez = 1;
		System.out.println();
		System.out.println("\t**************************************");
		System.out.println("\t** Factorielle par boucle try/catch **");
		System.out.println("\t**************************************");
		System.out.println();
		
		System.out.println("Entrez le nombre : ");
		
		String userStr = "";
		java.util.Scanner ConsoleIn = new Scanner(System.in);
		userStr = ConsoleIn.nextLine();
		try {
			rez = getFactorial(userStr);
			System.out.println("-----------------");
			System.out.println(userStr + "! = " + rez);
			System.out.println("-----------------");
		} 
		catch (MyException1 | MyException2 | MyException3 e) {
			System.out.println(e);
		}
		//essais avec un seul catch et traitement 
		//			des differents messages dans les Exeptions
		//si traitements differents --> plusieurs catchs
		
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
	
	public static long getFactorial(String s)
			throws MyException1, MyException2, MyException3 {
		s = s.trim();
		if(s.matches("[^0-9]+"))throw new MyException3();
		if(s.length() == 0)throw new MyException3();
		if(s.length() > 2)throw new MyException2();
		int i = Integer.valueOf(s);
		return getFactorial(i);
	}
	public static long getFactorial(long i)
			throws MyException1, MyException2, MyException3 {
		if(i < 0)throw new MyException1();
		if(i > 20)throw new MyException2();
		return fact((int)i);
	}
	public static long getFactorial(int i)
			throws MyException1, MyException2, MyException3 {
		if(i < 0)throw new MyException1();
		if(i > 20)throw new MyException2();
		return fact(i);
	}
	private static long fact(int i) {
		if (i<=1)return 1;
		else return i*fact(i-1);
	};
}