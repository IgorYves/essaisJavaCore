package f4IO;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;

class IO07 {

	public static void main(String[] args) throws IOException {
		String s = "Loremp ipsum dolor sit amet";
		byte[] byteBuff = (s).getBytes();
		char[] carBuff = new char[s.length()];
		s.getChars(0, s.length(), carBuff, 0);
		int c;
		boolean mark = false;
		ByteArrayInputStream bInput = new ByteArrayInputStream(byteBuff);
		CharArrayReader creader = new CharArrayReader(carBuff);
		
		//try (BufferedInputStream buffIn = new BufferedInputStream(bInput)) {
		try (BufferedReader buffIn = new BufferedReader(creader)) {
				while ((c = buffIn.read()) != -1) {
				switch (c) {
					case 'i' :
						if (!mark) {
							buffIn.mark(10);
							mark = true;
						} else mark = false;
						break;
					case 'p' :
						if (mark) {
							System.out.print("|->_ip_<-|");
							mark = false;
						} else System.out.print((char)c);
						break;
					case ' ' :
						if (mark) {
							System.out.print("i");
							buffIn.reset();
							mark = false;
						} else System.out.print((char)c);
						break;
					default : if (!mark) System.out.print((char)c);
				}
			}
		}//fin try
	}
}
