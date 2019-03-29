package i5rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AddClient {

	public static void main(String[] args) {
		String serverURL = "rmi://127.0.0.1/AddServer";
		try {
			AddServerInterface addServerInterface = (AddServerInterface)Naming.lookup(serverURL);
			System.out.println(addServerInterface.add(2.5, .2));
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		
	}
}
