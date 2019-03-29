package k001;

public class ClassNAbstr {

	public static void main(String[] args) {
		PereNA o1 = new PereNA();
		PtitFilsNA o2 = new PtitFilsNA();
		
		o1.doSomething();
		o2.doSomething();
	}
}

class PereNA {
	void doSomething() {
		System.out.println("pere.fn");
	}
}

abstract class FilsA extends PereNA {
	@Override
	abstract void doSomething();
}

class PtitFilsNA extends FilsA {

	@Override
	void doSomething() {
		System.out.println("petit fils .fn");
	}
}