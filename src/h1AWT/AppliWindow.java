package h1AWT;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppliWindow extends Frame {
	String mmsg = "";
	String kmsg = "";
	int mouseX = 20;
	int mouseY = 20;
	public static void main(String[] args) {
		AppliWindow appliWindow = new AppliWindow();
		appliWindow.setSize(500, 600);
		appliWindow.setTitle("yh apli");
		appliWindow.setVisible(true);
	}
	
	public AppliWindow() {
		addKeyListener(new YKeyAdapter(this));
		addMouseListener(new YMouseAdapter(this));
		addWindowListener(new YWindowAdapter());
	}
	@Override
	public void paint(Graphics g) {
		g.drawString(mmsg, mouseX, mouseY);
		g.drawString(kmsg, 20, 50);
	}
	
	class YKeyAdapter extends KeyAdapter {
		AppliWindow appliWindow;
		public YKeyAdapter(AppliWindow appliWindow) {
			this.appliWindow = appliWindow;
		}
		@Override
		public void keyTyped(KeyEvent e) {
			appliWindow.kmsg += e.getKeyChar();
			appliWindow.repaint();
		}
	}
	
	class YMouseAdapter extends MouseAdapter {
		AppliWindow appliWindow;
		public YMouseAdapter(AppliWindow appliWindow) {
			this.appliWindow = appliWindow;
		}
		@Override
		public void mousePressed(MouseEvent e) {
			appliWindow.mouseX = e.getX();
			appliWindow.mouseY = e.getY();
			appliWindow.mmsg = "mouse down at " + appliWindow.mouseX + ", " + appliWindow.mouseY;
			appliWindow.repaint();
		}
	}
	
	class YWindowAdapter extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {System.exit(0);}
	}
}
