package f4IO;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class IO09 {

	public static void main(String[] args) throws IOException {
		byte[] buff = ("Loremp ipsum dolor sit amet").getBytes();
		int c;
		String fName2 = "newTestFile5.txt";
		ByteArrayInputStream bInput = new ByteArrayInputStream(buff);
		FileInputStream fInStr2 = new FileInputStream(fName2);
		
		try (SequenceInputStream in = new SequenceInputStream(fInStr2, bInput)) {
			while ((c = in.read()) != -1) System.out.print((char)c);
		}
	}
}
