package i1parallel;

import java.util.concurrent.Semaphore;

class SemaphoreDemo {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(1);
		
		new IncrThread("A", semaphore);
		new DecrThread("B", semaphore);
		
	}
}
class Shared {static int count = 0;}

class IncrThread implements Runnable {
	String name;
	Semaphore semaphore;
	public IncrThread(String name, Semaphore semaphore) {
		super();
		this.name = name;
		this.semaphore = semaphore;
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println("lancement de thread " + name);
		try {
			System.out.println("thread " + name + " attend lancement");
			semaphore.acquire();
			System.out.println("thread " + name + " recois lancement");
			for (int i = 0; i < 5; i++) {
				Shared.count++;
				System.out.println(name + " : " + Shared.count);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("thread " + name + " libere semaphore");
		semaphore.release();
	}
}

class DecrThread implements Runnable {
	String name;
	Semaphore semaphore;
	
	public DecrThread(String name, Semaphore semaphore) {
		super();
		this.name = name;
		this.semaphore = semaphore;
		new Thread(this).start();
	}

	@Override
	public void run() {
		System.out.println("lancement de thread " + name);
		try {
			System.out.println("thread " + name + " attend lancement");
			semaphore.acquire();
			System.out.println("thread " + name + " recois lancement");
			for (int i = 0; i < 5; i++) {
				Shared.count--;
				System.out.println(name + " : " + Shared.count);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("thread " + name + " libere semaphore");
		semaphore.release();
	}
}
