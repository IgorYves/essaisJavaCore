package e8Generics;

class Coord {

	public static void main(String[] args) {
		TwoD[] td = {
				new TwoD(0,0), 
				new TwoD(2,7), 
				new TwoD(8,3), 
				new TwoD(5,5), 
				new TwoD(10,20)
		};
		Coords<TwoD> tdcoords = new Coords<TwoD>(td);
		showXY(tdcoords);
		//showXYZ(tdcoords);
		FourD[] fd = {
				new FourD(1,2,6,4),
				new FourD(2,6,3,4),
				new FourD(1,2,3,8),
				new FourD(5,2,2,4),
				new FourD(2,2,3,8)
		};
		System.out.println("------------");
		Coords<FourD> fdcoords = new Coords<FourD>(fd);
		showXY(fdcoords);
		showXYZ(fdcoords);
		showXYZT(fdcoords);
	}
	static void showXY(Coords<?> c) {
		System.out.println("XY");
		for(int i=0; i<c.coords.length; i++) {
			System.out.println(c.coords[i].x + " " 
								+ c.coords[i].y);
		}
		System.out.println();
	}
	static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("XYZ");
		for(int i=0; i<c.coords.length; i++) {
			System.out.println(c.coords[i].x + " " 
								+ c.coords[i].y + " " 
								+ c.coords[i].z);
		}
		System.out.println();
	}
	static void showXYZT(Coords<? extends FourD> c) {
		System.out.println("XYZT");
		for(int i=0; i<c.coords.length; i++) {
			System.out.println(c.coords[i].x + " "
								+ c.coords[i].y + " "
								+ c.coords[i].z);
		}
		System.out.println();
	}
}

class TwoD{int x,y; TwoD(int a, int b){x=a; y=b;}}
class ThreeD extends TwoD{int z; ThreeD(int a, int b, int c){super(a,b);z=c;}}
class FourD extends ThreeD{int t; FourD(int a, int b, int c, int d){super(a,b,c);t=d;}}

class Coords<T extends TwoD>{
	T[] coords;
	Coords(T[] o){coords = o;}
}