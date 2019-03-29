package h1AWT;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppliWindow3 extends Frame {
	int curX = 10;
	int curY = 100;
	int margin = 20;
	public AppliWindow3() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
	}
	
	public static void main(String[] args) {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fonts = ge.getAvailableFontFamilyNames();
		for (String f : fonts) {
			System.out.println(f);
		}
		
		
		AppliWindow3 appliWindow = new AppliWindow3();
		appliWindow.setSize(800, 800);
		appliWindow.setTitle("yh apli");
		appliWindow.setVisible(true);
		Font font = new Font("Verdana", Font.PLAIN, 20);
		appliWindow.setFont(font);
		
	}
	
	@Override
	public void paint(Graphics g) {
		Dimension d = this.getSize();
		
		nextLine("lorem ipsum dolor sit amet", g);
		nextLine("bla bla", g);
		sameLine("lorem ipsum dolor sit amet", g);
		sameLine("bla bla", g);
		rightLine("lorem ipsum dolor sit amet", g);
	}
	void nextLine(String s, Graphics g) {
		FontMetrics fm = g.getFontMetrics();
		curX = margin;
		curY += fm.getHeight();
		g.drawString(s, curX, curY);
		curX = margin + fm.stringWidth(s) + fm.charWidth('w');
	}
	void sameLine(String s, Graphics g) {
		FontMetrics fm = g.getFontMetrics();
		g.drawString(s, curX, curY);
		curX += fm.stringWidth(s) + fm.charWidth('w');
	}
	void rightLine(String s, Graphics g) {
		FontMetrics fm = g.getFontMetrics();
		curY += fm.getHeight();
		g.drawString(s, this.getSize().width - fm.stringWidth(s) - margin, curY);
	}
	
}
