package f4IO;

import java.io.Console;
import java.io.IOException;

class IO12 {

	public static void main(String[] args) throws IOException {
		Console cons = System.console();
		if (cons == null) {
			System.out.println("console inaccessible");
			return;
		}
		String usrStr = cons.readLine("entrez text : ");
		cons.printf("votre text : %s", usrStr);
	}
}
