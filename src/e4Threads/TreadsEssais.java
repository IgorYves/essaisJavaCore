/**
 * 
 */
package e4Threads;

/**
 * @author y
 *
 */
class TreadsEssais {

	/**
	 * 
	 */
	/*public TreadsEssais() {
		// TODO Auto-generated constructor stub
	}*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("current thread : " + t);
		System.out.println("thread name : " + t.getName());
		t.setName("YHTrd");
		System.out.println("current thread : " + t);
		System.out.println("thread name : " + t.getName());
		try {
			for(int i=0; i<40; i++) {
				System.out.print((i<10?" ":"") + i + (i%20==19?"\n":" "));
				Thread.sleep(80, 50);//milliseconds, nanoseconds
			}
		}
		catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		
		NewThread nt = new NewThread();
		System.out.println(nt + " is alive : " + nt.t.isAlive());
		NewThread2 nt2 = new NewThread2();
		System.out.println(nt2 + " is alive : " + nt2.isAlive());
		new NewThread3("bla");
		new NewThread3("bla2");
		new NewThread3("bla3");
		new NewThread4("bla0");
		new NewThread4("bla02");
		new NewThread4("bla03");
		try {
			nt.t.join();
			nt2.join();
		}
		catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		
		try {
			for(int i=0; i<20; i++) {
				System.out.print((i<10?" ":"") + i + (i%10==9?"\n":" "));
				Thread.sleep(10, 50);//milliseconds, nanoseconds
			}
		}
		catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("\nmain thread finished");
	}
}

class NewThread implements Runnable {
	Thread t;
	NewThread(){
		t = new Thread(this, "Demo thread");
		t.setPriority(2);
		System.out.println(t + " " + t.getName() + " created");
		t.start();
	}
	@Override
	public void run() {
		try {
			for(char c='a'; c<='z'; c++) {
				System.out.print(c);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Demo thread interrupted");
		}
		System.out.println("\nDemo thread finished");
	}
}


class NewThread2 extends Thread {
	NewThread2(){
		super("Demo thread2");
		this.setPriority(6);
		System.out.println(this + " " + this.getName() + " created");
		start();
	}
	@Override
	public void run() {
		try {
			for(char c='A'; c<='Z'; c++) {
				System.out.print(c);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Demo thread2 interrupted");
		}
		System.out.println("\nDemo thread2 finished");
	}
}

class NewThread3 implements Runnable {
	String name;
	Thread t;
	NewThread3(String name){
		this.name = name;
		t = new Thread(this, name);
		t.start();
	}
	@Override
	public void run() {System.out.println(t.getName());}
}

class NewThread4 extends Thread {
	String name;
	NewThread4(String name){
		super(name);
		this.name = name;
		start();
	}
	@Override
	public void run(){System.out.println(this.getName());}
}
