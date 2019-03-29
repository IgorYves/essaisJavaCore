package f6net;

import java.net.InetAddress;
import java.net.UnknownHostException;

class Net01adr {

	public static void main(String[] args) {
		try {
			InetAddress iAdr = InetAddress.getLocalHost();
			System.out.println(iAdr);
			
			iAdr = InetAddress.getByName("prodislog.fr");
			System.out.println(iAdr);
			
			InetAddress[] iAdrs = InetAddress.getAllByName("www.google.com");
			for (InetAddress a : iAdrs) {
				System.out.println(a);
			}
			System.out.println(iAdrs.length);
			System.out.println(iAdrs[0].getHostAddress());
			System.out.println(iAdrs[0].getHostName());
			System.out.println(iAdrs[0].isMulticastAddress());
			
		} catch (UnknownHostException e) {e.printStackTrace();}
		

	}

}
