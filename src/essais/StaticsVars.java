package essais;

class StaticsVars {
	public static void main(String[] args) {
		System.out.println("SV1.x : " + SV1.x);
		System.out.println("SV1.y : " + SV1.y);
		SV1 Obj21 = new SV1();
		SV1 Obj22 = new SV1();
		
		System.out.println("Obj21.x : " + Obj21.x);
		System.out.println("Obj21.y : " + Obj21.y);
		System.out.println("Obj22.x : " + Obj22.x);
		System.out.println("Obj22.y : " + Obj22.y);
		
		System.out.println("x = 50 ************");
		Obj21.x = 50;
		System.out.println("Obj21.x : " + Obj21.x);
		System.out.println("Obj21.y : " + Obj21.y);
		System.out.println("Obj22.x : " + Obj22.x);
		System.out.println("Obj22.y : " + Obj22.y);
		
	}

}

class SV1 {
	static int x=-1;
	static int y=-1;
	static {x=2;};
	
	
};