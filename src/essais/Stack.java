package essais;

public class Stack {
	private int[] stck;
	private int current;
	public int currentPos;
	public Stack() {
		current=-1;
		currentPos=current;
		stck = new int[10];
	};
	public Stack(int i) {
		current=-1;
		currentPos=current;
		stck = new int[i];
	};
	
	boolean put(int x) {
		if(current <(stck.length-1)){
			stck[++current]=x;
			currentPos=current;
			return true;
		}
		else return false;
	}
	int get() {
		if((current)>=0) {
			current--;
			currentPos=current;
			return stck[current+1];
		} else {
			currentPos=current;
			return 0;
		}
	}
	/**/
	
	
}
