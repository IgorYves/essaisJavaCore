package f5NIO;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class NIO03write2 {

	public static void main(String[] args) {
		String fileName = "NIO_1_file.txt";
		String text = "\nLorem ipsum\r\ndolor sit amet";
		
		try (FileChannel fileChannel = (FileChannel)Files.newByteChannel(Paths.get(fileName),
															StandardOpenOption.WRITE,
															StandardOpenOption.READ,
															StandardOpenOption.CREATE)) 
		{
			MappedByteBuffer mbBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 
											fileChannel.size(), text.length());
			for (int i=0; i<text.length(); i++) {
				mbBuffer.put((byte)text.charAt(i));
			}
		} catch (IOException | InvalidPathException e) {e.printStackTrace();}
	}
}
