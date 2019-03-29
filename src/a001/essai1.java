package a001;

public class essai1 {

	public static void main(String[] args) {
		Pere p = new Pere();
		Fils f = new Fils();
		Pere f2 = new Fils();
		Fils2 f21 = new Fils2();
		Pere f22 = new Fils2();
		
		p.metS();
		p.metI();
		System.out.println("----------");
		f.metS();
		f.metI();
		System.out.println("----------");
		f2.metS();
		f2.metI();
		System.out.println("----------");
		//f21.metI();//error en runtime
		f22.metI();
		f22.metS();
		System.out.println("----------");
		Famille ff = new Fils();
		ff.metI();
		ff.metIFam();
	}

}

class Pere implements Famille {
	public static void metS() {System.out.println("metS pere");}
	@Override
	public void metI() {System.out.println("metI pere");}
}

class Fils extends Pere {
	public static void metS() {System.out.println("metS fils");}
	@Override
	public void metI() {System.out.println("metI fils");}
}

class Fils2 extends Pere {
	//@Override
	//public int metI() {return 1;}//error en runtime (uniquement si on l'utilise)
}

interface Famille {
	public default void metI() {System.out.println("metI interface famille");}
	public default void metIFam() {System.out.println("metIFam interface famille");}
}