package i2streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class StreamDemoIterator {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("john");
		arrList.add("jim");
		arrList.add("jeremy");
		arrList.add("kate");
		arrList.add("harry");
		System.out.println(arrList + "\n");
		
		System.out.println("Stream :");
		arrList.stream().forEach((a)->{System.out.printf("%s ", a);});
		System.out.println("\n\n");

		System.out.println("iterator :");
		Iterator<String> iterator = arrList.stream().iterator();
		while (iterator.hasNext()) { System.out.println(iterator.next()); }
		System.out.println();
		
		System.out.println("spliterator (tryAdvance) :");
		Spliterator<String> spliterator = arrList.stream().spliterator();
		while (spliterator.tryAdvance((elem)-> System.out.println(elem))) {}
		System.out.println();
		
		System.out.println("spliterator (forEachRemaining) :");
		spliterator = arrList.stream().spliterator();
		spliterator.forEachRemaining((elem)-> System.out.println(elem));
		
		System.out.println("-------------\n");
		System.out.println("spliterator (trySplit) :\n");
		spliterator = arrList.stream().spliterator();
		Spliterator<String> spliterator2 = spliterator.trySplit();
		
		if (spliterator2 != null) {
			System.out.println("spliterator2");
			spliterator2.forEachRemaining((elem)-> System.out.println(elem));
		}
		System.out.println();
		System.out.println("spliterator");
		spliterator.forEachRemaining((elem)-> System.out.println(elem));
		
		
		
	}
}

