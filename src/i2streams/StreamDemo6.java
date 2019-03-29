package i2streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo6 {

	public static void main(String[] args) {
		ArrayList<NamePhoneEmail> arrList = new ArrayList<>();
		arrList.add(new NamePhoneEmail("john", "5123654", "john@gmail.com"));
		arrList.add(new NamePhoneEmail("jim", "7845453", "jim@gmail.com"));
		arrList.add(new NamePhoneEmail("jeremy", "12486578", "jeremy@gmail.com"));
		arrList.add(new NamePhoneEmail("kate", "56876", "kate@gmail.com"));
		
		System.out.println(arrList);
		arrList.stream().forEach((a)->{System.out.printf("%s %s %s\n", a.name, a.phone, a.email);});
		System.out.println();
		
		Stream<NamePhone> namePhoneStream = arrList.stream().map((a)->new NamePhone(a.name, a.email));
		namePhoneStream.forEach((a)->{System.out.printf("%s %s\n", a.name, a.email);});
		System.out.println();
		
		arrList.stream().map((a)->new NamePhone(a.name, a.email))
						.filter((a)->a.name.equals("jim"))
						.forEach((a)->{System.out.printf("%s %s\n", a.name, a.email);});
	}
}

class NamePhoneEmail {
	String name, phone, email;
	public NamePhoneEmail(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
}
class NamePhone {
	String name, email;
	public NamePhone(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
}
