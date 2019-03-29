package f4IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

class IO04 {

	public static void main(String[] args) throws IOException {
		JOptionPane jop = new JOptionPane();
		int reponse;
		String fName1 = "newTestFile4.txt";
		String fName2 = "newTestFile5.txt";
		File f1 = new File(fName1);
		if (f1.exists()) {
			try (FileInputStream fInStr1 = new FileInputStream(f1)) {
				System.out.println("available " + fInStr1.available() + " b");
				while (fInStr1.available() > 0) {
					System.out.print((char)fInStr1.read() + " ");
				}
				System.out.println("\navailable " + fInStr1.available() + " b");
				
				
				
			} catch (IOException e) {
				System.err.println("error");
			}
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
		try (FileInputStream fInStr2 = new FileInputStream(fName2)) {
			fInStr2.skip(1);
			byte[] b = new byte[fInStr2.available()];
			fInStr2.read(b);
			System.out.println(new String(b));
			
		} catch (IOException e) {
			System.err.println("error");
		}
		
		
		
		
	}
}
