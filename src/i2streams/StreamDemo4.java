package i2streams;

import java.util.ArrayList;

public class StreamDemo4 {

	public static void main(String[] args) {
		ArrayList<Double> arrList = new ArrayList<>();
		arrList.add(5.5);
		arrList.add(4.3);
		arrList.add(3.);
		arrList.add(56.6);
		arrList.add(22.4);
		arrList.add(86.8);
		arrList.add(95.7);
		arrList.add(78.);
		System.out.println(arrList);
		
		double resDbl = arrList.parallelStream().reduce(1., (a, b) -> a*Math.sqrt(b), (a, b) -> a*b);
		System.out.println("res : " +  resDbl);
		
		resDbl = arrList.parallelStream().reduce(1., (a, b) -> a*Math.sqrt(b));
		System.out.println("res : " +  resDbl);
		
		resDbl = arrList.stream().reduce(1., (a, b) -> a*Math.sqrt(b));
		System.out.println("res : " +  resDbl);
		
		resDbl = arrList.parallelStream().sequential().reduce(1., (a, b) -> a*Math.sqrt(b));
		System.out.println("res : " +  resDbl);
		
		resDbl = arrList.parallelStream().sequential().parallel().reduce(1., (a, b) -> a*Math.sqrt(b));
		System.out.println("res : " +  resDbl);
		
		
		resDbl = arrList.parallelStream().unordered().reduce(1., (a, b) -> a*Math.sqrt(b), (a, b) -> a*b);
		System.out.println("res : " +  resDbl);
		
		
	}

}
