package f4IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class IO06 {

	public static void main(String[] args) throws IOException {
		String fName2 = "newTestFile5.txt";
		String txt = "Lorem ipsum dolor sit amet, \r\n" + 
					"consectetur adipiscing elit, \r\n" + 
					"sed do eiusmod tempor incididunt \r\n" + 
					"ut labore et dolore magna aliqua.";
		byte[] buff = txt.getBytes();
		ByteArrayInputStream bInput = new ByteArrayInputStream(buff);
		while (bInput.available() > 0) System.out.print((char)bInput.read() + "|");
		System.out.println("\n-----------------");
		System.out.println(bInput.markSupported());
		System.out.println("\n-----------------");
		bInput.reset();
		while (bInput.available() > 0) System.out.print((char)bInput.read());
		System.out.println("\n-----------------");
		System.out.println("\n-----------------");
		
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
		bOutput.write(buff);
		System.out.println(bOutput.toString());
		
		System.out.println("\n-----------------");
		bOutput.write((new String("\n\n")).getBytes());
		bOutput.write(buff, 0, 20);
		bOutput.write((new String("\n\n")).getBytes());
		System.out.println(bOutput.toString());
		
		try (FileOutputStream fOutStr2  = new FileOutputStream(fName2, true)) {
			bOutput.writeTo(fOutStr2);
		} catch (IOException e) {System.err.println("error");}
		
		
	}
}
