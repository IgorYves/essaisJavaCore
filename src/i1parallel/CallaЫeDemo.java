package i1parallel;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallaЫeDemo {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		Future<Integer> future;
		Future<Double> future2;
		Future<Integer> future3;
		
		System.out.println("lancement des threads");
		future = executorService.submit(new Sum(10));
		future2 = executorService.submit(new Hypot(3, 4));
		future3 = executorService.submit(new Factorl(5));
		
		try {
			System.out.println(future.get());
			System.out.println(future2.get());
			System.out.println(future3.get(1, TimeUnit.NANOSECONDS));
		} catch (InterruptedException | ExecutionException | TimeoutException e) {e.printStackTrace();}
		
		executorService.shutdown();
		System.out.println("finish");
	}
}

class Sum implements Callable<Integer> {
	int max;
	public Sum(int max) {this.max = max;}
	@Override
	public Integer call() {
		int sum = 0;
		for (int i = 0; i < max; i++) {sum += i;}
		return sum;
	}
}

class Hypot implements Callable<Double> {
	double side1, side2;
	public Hypot(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	@Override
	public Double call() {
		return Math.sqrt(side1*side1 + side2*side2);
	}
}

class Factorl implements Callable<Integer> {
	int max;
	public Factorl(int max) {this.max = max;}
	@Override
	public Integer call() {
		int fact = 1;
		for (int i = 2; i <= max; i++) {fact *= i;}
		return fact;
	}
}

