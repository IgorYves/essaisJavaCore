package f3jUtil2;

import java.util.Observable;
import java.util.Observer;

class JUtil205 {

	public static void main(String[] args) {
		BeingWatched bW1 = new BeingWatched();
		Watcher w1 = new Watcher();
		Watcher2 w2 = new Watcher2();
		bW1.addObserver(w1);
		bW1.addObserver(w2);
		bW1.counter(5);
	}
}

class Watcher implements Observer {
	@Override
	public void update(Observable obj, Object arg) {
		System.out.println("observer : " + ((Integer)arg).intValue());
	}
}

class Watcher2 implements Observer {
	@Override
	public void update(Observable obj, Object arg) {
		if (((Integer)arg).intValue() == 0) {
			java.awt.Toolkit.getDefaultToolkit().beep();
		}
		
	}
}

class BeingWatched extends Observable {
	void counter(int count) {
		for (; count>=0; count--) {
			setChanged();
			notifyObservers(new Integer(count));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}