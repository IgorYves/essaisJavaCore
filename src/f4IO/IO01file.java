package f4IO;

import java.io.File;
import java.io.IOException;

class IO01file {

	public static void main(String[] args) throws IOException {
		
		File f = new File("newTestFile.txt");
		System.out.println("exist ? : " + f.exists());
		System.out.println("toString : " + f.toString());
		System.out.println("getName : " + f.getName());
		System.out.println("getPath : " + f.getPath());
		System.out.println("getAbsolutePath : " + f.getAbsolutePath());
		System.out.println("getCanonicalPath : " + f.getCanonicalPath());
		System.out.println("isAbsolute : " + f.isAbsolute());
		System.out.println("getParent : " + f.getParent());
		System.out.println("isDirectory : " + f.isDirectory());
		System.out.println("isFile : " + f.isFile());
		System.out.println("isHidden : " + f.isHidden());
		System.out.println("canRead : " + f.canRead());
		System.out.println("canWrite : " + f.canWrite());
		System.out.println("canExecute : " + f.canExecute());
		System.out.println("length : " + f.length());
		System.out.println("lastModified : " + f.lastModified());
		System.out.println("getFreeSpace : " + f.getFreeSpace());
		System.out.println("getTotalSpace : " + f.getTotalSpace());
		System.out.println("getUsableSpace : " + f.getUsableSpace());
		
		
		System.out.println();
		File f2 = new File("newTestFile_2.txt");
		if (!f2.exists()) {
			f.renameTo(f2);
		}
		else {
			System.out.println("\t\t file existe deja");
			f2.renameTo(f);
		}
		
		System.out.println("------------");
		File f3 = new File("temFile.txt");
		if (!f3.exists()) {
			if (f3.createNewFile()) System.out.println("file temFile.txt created");
		}
		else f3.deleteOnExit();
		
	}

}
