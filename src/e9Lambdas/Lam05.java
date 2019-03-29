package e9Lambdas;

class Lam05 {

	public static void main(String[] args) throws EmptyArrayException {
		double[] dvalues = {1.1,1.2,1.3,3.3};
		
		DoubleNumericArrayFunctn average = (x) -> {
			double sum = 0;
			if(x.length == 0) throw new EmptyArrayException();
			for(int i=0; i<x.length; i++) sum += x[i];
			return sum / x.length;
		};
		
		System.out.println(average.func(dvalues));
		//System.out.println(average.func(new double[0]));
	}
}

interface DoubleNumericArrayFunctn {
	double func(double[] d) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
	EmptyArrayException() {
		super("array vide");
	}
}
