package i2streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {

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
		
		Stream<Double> arrListStream = arrList.stream().map((a) -> Math.sqrt(a));
		double resDbl = arrListStream.reduce(1., (a, b) -> a*b);
		System.out.println("res : " +  resDbl);
		
		resDbl = arrList.stream().map((a) -> Math.sqrt(a)).reduce(1., (a, b) -> a*b);
		System.out.println("res : " +  resDbl);
		
		
	}

}
