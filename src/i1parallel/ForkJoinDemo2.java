package i1parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinDemo2 {

	public static void main(String[] args) {
		ForkJoinPool frokJoinPool = new ForkJoinPool();
		double[] dataArr = new double[100_000];
		for (int i = 0; i < dataArr.length; i++) {dataArr[i] = i;}
		int seuil = 2;
		boolean continuer = true;
		long timestamp1, timestamp2;
		while (continuer) {
			timestamp1 = System.currentTimeMillis();
			SqrtTransformArray2 sqrtTransformArrayTask = new SqrtTransformArray2(dataArr, 0, dataArr.length, seuil);
			frokJoinPool.invoke(sqrtTransformArrayTask);
			timestamp2 = System.currentTimeMillis();
			System.out.println(seuil + " -- " + (timestamp2-timestamp1) + " ms");
			if (seuil > dataArr.length) {continuer = false;}
			seuil += 500;
		}
	}
}

class SqrtTransformArray2 extends RecursiveAction {
	int seuil;
	double[] dataArr;
	int start;
	int end;
	SqrtTransformArray2(double[] dataArr, int start, int end, int seuil) {
		this.seuil = seuil;
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
			invokeAll(new SqrtTransformArray2(dataArr, start, middle, seuil), 
						new SqrtTransformArray2(dataArr, middle, end, seuil));
		}
	}
}