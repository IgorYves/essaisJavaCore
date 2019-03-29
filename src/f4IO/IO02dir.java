package f4IO;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

class IO02dir {

	public static void main(String[] args) throws IOException {
		
		File f = new File(".");
		System.out.println(". exists ? : " + f.exists());
		System.out.println(". isDirectory ? : " + f.isDirectory());
		System.out.println("getName : " + f.getName());
		System.out.println("getPath : " + f.getPath());
		System.out.println("getAbsolutePath : " + f.getAbsolutePath());
		System.out.println("getCanonicalPath : " + f.getCanonicalPath());
		System.out.println("isAbsolute : " + f.isAbsolute());
		System.out.println("getParent : " + f.getParent());
		System.out.println("toString : " + f.toString());
		
		System.out.println("---------------");
		String[] nomsArr = f.list();
		for (int i=0; i<nomsArr.length; i++) {
			File tmp = new File(nomsArr[i]);
			if (tmp.isDirectory()) System.out.println("dir : " + nomsArr[i]);
			else if (tmp.isFile()) System.out.println("file : " + nomsArr[i]);
			else System.out.println(1/0);
		}
		
		System.out.println("---------------");
		
		String patrn = "[.].+";
		
		FFilter filtr = new FFilter(patrn);
		nomsArr = f.list(filtr);
		for (int i=0; i<nomsArr.length; i++) {
			File tmp = new File(nomsArr[i]);
			if (tmp.isDirectory()) System.out.println("dir\t: " + nomsArr[i]);
			else if (tmp.isFile()) System.out.println("file\t: " + nomsArr[i]);
			else System.out.println(1/0);
		}
		
		System.out.println("---------------");
		FilenameFilter ifiltr = (dir, name) -> {return name.matches(patrn);};
		nomsArr = f.list(ifiltr);
		for (int i=0; i<nomsArr.length; i++) {
			File tmp = new File(nomsArr[i]);
			if (tmp.isDirectory()) System.out.println("dir\t: " + nomsArr[i]);
			else if (tmp.isFile()) System.out.println("file\t: " + nomsArr[i]);
			else System.out.println(1/0);
		}
		
		System.out.println("---------------");
		FileFilter ffiltr = (file) -> {return file.getName().matches(patrn);};
		File[] fArr = f.listFiles(ffiltr);
		for (int i=0; i<fArr.length; i++) {
			if (fArr[i].isDirectory()) System.out.println("dir\t: " + fArr[i].getName());
			else if (fArr[i].isFile()) System.out.println("file\t: " + fArr[i].getName());
			else System.out.println(1/0);
		}
		
		
	}
}

class FFilter implements FilenameFilter {
	String pattern;
	FFilter(String s) {
		pattern = s;
	}
	@Override
	public boolean accept(File dir, String nom) {
		return nom.matches(pattern);
	}
	
}