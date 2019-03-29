package ex12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.JOptionPane;

class Item3 {
	private static String fileNameIn = "in010607.log";
	private static String fileNameOut = "in010607.csv";
	
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		String userRetour;
		int usrRetour;
		String strTemp = "";
		String[] strTempArr;
		String strOut = "";
		char c;
		userRetour = JOptionPane.showInputDialog(jop, "Entrez l'adresse de fichier à transformer", "");
		if (userRetour != null && userRetour.length() > 0) fileNameIn = userRetour;
		File f = new File(fileNameIn);
		if (!f.exists()) {
			jop.showMessageDialog(jop, 
					"Le fichier " + fileNameIn + " n'existe pas", 
					"Error", 
					jop.ERROR_MESSAGE);
			System.exit(0);
		}
		else if (!f.canRead()) {
			jop.showMessageDialog(jop, 
					"Le fichier " + fileNameIn + " n'admet pas la lecture", 
					"Error", 
					jop.ERROR_MESSAGE);
			System.exit(0);
		}
		else if (!f.isFile()) {
			jop.showMessageDialog(jop, 
					"Le fichier " + fileNameIn + " n'est pas un fichier", 
					"Error", 
					jop.ERROR_MESSAGE);
			System.exit(0);
		}
		else if (!f.getPath().matches(".*[.]log$")) {
			jop.showMessageDialog(jop, 
								"Le fichier " + f.getPath()
								+ "\nsemble ne pas etre un fichier \"log\"", 
								"Error", 
								jop.ERROR_MESSAGE);
			System.exit(0);
		}
		
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
		} else System.out.println(1/0);
		//System.out.println(strOut);
		//--------------------------------------------------------------------------
		
		fileNameOut = f.getPath().replaceAll("[.]log$", "") + ".csv";
		File fOut = new File(fileNameOut);
		boolean ecrase = true;
		if (fOut.exists() && !fOut.canWrite()) {
			jop.showMessageDialog(jop, 
								"Le fichier n'admet pas l'ecriture", 
								"Error", 
								jop.ERROR_MESSAGE);
			System.exit(0);
		}
		else if (fOut.exists()) {
			String[] boutons = {"Ajouter", "Ecraser", "Annuler"};
			usrRetour = jop.showOptionDialog(jop, 
							"Fichier " + fileNameOut + " existe deja,"
												+ "\najouter nouveau contenu à l'existant ?"
												+ "\necraser ancien contenu par nouveau ?", 
							"Fichier existe !",
							jop.YES_NO_CANCEL_OPTION, //DEFAULT_OPTION, YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION
							jop.WARNING_MESSAGE, //ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE
							null, boutons, boutons[2]);
			//x -> -1; index of boutons Array
			if(usrRetour == jop.CLOSED_OPTION || usrRetour == 2) System.exit(0);
			else if (usrRetour == 0) ecrase = false;
			else if (usrRetour == 1) ecrase = true;
			else System.out.println(1/0);
		}
		
		try {
			FileChannel fileChannel = null;
			if (ecrase) {
				fileChannel = (FileChannel)Files.newByteChannel(Paths.get(fileNameOut),
											StandardOpenOption.CREATE, 
											StandardOpenOption.WRITE);
			}
			else {
				fileChannel = (FileChannel)Files.newByteChannel(Paths.get(fileNameOut),
											StandardOpenOption.CREATE, 
											StandardOpenOption.WRITE, 
											StandardOpenOption.APPEND);
			}
			int bufLength;
			int bufLengthMax = 1024;
			int currPos = 0;
			String text2write = "";
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
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		
		
	}
}
