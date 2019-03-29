package e4Threads;

class Synchro4 {

	public static void main(String[] args) {
		T1 o1 = new T1("primo");
		T1 o2 = new T1("secundo");
		try {
			Thread.sleep(500);
			System.out.println("-------------suspend tr 1");
			o1.suspendMe();
			Thread.sleep(500);
			System.out.println("-------------resume tr 1");
			o1.resumeMe();
			
			Thread.sleep(500);
			System.out.println("-------------suspend tr 2");
			o2.suspendMe();
			Thread.sleep(500);
			o2.resumeMe();
			System.out.println("-------------resume tr 2");
		} catch (InterruptedException e) {System.out.println("main thread interrompu");}
		
		try {
			System.out.println("-------------wait fin of threads");
			o1.t.join();
			o2.t.join();
			System.out.println("-------------fin of threads");
		} catch (InterruptedException e) {System.out.println("main thread interrompu");}
	}
}

class T1 implements Runnable{
	String name;
	Thread t;
	boolean waitFlag;
	T1(String tName){
		name = tName;
		t = new Thread(this, name);
		System.out.println("New thread " + t);
		waitFlag = false;
		t.start();
	}
	@Override
	public void run() {
		try {
			for (int i = 0; i < 15; i++) {
				System.out.println(name + " : " + i);
				Thread.sleep(250);
				synchronized (this) {while(waitFlag) {wait();}}
			}
		}
		catch (InterruptedException e) {System.out.println(name + " interrompu");}
		System.out.println(name + " finished");
	}
	synchronized void suspendMe(){waitFlag = true;}
	synchronized void resumeMe(){waitFlag = false; notify();}
}