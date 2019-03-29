package i1parallel;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(5);
		CountDownLatch countDownLatch2 = new CountDownLatch(5);
		CountDownLatch countDownLatch3 = new CountDownLatch(5);
		CountDownLatch countDownLatch4 = new CountDownLatch(5);
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		System.out.println("lancement des threads\n");
		
		
		executorService.execute(new ThreadToRun5(countDownLatch, "A"));
		executorService.execute(new ThreadToRun5(countDownLatch2, "B"));
		executorService.execute(new ThreadToRun5(countDownLatch3, "C"));
		executorService.execute(new ThreadToRun5(countDownLatch4, "D"));
		
		try {
			countDownLatch.await();
			countDownLatch2.await();
			countDownLatch3.await();
			countDownLatch4.await();
		} catch (InterruptedException e) {System.out.println(e);}
		
		executorService.shutdown();
		System.out.println("finish");
	}
}

class ThreadToRun5 implements Runnable {
	String name;
	CountDownLatch countDownLatch;
	public ThreadToRun5(CountDownLatch countDownLatch, String name) {
		super();
		this.name = name;
		this.countDownLatch = countDownLatch;
		new Thread(this).start();
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + " " + i);
			countDownLatch.countDown();
			try {Thread.sleep(500);} catch (InterruptedException e) {System.out.println(e);}
		}
		System.out.println(name + " finish");
	}
}