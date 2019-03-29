package f5NIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class NIO08dir {

	public static void main(String[] args) throws IOException {
		String dirName = ".";
		int offset = 1;
		//String patrn = ".*";
		//String patrn = "*.txt";
		String patrn = "*";
		Path dirPath = Paths.get(dirName);
		try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath, patrn)) {
			String formatStr = "%15s   %s";
			for (Path pth : dirStream) {
				if (Files.readAttributes(pth, BasicFileAttributes.class).isDirectory()) {
					System.out.printf(formatStr, "Catalogue", pth.getName(offset));
				} else if (Files.readAttributes(pth, BasicFileAttributes.class).isRegularFile()) {
					System.out.printf(formatStr, "Fichier", pth.getName(offset));
				} else {
					System.out.println("-----------inconnu");
				}
				System.out.println();
			}
		}
		
		System.out.println("--------------");
		DirectoryStream.Filter<Path> filtrer = new DirectoryStream.Filter<Path>() {
			@Override
			public boolean accept(Path entry) throws IOException {
				if (Files.readAttributes(entry, BasicFileAttributes.class).size() > 300) return true;
				return false;
			}
			
		};
		try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath, filtrer)) {
			String formatStr = "%15s   %s";
			for (Path pth : dirStream) {
				if (Files.readAttributes(pth, BasicFileAttributes.class).isDirectory()) {
					System.out.printf(formatStr, "Catalogue", pth.getName(offset));
				} else if (Files.readAttributes(pth, BasicFileAttributes.class).isRegularFile()) {
					System.out.printf(formatStr, "Fichier", pth.getName(offset));
				} else {
					System.out.println("-----------inconnu");
				}
				System.out.println();
			}
		}
		
		
	}
}
