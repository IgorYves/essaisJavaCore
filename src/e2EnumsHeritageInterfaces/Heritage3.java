package e2EnumsHeritageInterfaces;

class Heritage3 {
	public static void main(String[] args) {
		System.out.println("Heritage3 : creation Triangles T1");
		Triangles T1;
		T1 = new Triangles(50, 60, 70);
		Figure F1;
		F1 = new Figure(120, 130);
		System.out.println(T1.dim1);
		System.out.println(T1.dim2);
		System.out.println(F1.dim1);
		System.out.println(F1.dim2);
		System.out.println("----");
		//T1 = F1;
		F1 = T1;
		System.out.println(T1.dim1);
		System.out.println(T1.dim2);
		System.out.println(F1.dim1);
		System.out.println(F1.dim2);
		//System.out.println(F1.dim3);
		System.out.println("----");
		
		Triangles T2 = new Triangles(150, 160);
		System.out.println(T2.dim1);
		System.out.println(T2.dim2);
		System.out.println(T2.dim3);
	}
}

class Figure {
	int dim1 = 1;
	int dim2 = 1;
	Figure (){
		System.out.println("Figure() constructor, dafaults : " + dim1 + " " + dim2);
	};
	Figure (int a){
		dim1 = a;
		System.out.println("Figure (a) constructor : " + dim1);
	};
	Figure (int a, int b){
		dim1 = a;
		dim2 = b;
		System.out.println("Figure (a, b) constructor : " + dim1 + " " + dim2);
	};
};

class Triangles extends Figure {
	int dim2;
	int dim3 = 8;
	Triangles(int a, int b) {
		super(a, b);
		this.dim2 = super.dim2;
		//dim1 = a;
		//dim2 = b;
		//dim3 = 18;
	}
	
	Triangles(int a, int b, int c) {
		//super();
		//super.dim1 = a;
		//super.dim2 = b;
		super(a);
		super.dim2 = 20;
		this.dim2 = 30;
		//super(a, b);
		dim3 = c;
		System.out.println("Triangles(int a, int b, int c) constructor : " + dim3);
		System.out.println("Triangles T1 total : " + dim1 + " " + dim2 + " " + dim3);
		System.out.println("----------");
		System.out.println("Triangles T1 total supers : " + super.dim1 + " " + super.dim2);
	}
	
};

