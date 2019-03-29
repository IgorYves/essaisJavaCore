package a001;

public class Constr2 {

	public static void main(String[] args) {
		
		Cnstr2 obj = new Cnstr2(new Cnstr2(5, 6).getXY(), 7, 8);
		
		
		//System.out.println("" + obj.xy.x + " " + obj.xy.y + " " + obj.i + " " + obj.j);
		
	}

}
