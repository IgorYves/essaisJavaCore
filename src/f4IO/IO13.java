package f4IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class IO13 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fName = "serialObj.txt";
		SerialiseMe sM = new SerialiseMe(5, 10, "bla bla");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fName))) {
			System.out.println(sM);
			oos.writeObject(sM);
		}
		System.out.println("-------------");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fName))) {
			SerialiseMe ssM = (SerialiseMe)ois.readObject();
			System.out.println(ssM);
		}
		
	}
}

class SerialiseMe implements Serializable {
	transient int i1;
	int i2;
	String s;
	
	SerialiseMe(int i1, int i2, String s) {
		this.i1 = i1;
		this.i2 = i2;
		this.s = s;
	}
	
	@Override
	public String toString() {
		return s + " " + i1 + " " + i2;
	}
}