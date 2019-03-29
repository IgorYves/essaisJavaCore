package f6net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

class Net02socket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket soc = new Socket("whois.afnic.fr", 43);
		InputStream in = soc.getInputStream();
		OutputStream out = soc.getOutputStream();
		String str = "prodislog.fr";
		byte[] strBuff = str.getBytes();
		out.write(strBuff);
		int c;
		while (-1 != (c = in.read())) {
			System.out.print((char)c);
		}
		soc.close();

	}

}
