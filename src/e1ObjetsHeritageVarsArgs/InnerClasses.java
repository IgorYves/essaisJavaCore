package e1ObjetsHeritageVarsArgs;

class InnerClasses {
	public static void main(String[] args) {
		OuterClass ObjOuter = new OuterClass();
		System.out.println("ObjOuter.x : " + ObjOuter.x);
		ObjOuter.x = 5;
		System.out.println("ObjOuter.x : " + ObjOuter.x);
				
		int a = ObjOuter.createInner(6);
		System.out.println("a : " + a);
		a = ObjOuter.createInner(7);
		System.out.println("a : " + a);
		a = ObjOuter.createInner2(20);
		System.out.println("a : " + a);
		
		
	}

}

class OuterClass {
	int x = -1;
	
	int createInner(int i) {
		InnerClass ObjInner = new InnerClass(i);
		return ObjInner.y;
	};
	int createInner2(int i) {
		InnerClass ObjInner = new InnerClass(i);
		return ObjInner.y+x;
	};
	
	
	
	
	class InnerClass {
		int y = -2;
		InnerClass(int i){y=i;};
	};
};
