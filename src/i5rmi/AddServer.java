package i5rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class AddServer {

	public static void main(String[] args) {
		try {
			AddServerImplm addServerImplm = new AddServerImplm();
			Naming.rebind("AddServer", addServerImplm);
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
		

	}

}
