package e1ObjetsHeritageVarsArgs;

class Heritage2 {
	public static void main(String[] args) {
	System.out.println("creation Triangle T1");
	Triangle T1 = new Triangle(50, 60, 70);
	System.out.println("T1.cotes() " + T1.cotes());
	System.out.println("**********");
	System.out.println("creation ColoredTriangle CT1");
	ColoredTriangle CT1 = new ColoredTriangle(55, 22, 99, 5, 10, 20);
	CT1.getParams();
	System.out.println("**********");
	//System.out.println(T1.cotes());
	}

}

class Polygon {
	int[] cotesArr = {};
	String myName = "Polygon";
	String cotes() {return this.myName + " " + Integer.toString(this.cotesArr.length);};
};

class Triangle extends Polygon {
	int[] cotesArr = {0,0,0};
	String myName = "Triangle";
	//Triangle(){};
	Triangle(int a, int b, int c){
		cotesArr[0] = a;
		cotesArr[1] = b;
		cotesArr[2] = c;
		System.out.println(cotesArr.length + " cotes : " + cotesArr[0] + " " + cotesArr[1] + " " + cotesArr[2]);
		System.out.println("Triangle.cotes() " + cotes());
		System.out.println("----------");
	};
	Triangle(int[] arg){
		if(arg.length == 3) {cotesArr = arg;};
		System.out.println(cotesArr.length);
	};
	//String cotes() {return this.myName + " " + cotesArr.length + " " + cotesArr[0] + " " + cotesArr[1] + " " + cotesArr[2];};
};

class ColoredTriangle extends Triangle {
	int[] color = {0,0,0};
	String myName = "ColoredTriangle";
	ColoredTriangle(int rg, int gr, int bl, int ... arg){
		super(arg[0], arg[1], arg[2]);
		color[0] = rg;
		color[1] = gr;
		color[2] = bl;
	};
	void getParams() {
		System.out.println("ColoredTriangle.cotes() " + cotes());
		System.out.println(color[0] + "." + color[1] + "." + color[2]);
		
	};
};


/*
class Quadrangle extends Polygon {
	int[] cotesArr = {0,0,0,0};
	String myName = "Quadrangle";
	public String type;
	Quadrangle(){};
	Quadrangle(int a, int b, int c, int d){
		cotesArr[0] = a;
		cotesArr[1] = b;
		cotesArr[2] = c;
		cotesArr[3] = d;
		type = "Quadrangle libre";
	};
	Quadrangle(int a, int b){
		cotesArr[0] = cotesArr[2] = a;
		cotesArr[1] = cotesArr[3] = b;
		type = "Quadrangle 2x2";
	};
	Quadrangle(int a){
		cotesArr[0] = cotesArr[2] = cotesArr[1] = cotesArr[3] = a;
		type = "Quadrangle egale";
	};
};

class ColoredQuadrangle extends Quadrangle {
	int[] color = {0,0,0};
	String myName = "ColoredQuadrangle";
	ColoredQuadrangle(){};
	ColoredQuadrangle(int rg, int gr, int bl){
		color[0] = rg;
		color[1] = gr;
		color[2] = bl;
		
	};
};
*/