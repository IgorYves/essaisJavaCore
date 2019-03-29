package a001;

class Cnstr2 {
	int i = 0;
	int j = 0;
	Cnstr1 xy;
	public Cnstr2() {
		xy = new Cnstr1();
	}
	public Cnstr2(int i, int j) {
		xy = new Cnstr1(i, j);
	}
	public Cnstr2(Cnstr1 xy) {
		this.xy = xy;
	}
	public Cnstr2(Cnstr1 xy, int i, int j) {
		this.xy = xy;
		this.i = i;
		this.j = j;
	}
	Cnstr1 getXY() {
		return xy;
	}
}

class Cnstr1 {
	int x = 0;
	int y = 0;
	Cnstr1() {}
	Cnstr1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}