package i1parallel;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		new UseString(exchanger);
		new MakeString(exchanger);
		
	}
}

class UseString implements Runnable {
	Exchanger<String> exchanger;
	String str;
	public UseString(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
		new Thread(this).start();
	}
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				str = exchanger.exchange(new String());
				System.out.println("UseString Recu : " + str);
			} catch (InterruptedException e) {System.out.println(e);}
		}
	}
}

class MakeString implements Runnable {
	Exchanger<String> exchanger;
	String str;
	public MakeString(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
		str = new String();
		new Thread(this).start();
	}
	@Override
	public void run() {
		char ch = 'A';
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {str += ch++;}
			try {
				System.out.println("MakeString Envoie : " + str);
				str = exchanger.exchange(str);
			} catch (InterruptedException e) {System.out.println(e);}
		}
	}
}