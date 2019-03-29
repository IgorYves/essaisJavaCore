package f2jUtil1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

class JUtil15 {

	public static void main(String[] args) {
		
		Properties pr = new Properties();
		pr.put("Joe", "01.25.69.89.36");
		pr.put("Jim", "02.58.45.63.25");
		pr.put("Vero", "01.45.69.85.25");
		pr.put("Seb", "06.15.20.33.44");
		pr.put("Chris", "09.15.42.86.36");
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream ("tels.txt");
			if (fileOut != null) {
				pr.store(fileOut, "Tel kniga");
				fileOut.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fileOut = new FileOutputStream ("telsXML.txt");
			if (fileOut != null) {
				pr.storeToXML(fileOut, "Tel kniga");
				fileOut.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
