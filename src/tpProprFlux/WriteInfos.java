package tpProprFlux;

import java.io.File;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

class WriteInfos {

	public static void main(String[] args) {
		String fileName = "infos.properties";
		int longMax = 45;
		String currKey;
		String currVal;
		String currStr;
		int compt = 0;//"=" or ":"
		
		Properties prprts = System.getProperties();
		Set<?> prprtsKeys = prprts.keySet();
		Iterator<?> itertr =  prprtsKeys.iterator();
		
		File f = new File(fileName);
		if (f.exists()) f.delete();
		f = null;
		
		try (FileChannel fileChannel = (FileChannel)Files.newByteChannel(Paths.get(fileName),
															StandardOpenOption.WRITE,
															StandardOpenOption.READ,
															StandardOpenOption.CREATE)) 
		{
			MappedByteBuffer mbBuffer;
			while (itertr.hasNext()) {
				currKey = (String)itertr.next();
				currVal = "";
				if (prprts.getProperty(currKey) == 
						System.getProperty("line.separator").toString()) {
					currVal += prprts.getProperty(currKey)
									.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r");
						}
				else if (prprts.getProperty(currKey).length() > longMax) {
					int count = 0;
					do {
						if (prprts.getProperty(currKey).length() < (count+1)*longMax) {
							currVal += "\t\t\t\t\t" + prprts.getProperty(currKey)
											.substring(count++*longMax)
											.replaceAll("\\\\", "\\\\\\\\");
						}
						else {
							currVal += (count==0?"":"\t\t\t\t\t") + prprts.getProperty(currKey)
											.substring(count++*longMax, count*longMax)
											.replaceAll("\\\\", "\\\\\\\\") + "\\\n";
						}
					} while (prprts.getProperty(currKey).length() > count*longMax);
				}
				else currVal += prprts.getProperty(currKey).replaceAll("\\\\", "\\\\\\\\");
				currVal += "\n";
				currStr = ((compt%2==0) ? "# " : "! ") 
						+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit\n";
				currStr += currKey + ((++compt%2==0) ? " = " : " : ") + currVal;
				mbBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 
													fileChannel.size(), currStr.length());
				for (int i=0; i<currStr.length(); i++) {
					mbBuffer.put((byte)currStr.charAt(i));
			}
		}
		} catch (IOException | InvalidPathException e) {e.printStackTrace();}

	}

}
