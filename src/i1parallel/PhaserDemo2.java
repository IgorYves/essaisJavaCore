package i1parallel;

import java.util.concurrent.Phaser;

public class PhaserDemo2 {
	public static void main(String[] args) {
		YPhaser phaser = new YPhaser(1, 4);
		
		System.out.println("lancement des threads\n");
		new ThreadToRun4(phaser, "A");
		new ThreadToRun4(phaser, "B");
		new ThreadToRun4(phaser, "C");
		
		while (!phaser.isTerminated()) {
			phaser.arriveAndAwaitAdvance();
			System.out.println("-------------------main thread");
		}
		
		phaser.arriveAndDeregister();
		if (phaser.isTerminated()) {
			System.out.println("phaser finished");
		}
		
	}
}

class ThreadToRun4 implements Runnable {
	Phaser phaser;
	String name;
	public ThreadToRun4(Phaser phaser, String name) {
		super();
		this.phaser = phaser;
		this.name = name;
		phaser.register();
		new Thread(this).start();
	}
	@Override
	public void run() {
		while (!phaser.isTerminated()) {
			System.out.println("thread " + name + " begin " + phaser.getPhase() + " phase");
			phaser.arriveAndAwaitAdvance();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {System.out.println(e);}
		}
	}
}

class YPhaser extends Phaser {
	int numPhases;
	YPhaser(int parties, int phaseCount) {
		super(parties);
		numPhases = phaseCount - 1;
	}
	
	@Override
	protected boolean onAdvance(int phase, int regParties) {
		System.out.println("phase " + phase + " finished");
		if (phase == numPhases || regParties == 0) return true;
		return false;
	}
}
