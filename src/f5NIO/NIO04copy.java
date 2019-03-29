package f5NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

class NIO04copy {

	public static void main(String[] args) {
		String fileName1 = "NIO_1_file.txt";
		String fileName2 = "NIO_2_file.txt";
		
		try {
			Files.copy(Paths.get(fileName1), Paths.get(fileName2), StandardCopyOption.REPLACE_EXISTING);
		}
		catch (IOException | InvalidPathException e) {e.printStackTrace();}
	}
}
