package f2jUtil1;

import java.util.LinkedList;

class JUtil06 {

	public static void main(String[] args) {
		LinkedList<Adress> pq = new LinkedList<>();
		pq.add(new Adress("Joe", "0148523697"));
		pq.add(new Adress("Jon", "0256423697"));
		pq.add(new Adress("Jim", "05454697"));
		pq.add(new Adress("Josee", "0148456597"));
		
		
		System.out.println(pq);
		System.out.println("-------------");
		for (Adress e : pq) {
			System.out.println(e);
		}
		
	}
}

class Adress {
	String name;
	String tel;
	Adress(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	@Override
	public String toString() {
		return name + "\t : " + tel;
	}
}