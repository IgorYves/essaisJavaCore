package essais;

class Heritage {
	public static void main(String[] args) {
		Sup Su = new Sup(2, 3);
		Son So = new Son(20, 30, 40, 50);
		System.out.println("Sup ************");
		Su.echo();
		Su.x = 1;
		Su.y = 5;
		Su.echo();
		
		System.out.println();
		System.out.println("Son ************");
		So.echo();
		So.echo2();
		So.x = 10;
		So.y = 50;
		So.z = 300;
		So.echo();
		So.echo2();
	}
}

class Sup {
	int x, y;
	Sup(){
		this.x = -1;
		this.y = -1;
	};
	Sup(int x, int y){
		this.x = x;
		this.y = y;
	};
	void echo(){
		System.out.println("SupEcho\tx:" + x + " y:" + y);
	};
};

class Son extends Sup {
	int z;
	Son(){
		this.x = -10;
		this.y = -10;
	};
	Son(int ... a){
		this.x = a[0];
		if(a.length>1)this.y = a[1];
		if(a.length>2)this.z = a[2];
	};
	void echo2() {
		System.out.println("SonEcho\tx:" + x + " y:" + y + " z:" + z);
	};
};