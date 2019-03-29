package f4IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

class IO05 {

	public static void main(String[] args) throws IOException {
		JOptionPane jop = new JOptionPane();
		int reponse;
		String fName1 = "newTestFile4.txt";
		String fName2 = "newTestFile5.txt";
		File f1 = new File(fName1);
		if (f1.exists()) {
			try (FileInputStream fInStr1 = new FileInputStream(f1)) {
				String txtFile = "";
				while (fInStr1.available() > 0) txtFile += (char)fInStr1.read();
				reponse = jop.showConfirmDialog(jop, "contenu :\n----------\n" 
												+ txtFile + "\n----------\nDoubler ?", 
						"File " + fName1, jop.YES_NO_OPTION);
				if (reponse == 0) {
					try (FileOutputStream fOutStr1 = new FileOutputStream(f1, true)) {
						byte[] buff = ("\n\n" + txtFile).getBytes();
						fOutStr1.write(buff);
					} catch (IOException e) {System.err.println("error");}
				}
			} catch (IOException e) {System.err.println("error");}
			
			
		}
		else {
			reponse = jop.showConfirmDialog(jop, fName1 + " n'exist pas\nCreer " + fName1 + " ?", 
							"File", jop.YES_NO_OPTION);
			if (reponse == 0) {
				if (f1.createNewFile()) {
					jop.showMessageDialog(jop, fName1 + " est creé", 
							"File", jop.INFORMATION_MESSAGE);
				}
			}
		}
		
		System.out.println("-----------------");
		
		
		
		
		
	}
}
