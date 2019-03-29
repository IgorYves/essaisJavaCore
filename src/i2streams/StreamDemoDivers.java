package i2streams;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemoDivers {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("john");
		arrList.add("jim");
		arrList.add("jeremy");
		arrList.add("kate");
		arrList.add("harry");
		
		System.out.println("Stream :");
		arrList.stream().forEach((a)->{System.out.printf("%s ", a);});
		System.out.println("\n\n");

		IntStream.range(5, 40).forEach((a)->{System.out.printf("%s ", a);});
		System.out.println();
		System.out.println(IntStream.range(5, 40).count());
		Stream.of(5,5,6,8,9,2,5,2,3).forEach((a)->{System.out.printf("%s ", a);});
		System.out.println();
		Stream.of(5,5,6,8,9,2,5,2,3).distinct().forEach((a)->{System.out.printf("%s ", a);});
		System.out.println();
		System.out.println(Stream.of(5,5,6,8,9,2,5,2,3).anyMatch((val)-> val==5));
		
		
	}
}

