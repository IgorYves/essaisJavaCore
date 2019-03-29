package a001;

public class Constr {
	int j;
	public static void main(String[] args) {
		Constr o = new Constr();
		System.out.println(o.j);
		
		
		
		System.out.println("-----------");
		
		Class<Constr> o2 = Constr.class;
	}
	

	Constr() {
		System.out.println("Constr()");
		new Constr(5);
		j = 0;
	}
	Constr(int i) {
		System.out.println("Constr(int i) " + i);
		j = i;
	}
}
