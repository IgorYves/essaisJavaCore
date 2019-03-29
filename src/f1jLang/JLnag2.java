package f1jLang;

class JLnag2 {

	public static void main(String[] args) {
		byte[] intArr1 = {71,72,73,74,75,76,77,78,79};
		System.out.println(new String(intArr1));
		echoArr(intArr1);
		byte[] intArr2 = new byte[9];
		System.arraycopy(intArr1, 0, intArr2, 0, intArr1.length);
		echoArr(intArr2);
		intArr1[4] = 99;
		System.out.println();
		echoArr(intArr1);
		echoArr(intArr2);
		System.out.println();
		System.arraycopy(intArr2, 0, intArr2, 1, intArr2.length-2);
		echoArr(intArr2);
		System.arraycopy(intArr2, 0, intArr2, 3, intArr2.length-6);
		echoArr(intArr2);
		System.out.println();
		
		System.out.println(System.currentTimeMillis());
		System.gc();
		System.out.println(System.currentTimeMillis());
		
		System.out.println("abcd" + System.lineSeparator() + "efgh");
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		System.out.println(System.nanoTime());
		
		Politesse pts = new Politesse();
		pts = null;
		//System.runFinalization();
		System.gc();
		System.out.println("--------------");
		System.out.println("--------------");
		long startM, finM, startN, finN;
		startM = System.currentTimeMillis();
		startN = System.nanoTime();
		for (int i=0; i<1_000_000; i++) {int j = 0;}
		finM = System.currentTimeMillis();
		finN = System.nanoTime();
		System.out.println((finM-startM) + " ms");
		System.out.println((finN-startN) + " ns");
		System.out.println((double)(finN-startN)/1_000_000 + " ms");
		System.out.println((double)(finN-startN)/1_000_000_000 + " s");
		System.out.println("--------------");
		
		System.out.println(System.getProperty("java.vm.vendor"));
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.specification.version"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("java.home"));
		
	}
	private static void echoArr(byte[] i) {
		for (int j=0; j<i.length; j++) {
			System.out.print(i[j] + " ");
		}
		System.out.println();
	}
}

class Politesse {
	Politesse() {System.out.println("Bonjour");}
	@Override
	protected void finalize() {System.out.println("Au revoir");}
}