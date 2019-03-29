package tpjavabean.factorielle;

public class Factorial {
	public Factorial(){}
	public static String getFactorial(String s) 
				throws FactorialNotNumberException, 
						FactorialVideException, 
						FactorialTooBigException, 
						FactorialNegatifException 
	{
		s = s.trim();
		if(s.matches(".*[^0-9]+.*")) throw new FactorialNotNumberException();
		if(s.length() == 0) throw new FactorialVideException();
		if(s.length() > 2) throw new FactorialTooBigException();
		if(s.length() < 0) throw new FactorialNegatifException();
		int i = Integer.valueOf(s);
		return String.valueOf(getFactorial(i));
	}
	public static long getFactorial(long i) 
			throws FactorialNegatifException, FactorialTooBigException {
		if(i < 0) throw new FactorialNegatifException();
		if(i > 20) throw new FactorialTooBigException();
		return fact((int)i);
	}
	public static long getFactorial(int i) 
			throws FactorialNegatifException, FactorialTooBigException {
		if(i < 0) throw new FactorialNegatifException();
		if(i > 20) throw new FactorialTooBigException();
		return fact(i);
	}
	private static long fact(int i) {
		if (i<=1)return 1;
		else return i*fact(i-1);
	};
}
