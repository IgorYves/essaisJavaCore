// DeadLock
package e4Threads;

class Synchro3 implements Runnable {
	A a = new A();
	B b = new B();
	public static void main(String[] args) {new Synchro3();}
	@Override
	public void run() {
		b.metod(a);
		System.out.println("return dans main thread");
	}
	public Synchro3() {
		Thread.currentThread().setName("main thread");
		Thread t = new Thread(this, "concurrent thread");
		t.start();
		a.metod(b);
		System.out.println("return dans main thread");
	}
}

class A{
	synchronized void metod(B b) {
		System.out.println(Thread.currentThread().getName() + " entre dans A.metod()");
		try {Thread.sleep(1000);}
		catch (InterruptedException e) {System.out.println("interrompuA");}
		System.out.println(Thread.currentThread().getName() + " essaie appeler B.metod2()");
		b.metod2();
	}
	synchronized void metod2() {System.out.println("dans A.metod2");}
}

class B{
	synchronized void metod(A a) {
		System.out.println(Thread.currentThread().getName() + " entre dans B.metod()");
		try {Thread.sleep(1000);}
		catch (InterruptedException e) {System.out.println("interrompuB");}
		System.out.println(Thread.currentThread().getName() + " essaie appeler A.metod2()");
		a.metod2();
	}
	synchronized void metod2() {System.out.println("dans B.metod2");}
}