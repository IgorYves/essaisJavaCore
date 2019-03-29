package e2EnumsHeritageInterfaces.stack;

public class FxdStack implements InterfaceStack {
	private int[] stck;
	private int current;
	public int currentPos;
	public FxdStack() {
		current=-1;
		currentPos=-1;
		stck = new int[CONST];
	};
	public FxdStack(int i) {
		current=-1;
		currentPos=-1;
		stck = new int[i];
	};
	
	@Override
	public void put(int x) {
		if(current <(stck.length-1)){
			stck[++current]=x;
			currentPos=current;
		}
	}
	@Override
	public int get() {
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
