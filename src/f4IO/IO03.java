package f4IO;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

class IO03 {

	public static void main(String[] args) throws IOException {
		String name = "tmpDir";
		JOptionPane jop = new JOptionPane();
		int reponse;
		
		File f = new File(name);
		System.out.println(name + (f.exists()?" exist":" n'exist pas"));
		if (!f.exists()) {
			reponse = jop.showConfirmDialog(jop, name + " n'exist pas\nCreer " + name + " ?", 
											"Catalogue", jop.YES_NO_OPTION);
			if (reponse == 0) {
				f.mkdir();
				System.out.println(name + (f.exists()?" exist":" n'exist pas"));
			}
		}
		else if (f.exists()) {
			reponse = jop.showConfirmDialog(jop, name + " exist\nEffacer " + name + " ?", 
											"Catalogue", jop.YES_NO_OPTION);
			if (reponse == 0) {
				f.delete();
				System.out.println(name + (f.exists()?" exist":" n'exist pas"));
			}
		}
		else System.out.println(1/0);
		
		
	}
}
