package ex12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.JOptionPane;

class Item2 {

	public static void main(String[] args) {
		String fileNameIn = "in010607.log";
		String fileNameOut = "in010607.csv";
		JOptionPane jop = new JOptionPane();
		String userRetour;
		String strTemp = "";
		String[] strTempArr;
		String strOut = "";
		char c;
		userRetour = JOptionPane.showInputDialog(jop, "Entrez le nom de fichier à transformer", "");
		if (userRetour != null && userRetour.length() > 0) fileNameIn = userRetour;
		File f = new File(fileNameIn);
		if (f.exists()) {
			try (FileInputStream fInStr = new FileInputStream(f)) {
				while (fInStr.available() > 0) {
					c = (char)fInStr.read();
					if (c != '\n') strTemp += c;
					else if (c == '\n') {
						strTempArr = strTemp.split(",");
						strOut += strTempArr[0].trim() + ";" 
								+ strTempArr[3].trim() + ";" 
								+ "http://" + strTempArr[6].trim()
								+ strTempArr[13].trim().replaceAll(" ", "%20")
								+ System.getProperty("line.separator");
						strTemp = "";
					}
					else System.out.println(1/0);
				}
			} catch (IOException e) {
				System.err.println("error");
			}
		}
		//System.out.println(strOut);
		
		int bufLength;
		int bufLengthMax = 1024;
		int currPos = 0;
		String text2write = "";
		try (FileChannel fileChannel = (FileChannel)Files.newByteChannel(Paths.get(fileNameOut),
													StandardOpenOption.CREATE, 
													StandardOpenOption.WRITE)) 
		{
			ByteBuffer bBuffer = ByteBuffer.allocate(bufLengthMax);
			do {
				if ((strOut.length() - currPos) < bufLengthMax) {
					text2write = strOut.substring(currPos);
					bufLength = strOut.length() - currPos;
				}
				else {
					text2write = strOut.substring(currPos, currPos + bufLengthMax);
					bufLength = bufLengthMax;
				}
				currPos += bufLengthMax;
				bBuffer.clear();
				for (int i=0; i<bufLength; i++) {
					bBuffer.put((byte)text2write.charAt(i));
				}
				bBuffer.flip();
				fileChannel.write(bBuffer);
			} while (currPos < strOut.length());
		} catch (IOException | InvalidPathException e) {e.printStackTrace();}
		
		
	}
}
