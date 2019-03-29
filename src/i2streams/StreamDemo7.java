package i2streams;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo7 {

	public static void main(String[] args) {
		ArrayList<Double> arrList = new ArrayList<>();
		arrList.add(5.5);
		arrList.add(95.7);
		arrList.add(4.3);
		arrList.add(3.);
		arrList.add(.3);
		arrList.add(56.6);
		arrList.add(22.4);
		arrList.add(86.8);
		arrList.add(78.);
		arrList.stream().forEach((a)->{System.out.printf("%s ", a);});
		System.out.println();
		
		IntStream arrListStream = arrList.stream().mapToInt((a) -> (int)Math.ceil(a));
		arrListStream.forEach((a)->{System.out.printf("%d ", a);});
		
		System.out.println();
		arrList.stream().mapToInt((a) -> (int)Math.ceil(a))
						.filter((a)->a<70)
						.sorted()
						.forEach((a)->{System.out.printf("%d ", a);});
		
		
	}

}
