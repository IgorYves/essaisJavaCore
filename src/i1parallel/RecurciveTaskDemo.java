package i1parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class RecurciveTaskDemo {

	public static void main(String[] args) {
		double[] dataArr = new double[1_000_000];
		for (int i = 0; i < dataArr.length; i++) {dataArr[i] = ((i%2)==0) ? i : -i;}
		
		ForkJoinPool frokJoinPool = new ForkJoinPool();
		SumCalcul sumCalculTask = new SumCalcul(dataArr, 0, dataArr.length);
		double summTotal = frokJoinPool.invoke(sumCalculTask);
		System.out.println(summTotal);
	}
}

class SumCalcul extends RecursiveTask<Double> {
	int seuil = 10000;
	double[] dataArr;
	int start;
	int end;
	SumCalcul(double[] dataArr, int start, int end) {
		this.dataArr = dataArr;
		this.start = start;
		this.end = end;
	}
	
	
	@Override
	protected Double compute() {
		double sum = 0;
		if (end - start < seuil) {for (int i = start; i < end; i++) sum += dataArr[i];}
		else {
			int middle = (start + end) / 2;
			SumCalcul subTask1 = new SumCalcul(dataArr, start, middle);
			SumCalcul subTask2 = new SumCalcul(dataArr, middle, end);
			subTask1.fork();
			subTask2.fork();
			sum = subTask1.join() + subTask2.join();
		}
		return sum;
	}
	
	
}