package repTel;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

class Write2file {
	private static final String FILE2READ = "repTel";
	private static final String FILE2WRITE = "repTel.csv";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		FileInputStream fileIn = new FileInputStream(FILE2READ);
		ois = new ObjectInputStream(fileIn);
		
		Map<String, String> repTel = (Map<String, String>) ois.readObject();
		ois.close();
		
		FileWriter fw = new FileWriter(FILE2WRITE);
		fw.write("nom;numero" + System.getProperty("line.separator"));
		fw.flush();
		for (Map.Entry<String, String> g : repTel.entrySet()) {
	    	fw.write(g.getKey() + ";" + g.getValue() + System.getProperty("line.separator"));
			fw.flush();
	    }
		fw.close();

	}

}
