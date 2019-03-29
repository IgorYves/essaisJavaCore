package i2streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(5);
		arrList.add(75);
		arrList.add(3);
		arrList.add(56);
		arrList.add(22);
		arrList.add(86);
		arrList.add(95);
		arrList.add(78);
		System.out.println(arrList);
		
		Stream<Integer> yStream = arrList.stream();
		Optional<Integer> minVal = yStream.min(Integer::compare);
		if (minVal.isPresent()) System.out.println("min : " +  minVal.get());
		
		yStream = arrList.stream();
		Optional<Integer> maxVal = yStream.max(Integer::compare);
		if (maxVal.isPresent()) System.out.println("max : " +  maxVal.get());
		
		Stream<Integer> sortedStream = arrList.stream().sorted();
		sortedStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		
		Stream<Integer> filteredStream = arrList.stream().sorted().filter((n) -> (n%2)==1);
		filteredStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		
		filteredStream = arrList.stream().sorted().filter((n) -> (n%2)==1).filter((n) -> n>5);
		filteredStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		
		
		
	}

}
