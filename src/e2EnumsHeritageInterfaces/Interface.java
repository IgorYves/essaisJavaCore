package e2EnumsHeritageInterfaces;

public interface Interface {
	int addition(int x, int y);
	int soustraction(int x, int y);
	int a = 0;
}

class UnClass implements Interface {
	
	public int addition(int x, int y) {
		return x + y;
	};
	public int soustraction(int x, int y) {
		return x-y;
	};
	
};
