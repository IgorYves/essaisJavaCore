package f8events;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
	
	String msg = "";
	int mouseX = 0;
	int mouseY = 0;
	
	@Override
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "click";
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "enter";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "exit";
		repaint();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "down";
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "up";
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "*";
		showStatus("drag mouse at " + mouseX + ", " + mouseY);
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		showStatus("moving mouse at " + e.getX() + ", " + e.getY());
	}

	@Override
	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}
	
	
	
}
