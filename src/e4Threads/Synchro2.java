//Synchronisation avec wait() et notify()
// !!!!! Arret manuel (Ctr+C)
package e4Threads;

class Synchro2 {
	public static void main(String[] args) {
		Box b = new Box();
		new Fournisseur(b);
		new Client(b);
	}
}

class Box{
	int x;
	boolean changeOK = false;
	synchronized void put(int x) {
		while(changeOK) {
			try {wait();}
			catch (InterruptedException e) {System.out.println("interrompuWaitInPut");}
		}
		this.x += x;
		System.out.println("ajouté " + x + ", total : " + this.x);
		try {Thread.sleep(1000);}
		catch (InterruptedException e) {System.out.println("interrompuPut");}
		changeOK = true;
		notify();
	}
	synchronized int get(int x) {
		while(!changeOK) {
			try {wait();}
			catch (InterruptedException e) {System.out.println("interrompuWaitInGet");}
		}
		this.x -= x;
		System.out.println("enlevé " + x + ", reste : " + this.x);
		try {Thread.sleep(1000);}
		catch (InterruptedException e) {System.out.println("interrompuGet");}
		changeOK = false;
		notify();
		return x;
	}
}

class Fournisseur implements Runnable{
	Box b;
	Fournisseur(Box b){
		this.b = b;
		new Thread(this, "fournisseur1").start();
	}
	@Override
	public void run() {
		while(true) {
			b.put(3);
		}
	}
}

class Client implements Runnable{
	Box b;
	Client(Box b){
		this.b = b;
		new Thread(this, "client1").start();
	}
	@Override
	public void run() {
		while(true) {
			b.get(2);
		}
	}
}