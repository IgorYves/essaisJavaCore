package f8events;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeysEvents extends Applet implements KeyListener {

	String msg = "";
	int X = 10;
	int Y = 20;
	
	@Override
	public void init() {
		addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		showStatus("key down");
		int key = e.getKeyCode();
		switch (key) {
			case KeyEvent.VK_F1 :
				msg += "<F1>";
				break;
			case KeyEvent.VK_F2 :
				msg += "<F2>";
				break;
			case KeyEvent.VK_LEFT :
				msg += "<left>";
				break;
			case KeyEvent.VK_RIGHT :
				msg += "<rignt>";
				break;
			case KeyEvent.VK_PAGE_DOWN :
				msg += "<pgDn>";
				break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		showStatus("key up");
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		msg += e.getKeyChar();
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, X, Y);
	}
	
}
