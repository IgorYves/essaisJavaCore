package e9Lambdas;

class Lam09 {

	public static void main(String[] args) {
		int count;
		HighTemp[] weekDayHighs = {
				new HighTemp(89), new HighTemp(79), new HighTemp(85),
				new HighTemp(88), new HighTemp(69), new HighTemp(84),
				new HighTemp(89), new HighTemp(89), new HighTemp(75),
				new HighTemp(89), new HighTemp(78), new HighTemp(83)
		};
		
		MinTemp[] weekDayMins = {
				new MinTemp(29), new MinTemp(79), new MinTemp(85),
				new MinTemp(88), new MinTemp(62), new MinTemp(84),
				new MinTemp(29), new MinTemp(89), new MinTemp(75),
				new MinTemp(89), new MinTemp(72), new MinTemp(83)
		};

		count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
		System.out.println(count);

		count = counter(weekDayHighs, HighTemp::lessThenTemp, new HighTemp(85));
		System.out.println(count);

		count = counter(weekDayMins, MinTemp::sameTemp, new MinTemp(89));
		System.out.println(count);

		count = counter(weekDayMins, MinTemp::lessThenTemp, new MinTemp(85));
		System.out.println(count);
		
	}
	
	static <T> int counter(T[] vals, UneFuncInterface<T> uFI, T v) {
		int count = 0;
		for (int i=0; i<vals.length; i++) {
			if (uFI.func(vals[i], v)) count++;
		}
		return count;
	}
}

class HighTemp {
	private int hTemp;
	public HighTemp(int hTemp) {this.hTemp = hTemp;}
	
	boolean sameTemp(HighTemp ht2) {return this.hTemp == ht2.hTemp;}
	
	boolean lessThenTemp(HighTemp ht2) {return this.hTemp < ht2.hTemp;}
}

class MinTemp {
	private int mTemp;
	public MinTemp(int mTemp) {this.mTemp = mTemp;}
	
	boolean sameTemp(MinTemp mt2) {return this.mTemp == mt2.mTemp;}
	
	boolean lessThenTemp(MinTemp mt2) {return this.mTemp < mt2.mTemp;}
}

interface UneFuncInterface<T> {
	boolean func(T val1, T val2);
}