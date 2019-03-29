package f5NIO;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

class NIO05inStream {

	public static void main(String[] args) {
		String fileName = "NIO_1_file.txt";
		
		try (InputStream fileStream = Files.newInputStream(Paths.get(fileName))) {
			int i;
			do {
				i = fileStream.read();
				if (i != -1) System.out.print((char)i);
			} while (i != -1);
		} catch (IOException | InvalidPathException e) {e.printStackTrace();}
		
		
		
	}
}
