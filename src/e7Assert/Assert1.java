package e7Assert;

class Assert1 {
	static int num = 3;
	public static void main(String[] args) {
		int n;
		try {
			for(int i=0; i<10; i++) {
			n = getNum();
			System.out.println("n = " + n);
			assert num > 0 : "num <= 0";
		}

		} catch (AssertionError e) {
			System.out.println("errror !!!" + e);
		}
	}
	
	static int getNum() {return num--;}
}
