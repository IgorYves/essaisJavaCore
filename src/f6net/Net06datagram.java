package f6net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class Net06datagram {
	public static int serverPort = 998;
	public static int clientPort = 999;
	public static int bufferSize = 1024;
	public static DatagramSocket datagramSocket;
	public static byte[] buffer = new byte[bufferSize];
	
	public static void main(String[] args) throws Exception {
		if (args.length == 1) {
			datagramSocket = new DatagramSocket(serverPort);
			oneServer();
		}
		else {
			datagramSocket = new DatagramSocket(clientPort);
			oneClient();
		}

	}
	
	public static void oneServer() throws Exception {
		int position = 0;
		while (true) {
			int c = System.in.read();
			switch (c) {
				case -1 :
					System.out.println("server finish");
					datagramSocket.close();
					return;
				case '\r' :
					break;
				case '\n' :
					datagramSocket.send(new DatagramPacket(buffer, position, InetAddress.getLocalHost(), clientPort));
					position = 0;
					break;
				default :
					buffer[position++] = (byte) c;
			}
		}
	}
	
	public static void oneClient() throws Exception {
		while (true) {
			DatagramPacket datagramPackt = new DatagramPacket(buffer, buffer.length);
			datagramSocket.receive(datagramPackt);
			System.out.println(new String(datagramPackt.getData(), 0, datagramPackt.getLength()));
		}
	}
		
	
}
