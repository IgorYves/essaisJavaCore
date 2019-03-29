package h2AWT2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.MemoryImageSource;

public class Image1 extends Frame implements ActionListener {
	Image img;
	public Image1() {
		super();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		setSize(800, 800);
		setTitle("igor's aplication pour tester image");
		setBackground(new Color(100, 150, 150));
		
		//Canvas canvas = new Canvas();
		
		
		
		setVisible(true);
		
		//pack();
	}
	
	public static void main(String[] args) {
		Image1 image1Demo = new Image1();
		
		
	}
	
	
	@Override
	public void paint(Graphics graphics) {
		Image testImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
		Graphics iGraphics = testImage.getGraphics();
		iGraphics.setColor(Color.YELLOW);
		iGraphics.fillRect(10, 20, 50, 60);
		graphics.drawImage(testImage, 20, 100, null);
		
		int w = 250;
		int h = 250;
		int[] pixels = new int[w*h];
		int i = 0;
		for (int y=0; y<h; y++) {
			for (int x=0; x<w; x++) {
				int r = (x ^ y) & 0xff;
				int g = (x*2 ^ y*2) & 0xff;
				int b = (x*4 ^ y*4) & 0xff;
				pixels[i++] = (255 << 24) | (r << 16) | (g << 8) | b;
			}
		}
		img = createImage(new MemoryImageSource(w, h, pixels, 0, w));
		graphics.drawImage(img, 150, 100, null);
		
		i = 0;
		for (int y=0; y<h; y++) {
			for (int x=0; x<w; x++) {
				int r = x & 0xff;
				int g = y & 0xff;
				int b = 100 & 0xff;
				pixels[i++] = (255 << 24) | (r << 16) | (g << 8) | b;
			}
		}
		img = createImage(new MemoryImageSource(w, h, pixels, 0, w));
		graphics.drawImage(img, 450, 100, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		repaint();
	}
	
	@Override
	public Insets getInsets() {
		Insets normal = super.getInsets();
		return new Insets(normal.top + 100, normal.left + 100, normal.bottom + 100, normal.right + 100);
	}
}
