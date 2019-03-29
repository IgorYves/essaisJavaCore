package i1parallel;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

	public static void main(String[] args) {
		new AtomThread("A");
		new AtomThread("B");
		new AtomThread("C");
	}
}

class AtomShared {static AtomicInteger count = new AtomicInteger(0);}

class AtomThread implements Runnable {
	String threadName;
	int iteration = 3;
	AtomThread(String threadName) {
		this.threadName = threadName;
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println("lancement de thread " + threadName);
		while (iteration > 0) {
			System.out.println("thread " + threadName + " : " + AtomShared.count.getAndSet(iteration));
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			iteration--;
		}
		System.out.println("thread " + threadName + " fin");
	}
}