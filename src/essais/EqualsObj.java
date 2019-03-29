package essais;

class EqualsObj {
	public static void main(String[] args) {
		C1 Obj1 = new C1();
		C1 Obj2 = new C1(2);
		C1 Obj3 = new C1(3,4);
		C1 Obj4 = new C1(3,4);

		System.out.println("Obj1 == Obj2 : " + Obj1.equals(Obj2));
		System.out.println("Obj1 == Obj3 : " + Obj1.equals(Obj3));
		System.out.println("Obj1 == Obj4 : " + Obj1.equals(Obj4));
		System.out.println("Obj2 == Obj3 : " + Obj2.equals(Obj3));
		System.out.println("Obj2 == Obj4 : " + Obj2.equals(Obj4));
		System.out.println("Obj3 == Obj4 : " + Obj3.equals(Obj4));
	}
}

class C1 {
	int x=-1;
	int y=-1;
	C1(int ... arr){
		if(arr.length>0)x=arr[0];
		if(arr.length>1)y=arr[1];
	};
	boolean equals(C1 obj) {
		if(obj.x == x && obj.y == y) return true;
		else return false;
	};
};