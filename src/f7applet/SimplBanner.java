package f7applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*
 <applet code="Sample" width=400 height=200>
 </applet>
 */

public class SimplBanner extends Applet implements Runnable {
	String msg = " - - mouving banner - - ";
	Thread thrd = null;
	int state;
	volatile boolean stopFlag;
	@Override
	public void init() {
		setBackground(Color.lightGray);
		setForeground(Color.blue);
		
	}
	@Override
	public void start() {
		thrd = new Thread(this);
		stopFlag = false;
		thrd.start();
	}
	@Override
	public void run() {
		for (;;) {
			try {
				repaint();
				Thread.sleep(150);
				if (stopFlag) break;
			}catch (InterruptedException e) {}
		}
	}
	@Override
	public void stop() {
		stopFlag = true;
		thrd = null;
	}
	@Override
	public void destroy() {
		
	}
	@Override
	public void paint(Graphics g) {
		char c;
		c = msg.charAt(0);
		msg = msg.substring(1, msg.length());
		msg += c;
		g.drawString(msg, 10, 30);
		showStatus("status string");
	}
}
