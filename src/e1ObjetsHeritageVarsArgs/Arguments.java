package e1ObjetsHeritageVarsArgs;

class Arguments {

	public static void main(String[] args) {
		
		afficheArgs();
		afficheArgs(1);
		afficheArgs(1, 2);
		afficheArgs(1,2,3);
		afficheArgs("arguments : ",1,2,3);
		afficheArgs(true, false, true);
		
	}
	
	protected static void afficheArgs(int ... arg) {
		System.out.println("------------");
		System.out.println("*1*");
		for (int i = 0; i < arg.length; i++) {
			System.out.println(i + " : " + arg[i]);
		}
		System.out.println("------------");
	};
	
	protected static void afficheArgs(String msg, int ... arg) {
		System.out.println("------------");
		System.out.println("*2*");
		System.out.println(msg);
		for (int i = 0; i < arg.length; i++) {
			System.out.println(i + " : " + arg[i]);
		}
		System.out.println("------------");
	};
	
	protected static void afficheArgs(boolean ... arg) {
		System.out.println("------------");
		System.out.println("*3*");
		for (int i = 0; i < arg.length; i++) {
			System.out.println(i + " : " + arg[i]);
		}
		System.out.println("------------");
	};
	
	protected static void afficheArgs(int arg) {
		System.out.println("------------");
		System.out.println("*4*");
		System.out.println(arg);
		System.out.println("------------");
		
	};
	
	protected static void afficheArgs() {
		System.out.println("------------");
		System.out.println("*5*");
		System.out.println("no args");
		System.out.println("------------");
		
	};
	

}
