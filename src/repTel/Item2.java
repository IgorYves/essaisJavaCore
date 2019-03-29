package repTel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

class Item2 {
	private static final String FILE = "repTel";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
				
		ObjectInputStream ois = null;
		FileInputStream fileIn = new FileInputStream(FILE);
		ois = new ObjectInputStream(fileIn);
		
		Map<String, String> repTel = (Map<String, String>) ois.readObject();
		ois.close();
		
		for (Map.Entry<String, String> g : repTel.entrySet()) {
	    	System.out.println(g.getKey() + "\t " + g.getValue());
	    }
	}

}
