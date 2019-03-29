package i2streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo9 {

	public static void main(String[] args) {
		ArrayList<NamePhoneEmail2> arrList = new ArrayList<>();
		arrList.add(new NamePhoneEmail2("john", "5123654", "john@gmail.com"));
		arrList.add(new NamePhoneEmail2("jim", "7845453", "jim@gmail.com"));
		arrList.add(new NamePhoneEmail2("jeremy", "12486578", "jeremy@gmail.com"));
		arrList.add(new NamePhoneEmail2("kate", "56876", "kate@gmail.com"));
		System.out.println(arrList + "\n");
		
		System.out.println("Stream :");
		arrList.stream().forEach((a)->{System.out.printf("%s %s %s\n", a.name, a.phone, a.email);});
		System.out.println();
		
		System.out.println("List :");
		Stream<NamePhone2> namePhoneStream = arrList.stream().map((a)->new NamePhone2(a.name, a.email));
		List<NamePhone2> namePhoneList = namePhoneStream.collect(Collectors.toList());
		namePhoneList.stream().forEach((a)->{System.out.printf("%s %s \n", a.name, a.email);});
		System.out.println();

		System.out.println("Set :");
		namePhoneStream = arrList.stream().map((a)->new NamePhone2(a.name, a.email));
		Set<NamePhone2> namePhoneSet = namePhoneStream.collect(Collectors.toSet());
		namePhoneSet.stream().forEach((a)->{System.out.printf("%s %s \n", a.name, a.email);});
		System.out.println();

		System.out.println("collect2 :");
		namePhoneStream = arrList.stream().map((a)->new NamePhone2(a.name, a.email));
		LinkedList<NamePhone2> namePhoneLList = namePhoneStream.collect( ()-> new LinkedList<>(),
																(list, element)-> list.add(element),
																(list1, list2)-> list1.addAll(list2) );
		namePhoneLList.stream().forEach((a)->{System.out.printf("%s %s \n", a.name, a.email);});
		System.out.println();

		System.out.println("collect3 :");
		namePhoneStream = arrList.stream().map((a)->new NamePhone2(a.name, a.email));
		HashSet<NamePhone2> namePhoneHashSet = namePhoneStream.collect( HashSet::new, HashSet::add, HashSet::addAll );
		namePhoneLList.stream().forEach((a)->{System.out.printf("%s %s \n", a.name, a.email);});
		System.out.println();
		
		
	}
}


class NamePhoneEmail2 {
	String name, phone, email;
	public NamePhoneEmail2(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
}
class NamePhone2 {
	String name, email;
	public NamePhone2(String name, String email) {
		this.name = name;
		this.email = email;
	}
}