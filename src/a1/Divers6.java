package a1;

class Divers6 {
	static private int i = 0;
	int j;
	static Divers6[] o = new Divers6[10];
	public static void main(String[] args) {
		o[0] = new Divers6(0);
		System.out.println("------------");
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i].j);
		}
	}
	
	Divers6(int x) {
		System.out.println("constr " + i++);
		j = i;
		if (i < 10) {
			o[i] = new Divers6(i);
		}
	}
}

