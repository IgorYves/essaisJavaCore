package f3jUtil2;

import java.util.Timer;
import java.util.TimerTask;

class JUtil206 {

	public static void main(String[] args) {
		TimeTask tt = new TimeTask();
		Timer tmr = new Timer(true);
		tmr.schedule(tt, 1000, 400);
		try {
			Thread.sleep(5_000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//tmr.cancel();
		
	}
}

class TimeTask extends TimerTask {
	int count = 0;
	@Override
	public void run() {
		System.out.println("go " + count++);
		java.awt.Toolkit.getDefaultToolkit().beep();
	}
	
}