package repTel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.TreeMap;

class Item1 {
	private static final String FILE = "repTel";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Map<String, String> repTel = new TreeMap<String, String> ();
		repTel.put("Jeremy", "01.45.60.25.36");
		repTel.put("Cederic", "01.50.69.58.47");
		repTel.put("Julien", "01.47.89.63.25");
		repTel.put("Skywalker", "01.25.69.87.88");
		repTel.put("Moustafa", "01.23.65.47.89");
		repTel.put("Pierre", "01.47.89.63.25");
		repTel.put("Asif", "01.25.36.98.74");
		repTel.put("Kilian", "01.14.15.16.23");
		repTel.put("Ruban", "01.24.38.78.55");
		
		for (Map.Entry<String, String> g : repTel.entrySet()) {
	    	System.out.println(g.getKey() + "\t " + g.getValue());
	    }
		
		ObjectOutputStream oos = null;
		FileOutputStream fileOut = new FileOutputStream(FILE);
		oos = new ObjectOutputStream(fileOut);
		oos.writeObject(repTel);
		oos.flush();
		oos.close();
		
		
	}

}
