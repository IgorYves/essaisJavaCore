package s48_afpa_ex.ex04;

class Item4NmbrsPrem {
	public static void main(String[] args) {
		System.out.println("Nombres premiers");
		System.out.println();
		boolean diviseur = false;
		System.out.print("1\t");
		for (int i=2; i<=100; i++) {
			for(int j=2; j<i; j++){if(i%j==0){diviseur = true; break;}}
			if(diviseur){System.out.print(i);} else {System.out.print("(" + i + ")");}
			if(i%5 == 0) {System.out.println();}
			else {System.out.print("\t");};
			diviseur = false;
		};
	}
}
