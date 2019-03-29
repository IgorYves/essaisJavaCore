package a001;

public class Fnlz {
	static int x = 0;
	int y;
	static int z = 0;
	public Fnlz() {
		y = x++;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize " + y);
		z++;
	}
	
	public static void main(String[] args) {
		Fnlz f;
		//f = new Fnlz();
		//f = null;
		for (int i = 0; i < 65; i++) {
			f = new Fnlz();
			f = null;
			System.gc();
		}
		//System.gc();
		System.out.println("-------------" + z);
	}
}
