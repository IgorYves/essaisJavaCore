package f5NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class NIO07fileAttrs {

	public static void main(String[] args) throws IOException {
		String fileName = "NIO_1_file.txt";
		Path filePath = Paths.get(fileName);
		
		System.out.println(filePath.getName(0));
		System.out.println(filePath);
		System.out.println(Files.readAttributes(filePath, BasicFileAttributes.class).isDirectory());
		System.out.println(Files.readAttributes(filePath, BasicFileAttributes.class).isRegularFile());
		System.out.println(Files.readAttributes(filePath, BasicFileAttributes.class).lastModifiedTime());
		
		
	}
}
