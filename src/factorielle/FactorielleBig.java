package factorielle;

import java.math.BigInteger;

import javax.swing.JOptionPane;

class FactorielleBig {

	public static void main(String[] args) {
		BigInteger rez = new BigInteger("1");
		BigInteger fct = new BigInteger("1");
		System.out.println();
		System.out.println("\t********************************");
		System.out.println("\t** Factorielle par BigInteger **");
		System.out.println("\t********************************");
		System.out.println();
		
		String userStr = "";
		JOptionPane jop = new JOptionPane();
		boolean continu = true;
		int retour;
		do {
			userStr = jop.showInputDialog("Entrez le nombre : ");
			try {
				rez = getFactorial(userStr);
				System.out.println("-----------------");
				System.out.println(userStr + "! = " + rez);
				System.out.println("-----------------");
				jop.showMessageDialog(jop, userStr + "! = " + rez);
			} catch (MyException1 | MyException2 | MyException3 e) {
				System.out.println("!!!!! " + e.getMessage());
				jop.showMessageDialog(jop, "!!!!! " + e.getMessage());
			}
			
			//essais avec un seul catch et traitement 
			//			des differents messages dans les Exeptions
			//si traitements differents --> plusieurs catchs
			retour = jop.showConfirmDialog(jop, "Voulez vous reessayer ?", "Continu ?", jop.YES_NO_OPTION);
			if(retour != 0)continu = false;
		} while (continu);
		
		System.out.println();
		System.out.println();
		/*System.out.println("pour info :");
		for (int i = 0; i <= 1229; i++) {
			System.out.println(i + "! = " + fact(new BigInteger(String.valueOf(i))));
		}*/
		//System.out.println("21! = " + "\u221E");
		System.out.print("\n------------\n\tfin");
	}//fin main
	
	public static BigInteger getFactorial(String s)
			throws MyException1, MyException2, MyException3 {
		s = s.trim();
		if(s.length() == 0)throw new MyException3();
		if(s.matches(".*[^0-9\\-]+.*"))throw new MyException3();
		BigInteger bi = new BigInteger(s);
		return getFactorial(bi);
	}
	public static BigInteger getFactorial(BigInteger bi)
			throws MyException1, MyException2, MyException3 {
		if(bi.compareTo(BigInteger.valueOf(0)) < 0)throw new MyException1();
		if(bi.compareTo(BigInteger.valueOf(13900)) > 0)throw new MyException2();
		return fact(bi);
	}
	private static BigInteger fact(BigInteger bi) {
		if (bi.equals(BigInteger.valueOf(1)))return BigInteger.valueOf(1);
		else return bi.multiply(fact(bi.subtract(BigInteger.valueOf(1))));
	};

}
