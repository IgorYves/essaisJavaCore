package f1jLang;

class JLang {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		rt.gc();
		echoMem(rt);
		
		Integer[] intArr = new Integer[1000];
		for (int i=0; i<intArr.length; i++) {
			intArr[i] = new Integer(i);
		}
		echoMem(rt);
		for (int i=0; i<intArr.length; i++) {
			intArr[i] = null;
		}
		rt.gc();
		echoMem(rt);
		System.out.println();
		
		Process p = null;
		try {
			System.out.println("lancement de Notepad");
			p = rt.exec("Notepad");
			p.waitFor();
		}
		catch(Exception e) {
			System.out.println("Erreur Notepad");
		}
		finally {
			System.out.println("Notepad retour : " + p.exitValue());
		}
		System.out.println();
		
		System.out.println();
		ProcessBuilder pr = new ProcessBuilder("notepad.exe", "newTestFile");
		try {
			pr.start();
		}
		catch(Exception e) {
			System.out.println("Erreur Notepad");
		}
		finally {
			System.out.println("Notepad fin");
		}
	}
	
	private static void echoMem(Runtime rt) {
		System.out.println("memory used :\t" + (rt.totalMemory() - rt.freeMemory()));
	}
}
