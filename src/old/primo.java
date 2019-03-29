package old;
public class primo {
	public static void main (String args[]) {
		System.out.println("*******************");
		System.out.println("salut");
		System.out.println("*******************");
		if (args.length == 0) {
			System.out.println("arguments non definis");
			System.out.println("*******************");
		}
		//int maxargs = 0;
		for (int i = 0; i < args.length; i++) {
			System.out.println("argument " + i + " = " + args[i]);
			//maxargs = i;
		}
		System.out.println("*******************");
		if (args.length < 5) {
			System.out.println("pas suffisament des arguments pour somme");
		} else {
			int summa;
			summa = (Integer.parseInt(args[3])) + (Integer.parseInt(args[4]));
			System.out.println("arg 3 + arg 4 = " + summa);
		};
		System.out.println("*******************");
		/**/
	};
};