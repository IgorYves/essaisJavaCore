package f5NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class NIO09tree {

	public static void main(String[] args) throws IOException {
		String dirName = ".";
		System.out.printf("Catalogue \"%s\" :\n", dirName);
		System.out.println("----------");
		try {
			Files.walkFileTree(Paths.get(dirName), new EssFVisitor());
		} catch (IOException e) {e.printStackTrace();}
		
		
	}
}

class EssFVisitor extends SimpleFileVisitor<Path> {
	@Override
	public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException {
		System.out.println(path);
		return FileVisitResult.CONTINUE;
	}
}