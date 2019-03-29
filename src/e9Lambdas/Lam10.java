package e9Lambdas;

class Lam10 {

	public static void main(String[] args) {
		Integer[] nums = {1,2,3,4,5,6,7,5,2,5,6};
		String[] strs = {"d", "dg", "dgf", "fdsh", "dg", "esafsf", "dg", "sfasffsfssd"};
		int count;
		
		count = unOps(ArrOps::<Integer>countMatching, nums, 5);
		System.out.println(count);
		
		count = unOps(ArrOps::<String>countMatching, strs, "dg");
		System.out.println(count);
	}
	
	static <T> int unOps(UneFuncInterface10<T> f, T[] vals, T v) {
		return f.func(vals, v);
	}
}

class ArrOps {
	static <T> int countMatching(T[] values, T value) {
		int count = 0;
		for (int i=0; i<values.length; i++) {
			if (values[i] == value) count++;
		}
		return count;
	}
}

interface UneFuncInterface10<T> {
	int func(T[] values, T value);
}