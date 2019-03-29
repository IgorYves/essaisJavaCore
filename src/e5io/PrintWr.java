package e5io;

import java.io.PrintWriter;

class PrintWr {

	public static void main(String[] args) {
		PrintWriter p = new PrintWriter(System.out, true);
		p.println("bla");
		int i = -80;
		p.println(i);
		double d = .35E2;
		p.println(d);

	}

}
