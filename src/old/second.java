package old;
public class second {
	public static void main(String args[]) throws java.io.IOException {
		System.out.println("**************************************");
		System.out.println("salut");
		int vmin, vmax;
		vmin = 1;
		vmax = 20;
		System.out.print("entrez min : ");
		String vmins = System.console().readLine();
		System.out.print("entrez max : ");
		String vmaxs = System.console().readLine();
		System.out.println("**************************************");
		vmin = Integer.valueOf(vmins);
		vmax = Integer.valueOf(vmaxs);
		for (int i = vmin; i<=vmax; i++) {
			System.out.println( i + "	" + (i*i) + "	" + Math.sqrt(i));
		}
		System.out.println("**************************************");
	}
}