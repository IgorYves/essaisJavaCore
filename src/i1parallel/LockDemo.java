package i1parallel;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {
		ReentrantLock reentrantLock = new ReentrantLock();
		new LockThread(reentrantLock, "A");
		new LockThread(reentrantLock, "B");
	}
}

class Shared2 {static int count = 0;}

class LockThread implements Runnable {
	String threadName;
	ReentrantLock reentrantLock;
	int iteration = 3;
	LockThread(ReentrantLock reentrantLock, String threadName) {
		this.reentrantLock = reentrantLock;
		this.threadName = threadName;
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println("lancement de thread " + threadName);
		while (iteration > 0) {
			System.out.println("thread " + threadName + " attend lock");
			reentrantLock.lock();
			System.out.println("thread " + threadName + " recois lock");
			Shared2.count++;
			System.out.println("thread " + threadName + " : " + Shared2.count);
			System.out.println("thread " + threadName + " debloc lock");
			reentrantLock.unlock();
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			iteration--;
		}
		System.out.println("thread " + threadName + " fin");
	}
}