package h1AWT;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppletFrame2 extends Applet implements MouseListener, MouseMotionListener {
	YFrame f;
	String msg = "";
	int mouseX = 0;
	int mouseY = 0;
	@Override
	public void init() {
		f = new YFrame("frame window");
		f.setSize(250, 250);
		f.setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	public void start() {f.setVisible(true);}
	@Override
	public void stop() {f.setVisible(false);}
	@Override
	public void mouseDragged(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "down";
		repaint();
	}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
		g.drawString("mouse : " + mouseX + "," + mouseY, 10, 20);
	}

	class YFrame extends Frame implements MouseListener, MouseMotionListener {
		String msg = "";
		int mouseX = 0;
		int mouseY = 0;
		public YFrame(String title) {
			super(title);
			addMouseListener(this);
			addMouseMotionListener(this);
			YWindowAdapter adapter = new YWindowAdapter(this);
			addWindowListener(adapter);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {}
		@Override
		public void mouseMoved(MouseEvent e) {}
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {
			mouseX = e.getX();
			mouseY = e.getY();
			msg = "down";
			repaint();
		}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
		
		@Override
		public void paint(Graphics g) {
			g.drawString(msg, mouseX, mouseY);
			g.drawString("mouse : " + mouseX + "," + mouseY, 10, 20);
		}
	}
	
	class YWindowAdapter extends WindowAdapter {
		YFrame yFrame;
		public YWindowAdapter(YFrame yFrame) {this.yFrame = yFrame;}
		@Override
		public void windowClosing(WindowEvent e) {yFrame.setVisible(false);}
	}

	
}
