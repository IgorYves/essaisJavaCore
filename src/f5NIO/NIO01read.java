package f5NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

class NIO01read {

	public static void main(String[] args) {
		int bufLength;
		int bufLengthMax = 12;
		String fileName = "NIO_1_file.txt";
		try (SeekableByteChannel fileChannel = Files.newByteChannel(Paths.get(fileName))) {
			ByteBuffer bBuffer = ByteBuffer.allocate(bufLengthMax);
			do {
				bufLength = fileChannel.read(bBuffer);
				if (bufLength != -1) {
					bBuffer.rewind();
					for (int i=0; i<bufLength; i++) {
						System.out.print((char)bBuffer.get());
					}
					//bBuffer.rewind();
					bBuffer.clear();
				}
			} while (bufLength != -1);
		} catch (IOException | InvalidPathException e) {e.printStackTrace();}
		
		System.out.println("\n------***------");
		
		try (FileChannel fileChannel2 = (FileChannel)Files.newByteChannel(Paths.get(fileName))) {
			long fileSize = fileChannel2.size();
			MappedByteBuffer mbBuffer = fileChannel2.map(FileChannel.MapMode.READ_ONLY, 0, fileSize);
			for (int i=0; i<fileSize; i++) {
				System.out.print((char)mbBuffer.get());
			}
		} catch (IOException | InvalidPathException e) {e.printStackTrace();}
		
		
	}

}
