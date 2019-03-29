package a1;

public class Hide {

	public static void main(String[] args) {
		System.out.println(HideFils.y);
		HideFils hideFils = new HideFils();
		System.out.println("-------------");
		System.out.println(hideFils.x);
		System.out.println(((HidePere)hideFils).x);
		System.out.println("-------------");
		System.out.println(hideFils.y);
		System.out.println(((HidePere)hideFils).y);
		
	}
}

class HidePere {
	int x = 1;
	static int y = 2;
}
class HideFils extends HidePere {
	int x = 100;
	static int y = 200;
}