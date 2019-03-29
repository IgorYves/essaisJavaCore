package tpProprFlux;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.PropertyResourceBundle;
import java.util.Set;

class ReadInfos {

	public static void main(String[] args) throws IOException {
		String fileName = "infos.properties";
		String currKey;
		
		FileInputStream fileInStream = new FileInputStream(new File(fileName));
		PropertyResourceBundle propBundle =  new PropertyResourceBundle(fileInStream);
		Set<?> bundleKeys = propBundle.keySet();
		Iterator<?> itertr =  bundleKeys.iterator();
		while (itertr.hasNext()) {
			currKey = (String)itertr.next();
			System.out.println(currKey + " -----> " + propBundle.getString(currKey));
		}
		

	}

}
