package f6net;

import java.net.MalformedURLException;
import java.net.URL;

class Net03url {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://Jojo:lApIn@www.example.com:8888/chemin/d/acces.php?q=req&q2=req2#signet");
		System.out.println("getProtocol " + url.getProtocol());
		System.out.println("getHost " + url.getHost());
		System.out.println("getFile " + url.getFile());
		System.out.println("getPort " + url.getPort());
		System.out.println("getPath " + url.getPath());
		System.out.println("getAuthority " + url.getAuthority());
		System.out.println("getQuery " + url.getQuery());
		System.out.println("getRef " + url.getRef());
		System.out.println("getUserInfo " + url.getUserInfo());
		System.out.println("toExternalForm " + url.toExternalForm());
		System.out.println("toString " + url.toString());
		
		

	}

}
