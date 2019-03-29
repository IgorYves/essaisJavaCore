package essais;

class ObjByObjConstruct {
	public static void main(String[] args) {
		Css1 Obj1 = new Css1();
		Css1 Obj2 = new Css1(5);
		Css1 Obj3 = new Css1(50, 60);
		Css1 Obj3clon = new Css1(Obj3);

		System.out.println("Obj1 : \t\t" + Obj1.multiple());
		System.out.println("Obj2 : \t\t" + Obj2.multiple());
		System.out.println("Obj3 : \t\t" + Obj3.multiple());
		System.out.println("Obj3clon : \t" + Obj3clon.multiple());
	}
}

class Css1 {
	int x=-1;
	int y=-1;
	Css1(Css1 obj){
		x=obj.x;
		y=obj.y;
	};
	Css1(int ... arr){
		if(arr.length>0)x=arr[0];
		if(arr.length>1)y=arr[1];
	};
	int multiple() {return x*y;};
};