package f5NIO;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class NIO06outStream {

	public static void main(String[] args) {
		String fileName = "NIO_1_file.txt";
		String text = "\nLorem ipsum\r\ndolor sit amet";
		
		try (OutputStream fBuffer = new BufferedOutputStream(Files.newOutputStream(Paths.get(fileName),
																StandardOpenOption.WRITE,
																StandardOpenOption.APPEND,
																StandardOpenOption.CREATE))) {
			for (int i=0; i<text.length(); i++) {
				fBuffer.write((byte)text.charAt(i));
			}
		} catch (IOException | InvalidPathException e) {e.printStackTrace();}
		
		
		
	}
}
