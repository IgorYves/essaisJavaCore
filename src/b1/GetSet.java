package b1;

public class GetSet {

	public static void main(String[] args) {
		Fils f = new Fils();
		f.setI(5);
		System.out.println(f.getI());
		
		

	}

}

class Parent {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
class Fils extends Parent {
	
}