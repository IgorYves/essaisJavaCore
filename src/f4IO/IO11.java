package f4IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class IO11 {

	public static void main(String[] args) throws IOException {
		String fname = "newTestFile4.txt";
		try (FileReader fr = new FileReader(fname)) {
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print((char)c);
			}
		}
		
		try (FileWriter fw = new FileWriter(fname, true)) {
			fw.write("\nbla bla bla");
		}
		
		
		
	}
}
