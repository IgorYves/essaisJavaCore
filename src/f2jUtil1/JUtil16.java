package f2jUtil1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

class JUtil16 {

	public static void main(String[] args) {
		
		Properties pr = new Properties();
		Properties pr2 = new Properties();
		FileInputStream fileIn = null;
		try {
			fileIn = new FileInputStream ("tels.txt");
			if (fileIn != null) {
				pr.load(fileIn);
				fileIn.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fileIn = new FileInputStream ("telsXML.txt");
			if (fileIn != null) {
				pr2.loadFromXML(fileIn);
				fileIn.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Set<?> st = pr.keySet();
		for (Object o : st) {
			System.out.println(o + "\t" + pr.getProperty((String)o));
		}
		System.out.println("------------");
		st = pr2.keySet();
		for (Object o : st) {
			System.out.println(o + "\t" + pr.getProperty((String)o));
		}
		
		
		
		
	}
}
