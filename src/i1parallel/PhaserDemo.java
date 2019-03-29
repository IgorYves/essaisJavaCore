package i1parallel;

import java.util.concurrent.Phaser;

public class PhaserDemo {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(1);
		int currPhase;
		
		System.out.println("lancement des threads\n");
		new ThreadToRun3(phaser, "A");
		new ThreadToRun3(phaser, "B");
		new ThreadToRun3(phaser, "C");
		
		for (int i = 0; i < 3; i++) {
			currPhase = phaser.getPhase();
			phaser.arriveAndAwaitAdvance();
			System.out.println("phase " + currPhase + " finished\n");
		}
		phaser.arriveAndDeregister();
		if (phaser.isTerminated()) {
			System.out.println("phaser finished");
		}
		
	}
}

class ThreadToRun3 implements Runnable {
	Phaser phaser;
	String name;
	public ThreadToRun3(Phaser phaser, String name) {
		super();
		this.phaser = phaser;
		this.name = name;
		phaser.register();
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println("thread " + name + " begin 1st phase");
		phaser.arriveAndAwaitAdvance();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {System.out.println(e);}
		/////////////////
		System.out.println("thread " + name + " begin 2nd phase");
		phaser.arriveAndAwaitAdvance();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {System.out.println(e);}
		////////////////
		System.out.println("thread " + name + " begin 3d phase");
		phaser.arriveAndDeregister();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {System.out.println(e);}
		System.out.println("finish " + name);
	}
}
