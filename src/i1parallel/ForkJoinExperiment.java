package i1parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinExperiment {

	public static void main(String[] args) {
		int parallelismeLevel = 4;
		int seuil = 10000;
		double[] dataArr = new double[1_000_000];
		for (int i = 0; i < dataArr.length; i++) {dataArr[i] = i;}
		long timestamp1, timestamp2;
		
		//ForkJoinPool frokJoinPool = new ForkJoinPool();
		//System.out.println(frokJoinPool.getParallelism());
		//System.out.println(frokJoinPool.getCommonPoolParallelism());
		//System.out.println(Runtime.getRuntime().availableProcessors());
		
		ForkJoinPool frokJoinPool = new ForkJoinPool(parallelismeLevel);
		TransformArray transformArrayTask = new TransformArray(dataArr, 0, dataArr.length, seuil);
		timestamp1 = System.nanoTime();
		frokJoinPool.invoke(transformArrayTask);
		timestamp2 = System.nanoTime();
		System.out.println("|| -- " + parallelismeLevel 
							+ "\t seuil -- " + seuil 
							+ "\t nanoS -- " + (timestamp2 - timestamp1));
		
//		System.out.println("-----------------");
//		transformArrayTask.reinitialize();
//		frokJoinPool.execute(transformArrayTask);
//		while (!transformArrayTask.isDone()) {
//			System.out.println(frokJoinPool);
//		}
	}

}

class TransformArray extends RecursiveAction {
	int seuil;
	double[] dataArr;
	int start;
	int end;
	TransformArray(double[] dataArr, int start, int end, int seuil) {
		this.seuil = seuil;
		this.dataArr = dataArr;
		this.start = start;
		this.end = end;
	}
	
	@Override
	protected void compute() {
		if (end - start < seuil) {
			for (int i = start; i < end; i++) {
				if (dataArr[i] % 2 == 0) dataArr[i] = Math.sqrt(dataArr[i]);
				else dataArr[i] = Math.cbrt(dataArr[i]);
			}
		}
		else {
			int middle = (start + end) / 2;
			invokeAll(new TransformArray(dataArr, start, middle, seuil), 
						new TransformArray(dataArr, middle, end, seuil));
		}
	}
}