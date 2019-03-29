package e2EnumsHeritageInterfaces.stack;

public class DynStack implements InterfaceStack {
	private int[] stck;
	private int current;
	public int currentPos;
	public DynStack() {
		current=-1;
		currentPos=-1;
		stck = new int[CONST];
	};
	public DynStack(int i) {
		current=-1;
		currentPos=-1;
		stck = new int[i];
	};
	
	@Override
	public void put(int x) {
		if(current == (stck.length-1)){
			int[] temp = new int[stck.length*2];
			for(int i=0; i<stck.length; i++) {temp[i]=stck[i];};
			stck=temp;
		}
		stck[++current]=x;
		currentPos=current;
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
