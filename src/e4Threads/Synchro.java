package e4Threads;

class Synchro {

	public static void main(String[] args) {
		System.out.println("debutMain");
		Call apell = new Call();
		Caller obj1 = new Caller(apell, "Salut1");
		Caller obj2 = new Caller(apell, "Salut2");
		Caller obj3 = new Caller(apell, "Salut3");
		
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}
		catch(InterruptedException e) {System.out.println("interrompuMain");}
		System.out.println("finMain");
		
		System.out.println("debutMain2");
		Call2 apell2 = new Call2();
		Caller2 obj12 = new Caller2(apell2, "Salut1");
		Caller2 obj22 = new Caller2(apell2, "Salut2");
		Caller2 obj32 = new Caller2(apell2, "Salut3");
		
		try {
			obj12.t.join();
			obj22.t.join();
			obj32.t.join();
		}
		catch(InterruptedException e) {System.out.println("interrompuMain");}
		System.out.println("finMain2");
	}
}

class Call{
	synchronized void appel(String s) {
		System.out.print("//Call-" + s);
		try {Thread.sleep(500);}
		catch (InterruptedException e) {System.out.println("interrompuCall");}
		System.out.println("||");
	}
}

class Caller implements Runnable{
	String msg;
	Call qui;
	Thread t;
	public Caller(Call trgt, String s) {
		qui = trgt;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		qui.appel(msg);
	}
}

class Call2{
	void appel(String s) {
		System.out.print("//Call2-" + s);
		try {Thread.sleep(500);}
		catch (InterruptedException e) {System.out.println("interrompuCall");}
		System.out.println("||");
	}
}

class Caller2 implements Runnable{
	String msg;
	Call2 qui;
	Thread t;
	public Caller2(Call2 trgt, String s) {
		qui = trgt;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		synchronized(qui){qui.appel(msg);}
	}
}

