package e1ObjetsHeritageVarsArgs;

class ReturnNewObj {
	public static void main(String[] args) {
		Css2 Obj11 = new Css2(1, 10);
		Css2 Obj12 = Obj11.rtrnPlus1Obj();
		Css2 Obj13 = Obj12.rtrnPlus1Obj();

		System.out.println("Obj11.x : " + Obj11.x);
		System.out.println("Obj11.y : " + Obj11.y);
		System.out.println("Obj12.x : " + Obj12.x);
		System.out.println("Obj12.y : " + Obj12.y);
		System.out.println("Obj13.x : " + Obj13.x);
		System.out.println("Obj13.y : " + Obj13.y);
	}
}

class Css2 {
	int x=-1;
	int y=-1;
	Css2(int ... arr){
		if(arr.length>0)x=arr[0];
		if(arr.length>1)y=arr[1];
	};
	Css2 rtrnPlus1Obj() {
		Css2 temp = new Css2(x+1, y+1);
		return temp;
	};
};