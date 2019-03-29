package e9Lambdas;

import java.util.function.Function;

class Lam14 {

	public static void main(String[] args) {
		Function<Integer, Integer> factorial = (n) -> {
			int result = 1;
			for(int i=1; i<=n; i++) {
				result = i * result;
			}
			return result;
		};
		
		System.out.println(factorial.apply(10));
		
	}
}
