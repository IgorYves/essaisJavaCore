package i2streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo8 {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("john@gmail.com");
		arrList.add("jim@gmail.com");
		arrList.add("jeremy@gmail.com");
		arrList.add("kate@gmail.com");
		
		System.out.println(arrList);
		arrList.stream().forEach((a)->{System.out.printf("%s\n", a);});
		System.out.println();
		
		arrList.stream().peek(a->System.out.println("\navant splitting - " + a))
						.flatMap(a->Stream.of(a.split("@")))
						.flatMap(a->Stream.of(a.split("\\.")))
						.forEach((a)->{System.out.printf("%s\n", a);});
		
	}
}
