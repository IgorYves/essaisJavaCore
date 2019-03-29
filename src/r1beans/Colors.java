package r1beans;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;

public class Colors extends Frame implements Serializable {
	transient private Color color;
	private boolean rectangular;
	
	public Colors() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				change();
				rectangular ^= true;
			}
		});
		rectangular = false;
		setSize(200, 100);
		change();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
	}
	
	public boolean getRectangular() {return rectangular;}
	public void setRectangular(boolean flag) {
		this.rectangular = flag;
		repaint();
	}
	public void change() {
		color = randomColor();
		repaint();
	}
	private Color randomColor() {
		int r = (int)(255*Math.random());
		int g = (int)(255*Math.random());
		int b = (int)(255*Math.random());
		return new Color(r, g, b);
	}
	@Override
	public void paint(Graphics g) {
		Dimension d = getSize();
		int h = d.height - 200;
		int w = d.width - 50;
		g.setColor(color);
		if (rectangular) g.fillRect(20, 100, w, h);
		else g.fillOval(20, 100, w, h);
	}
	
	public static void main(String[] args) {
		Colors co = new Colors();
		co.setSize(800, 800);
		co.setTitle("yh apli");
		co.setVisible(true);
		
	}
	
}
