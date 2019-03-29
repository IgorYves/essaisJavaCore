package f4IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class IO10 {

	public static void main(String[] args) throws IOException {
		String fname = "testDataStream.dat";
		try (DataOutputStream dataOut = 
						new DataOutputStream(new FileOutputStream(fname))) {
			dataOut.writeInt(8);
			dataOut.writeDouble(5.5);
		}
		
		try (DataInputStream dataIn = new DataInputStream(new FileInputStream(fname))) {
			System.out.println(dataIn.readInt());
			System.out.println(dataIn.readDouble());
			//System.out.println(dataIn.readInt());//error
		}
		
		
		
	}
}
