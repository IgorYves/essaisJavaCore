package f4IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

class IO08 {

	public static void main(String[] args) throws IOException {
		String s = "if (x == 0) {int i = 5;}";
		System.out.println(s);
		byte[] buff = s.getBytes();
		int c;
		ByteArrayInputStream bInput = new ByteArrayInputStream(buff);
		System.out.println("markSupported : " + bInput.markSupported());
		try (PushbackInputStream buffInStre = new PushbackInputStream(bInput)) {
			System.out.println("markSupported : " + bInput.markSupported());
			while ((c = buffInStre.read()) != -1) {
				switch (c) {
					case '=' :
						if ((c = buffInStre.read()) == '=') {
							System.out.print(" equals ");
						} else {
							buffInStre.unread(c);
							System.out.print(" <-- ");
						}
						break;
					default : System.out.print((char)c);
				}
			}
		}
	}
}
