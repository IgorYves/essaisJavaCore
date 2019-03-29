package f2jUtil1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class JUtil01 {

	public static void main(String[] args) {
		List<String> oneList = new ArrayList<String>();
		oneList.add("1");
		oneList.add("2");
		oneList.add("3");
		oneList.add("4");
		oneList.add("5");
		oneList.add("6");
		affichList("oneList", oneList);
		System.out.println("----------------");
		oneList.add(2, "x");
		affichList("oneList", oneList);
		
		List<String> secondList = Collections.unmodifiableList(oneList);
		System.out.println("----------------");
		affichList("secondList", secondList);
		//secondList.add(3, "x");
		System.out.println("----------------");
		oneList.add(4, "x");
		affichList("secondList", secondList);
		System.out.println("----------------");
		
		System.out.println(oneList);
		System.out.println(oneList.size());
		System.out.println();
		String[] strArr1 = new String[oneList.size()];
		strArr1 = oneList.toArray(strArr1);
		for (String s : strArr1) {System.out.print(s + " ");}
		System.out.println();
		Object[] strArr2;
		strArr2 = oneList.toArray();
		
		System.out.println();
		for (Object s : strArr2) {System.out.print(s + " ");}
		
	}

	public static void affichList(String nom, List<String> subList) {
		int i = 0;
		for (String element : subList) {
			System.out.format("%s  %2d : %s\n", nom, i++, element);
		}
	}

}
