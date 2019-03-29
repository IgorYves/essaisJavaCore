package i2streams;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(5);
		arrList.add(4);
		arrList.add(3);
		arrList.add(56);
		//arrList.add(22);
		//arrList.add(86);
		//arrList.add(95);
		//arrList.add(78);
		System.out.println(arrList);
		
		Optional<Integer> resVal = arrList.stream().reduce((a, b) -> a*b);
		if (resVal.isPresent()) System.out.println("res : " +  resVal.get());
		
		int resInt = arrList.stream().reduce(1, (a, b) -> a*b);
		System.out.println("res : " +  resInt);
		
		int resInt2 = arrList.stream().reduce(3, (a, b) -> a*b);
		System.out.println("res : " +  resInt2);
		
		int resInt3 = arrList.stream().reduce(1, (a, b) -> {if (b%2==0) return a*b; else return a;});
		System.out.println("res : " +  resInt3);
		
		int resInt4 = arrList.stream().reduce(1, (a, b) -> a*(b%2==0?b:1));
		System.out.println("res : " +  resInt4);
		
	}

}
