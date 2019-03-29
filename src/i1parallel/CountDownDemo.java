package i1parallel;

import java.util.concurrent.CountDownLatch;

public class CountDownDemo {
	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(5);
		System.out.println("lancement");
		new ThreadToRun(countDownLatch);
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {System.out.println(e);}
		System.out.println("finish");
	}
}

class ThreadToRun implements Runnable {
	CountDownLatch countDownLatch;
	public ThreadToRun(CountDownLatch countDownLatch) {
		super();
		this.countDownLatch = countDownLatch;
		new Thread(this).start();
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			countDownLatch.countDown();
		}
		
	}
	
}