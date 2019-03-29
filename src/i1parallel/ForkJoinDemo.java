package i1parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinDemo {

	public static void main(String[] args) {
		double[] dataArr = new double[100_000];
		for (int i = 0; i < dataArr.length; i++) {dataArr[i] = i;}
		double[] dataArrBack = dataArr.clone();
		
		int variant = 3;
		if (variant == 1) {
			ForkJoinPool frokJoinPool = new ForkJoinPool();
			SqrtTransformArray sqrtTransformArrayTask = new SqrtTransformArray(dataArr, 0, dataArr.length);
			frokJoinPool.invoke(sqrtTransformArrayTask);
		}
		else if (variant == 2) {
			ForkJoinPool frokJoinPool = ForkJoinPool.commonPool();
			SqrtTransformArray sqrtTransformArrayTask = new SqrtTransformArray(dataArr, 0, dataArr.length);
			frokJoinPool.invoke(sqrtTransformArrayTask);
		}
		else if (variant == 3) {
			SqrtTransformArray sqrtTransformArrayTask = new SqrtTransformArray(dataArr, 0, dataArr.length);
			sqrtTransformArrayTask.invoke();
		}
		
		for (int i = 1000; i < 1200; i++) {
			System.out.println(dataArrBack[i] + " -- " + dataArr[i]);
		}
	}
}

class SqrtTransformArray extends RecursiveAction {
	final int seuil = 1000;
	double[] dataArr;
	int start;
	int end;
	SqrtTransformArray(double[] dataArr, int start, int end) {
		this.dataArr = dataArr;
		this.start = start;
		this.end = end;
	}
	
	@Override
	protected void compute() {
		if (end - start < seuil) {
			for (int i = start; i < end; i++) {
				dataArr[i] = Math.sqrt(dataArr[i]);
			}
		}
		else {
			int middle = (start + end) / 2;
			invokeAll(new SqrtTransformArray(dataArr, start, middle), 
						new SqrtTransformArray(dataArr, middle, end));
		}
	}
}