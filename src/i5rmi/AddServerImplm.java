package i5rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServerImplm extends UnicastRemoteObject implements AddServerInterface {

	protected AddServerImplm() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double add(double d1, double d2) throws RemoteException {
		return d1 + d2;
	}

}
