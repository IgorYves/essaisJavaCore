package h1AWT;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppliWindow2 extends Frame {
	final int inc = 25;
	int max = 800;
	int min = 400;
	Dimension d;
	public static void main(String[] args) {
		AppliWindow2 appliWindow = new AppliWindow2();
		appliWindow.setSize(800, 800);
		appliWindow.setTitle("yh apli");
		appliWindow.setVisible(true);
	}
	
	public AppliWindow2() {
		addWindowListener(new YWindowAdapter());
		addMouseListener(new MouseAdapter() {
						@Override
						public void mouseReleased(MouseEvent e) {
							int w = (d.width + inc) > max?min : (d.width + inc) ;
							int h = (d.height + inc) > max?min : (d.height + inc ) ;
							setSize(new Dimension(w, h)) ;
						}
					}
					
				);
	}
	@Override
	public void paint(Graphics g) {
		setBackground(new Color(210, 210, 200));
		setForeground(new Color(10, 50, 50));
		g.drawLine(0, 0, 200, 200);
		g.fillRect(200, 200, 400, 400);
		g.setXORMode(new Color(100, 150, 150));
		g.fillRect(250, 150, 150, 150);
		g.drawRoundRect(20, 200, 100, 100, 20, 50);
		g.setColor(new Color(50, 30, 150));
		g.fillOval(90, 250, 75, 50);
		g.setPaintMode();
		g.drawArc(10, 350, 70, 70, 0, 180);
		d = getSize();
		g.drawLine(0, 0, d.width - 1, d.height - 1);
		g.drawLine(0, d.height - 1, d.width - 1, 0);
		g.drawRect(0, 0, d.width - 1, d.height - 1);
	}
	
	class YWindowAdapter extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {System.exit(0);}
	}
}
