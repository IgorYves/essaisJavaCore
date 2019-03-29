package i1parallel;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CiclicBarrierDemo {
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarrierAction());
		System.out.println("lancement des threads");
		new ThreadToRun2(cyclicBarrier, "A");
		new ThreadToRun2(cyclicBarrier, "B");
		new ThreadToRun2(cyclicBarrier, "C");
		System.out.println("----------------------------");
		new ThreadToRun2(cyclicBarrier, "X");
		new ThreadToRun2(cyclicBarrier, "Y");
		new ThreadToRun2(cyclicBarrier, "Z");
		
	}
}

class ThreadToRun2 implements Runnable {
	CyclicBarrier cyclicBarrier;
	String name;
	public ThreadToRun2(CyclicBarrier cyclicBarrier, String name) {
		super();
		this.cyclicBarrier = cyclicBarrier;
		this.name = name;
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println(name);
		try {
			cyclicBarrier.await();
		} catch (InterruptedException e) {System.out.println(e);} 
		catch (BrokenBarrierException e) {System.out.println(e);}
		System.out.println("finish " + name);
	}
}

class BarrierAction implements Runnable {
	static int i = 1;
	@Override
	public void run() {
		System.out.println("BarrierAction " + i++ + " start");
	}
}