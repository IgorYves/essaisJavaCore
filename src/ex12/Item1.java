package ex12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

class Item1 {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String str = "";
		str = JOptionPane.showInputDialog(jop, "Entrez le nom de fichier à lire", "");
		//annul -> null; x -> null
		
		try {
			File f = new File(str);
			try (FileInputStream fInStr = new FileInputStream(f)) {
				byte[] b = new byte[fInStr.available()];
				fInStr.read(b);
				System.out.println(new String(b));
				
			} catch (IOException e) {System.out.println("\t:-(");}
			
		}
		catch (NullPointerException e) {System.out.println("\t:-(");}
		
		
		
		
	}
}
