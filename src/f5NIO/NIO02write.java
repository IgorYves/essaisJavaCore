package f5NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class NIO02write {

	public static void main(String[] args) {
		int bufLength;
		int bufLengthMax = 12;
		int currPos = 0;
		String fileName = "NIO_1_file.txt";
		String text = "\nLorem ipsum\r\ndolor sit amet";
		String text2write = "";
		try (FileChannel fileChannel = (FileChannel)Files.newByteChannel(Paths.get(fileName),
													StandardOpenOption.CREATE, 
													StandardOpenOption.WRITE, 
													StandardOpenOption.APPEND)) 
		{
			ByteBuffer bBuffer = ByteBuffer.allocate(bufLengthMax);
			do {
				if ((text.length() - currPos) < bufLengthMax) {
					text2write = text.substring(currPos);
					bufLength = text.length() - currPos;
				}
				else {
					text2write = text.substring(currPos, currPos + bufLengthMax);
					bufLength = bufLengthMax;
				}
				currPos += bufLengthMax;
				bBuffer.clear();
				for (int i=0; i<bufLength; i++) {
					bBuffer.put((byte)text2write.charAt(i));
				}
				bBuffer.flip();
				fileChannel.write(bBuffer);
			} while (currPos < text.length());
		} catch (IOException | InvalidPathException e) {e.printStackTrace();}
		
		
		
	}

}
