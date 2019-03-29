package e5io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class WriteMetode {

	public static void main(String[] args) {
		int b;
		b = 'А';
		System.out.write (b);
		System.out.write ('\n');
		
		File f = new File("test.txt");
		System.out.println(f.exists());
		try {f.createNewFile();} catch (IOException e) {e.printStackTrace();}
		System.out.println(f.exists());
		System.out.println(f.length());
		File d = new File("testDir");
		System.out.println(d.exists());
		d.mkdir();
		System.out.println(d.exists());
		File f2 = new File("testDir", "test2.txt");
		try {f2.createNewFile();} catch (IOException e) {e.printStackTrace();}
		System.out.println(f2.length());
		
		try {
			FileWriter fw = new FileWriter("test.txt");
			fw.write("bla bla bla ");
			fw.flush();
			System.out.println(f.length());
			fw.close();
			FileWriter fw2 = new FileWriter(f2, true);
			fw2.write("Lorem ipsum dolor sit amet\n");
			fw2.flush();
			System.out.println(f2.length());
			fw2.close();
		} catch (IOException e) {e.printStackTrace();}
		System.out.println("-------------");
		try {
			FileReader fr = new FileReader("test.txt");
			int i = fr.read();
			while (i != -1) {
				System.out.print((char)i);
				i = fr.read();
			}
			fr.close();
			System.out.println("\n-------------");
			FileReader fr2 = new FileReader(f2);
			i = fr2.read();
			while (i != -1) {
				System.out.print((char)i);
				i = fr2.read();
			}
			char[] charArr2 = new char[(int) f2.length()];
			int j = fr2.read(charArr2);
			for(int k=0; k<j; k++) {
				System.out.print(charArr2[k]);
			}
			fr2.close();
		} catch (IOException e) {e.printStackTrace();}
		System.out.println("-------------");
		
	}
}
