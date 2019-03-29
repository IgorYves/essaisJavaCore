package h2AWT2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;

public class ImageHisto extends Frame implements ActionListener {
	Image img;
	int w, h;
	int[] hist = new int[256];
	int[] pixels;
	int histMax;
	public ImageHisto() {
		super();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		setSize(1600, 1000);
		setTitle("igor's aplication pour tester image histogramme");
		setBackground(new Color(100, 150, 130));
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ImageHisto image1Demo = new ImageHisto();
	}
	
	
	@Override
	public void paint(Graphics graphics) {
		Image testImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
		Graphics iGraphics = testImage.getGraphics();
		iGraphics.setColor(Color.YELLOW);
		iGraphics.fillRect(10, 20, 50, 60);
		graphics.drawImage(testImage, 20, 100, null);
		/////////////////////////////////////////////////////
		for (int i = 0; i < hist.length; i++) {hist[i] = 0;}
		try {
			Image image = Toolkit.getDefaultToolkit().getImage("oiseau.png");
			MediaTracker tracker = new MediaTracker(this);
			tracker.addImage(image, 0);
			tracker.waitForID(0);
			graphics.drawImage(image, 200, 70, this);
			w = image.getWidth(this);
			h = image.getHeight(this);
			pixels = new int[w*h];
			PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, w, h, pixels, 0, w);
			pixelGrabber.grabPixels();
		} catch (InterruptedException e) {
			System.out.println("error dans try" + e);
		}
		for (int i = 0; i < w*h; i++) {
				int pixel = pixels[i];
				int r = 0xff & (pixel >> 16);
				int g = 0xff & (pixel >> 8);
				int b = 0xff & (pixel);
				//int y = (int)(r*0.33 + g*0.56 + b*0.11);
				int y = (r + g + b) / 3;
				hist[y]++;
			}	
		for (int i = 0; i < hist.length; i++) {
			if (hist[i] > histMax) histMax = hist[i];
		}			int hiW = 256;
		int hiH = 300;
		Image histImage = new BufferedImage(hiW, hiH, BufferedImage.TYPE_INT_RGB);
		Graphics hiGraphics = histImage.getGraphics();
		hiGraphics.setColor(Color.lightGray);
		hiGraphics.fillRect(0, 0, hiW, hiH);
		hiGraphics.setColor(Color.BLUE);
		for (int i = 0; i < hist.length; i++) {
			if (hist[i] > 0) {
				hiGraphics.drawLine(i, hiH, i, hiH - hist[i]*hiH/histMax);
			}
		}
		graphics.drawImage(histImage, 200, 480, null);
		////////////////////
		for (int i = 0; i < hist.length; i++) {hist[i] = 0;}
		try {
			Image image = Toolkit.getDefaultToolkit().getImage("Mona_Lisa.jpg");
			MediaTracker tracker = new MediaTracker(this);
			tracker.addImage(image, 0);
			tracker.waitForID(0);
			graphics.drawImage(image, 800, 70, this);
			w = image.getWidth(this);
			h = image.getHeight(this);
			pixels = new int[w*h];
			PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, w, h, pixels, 0, w);
			pixelGrabber.grabPixels();
		} catch (InterruptedException e) {
			System.out.println("error dans try" + e);
		}
		for (int i = 0; i < w*h; i++) {
				int pixel = pixels[i];
				int r = 0xff & (pixel >> 16);
				int g = 0xff & (pixel >> 8);
				int b = 0xff & (pixel);
				//int y = (int)(r*0.33 + g*0.56 + b*0.11);
				int y = (r + g + b) / 3;
				hist[y]++;
			}	
		for (int i = 0; i < hist.length; i++) {
			if (hist[i] > histMax) histMax = hist[i];
		}	
		hiW = 256;
		hiH = 300;
		Image histImage2 = new BufferedImage(hiW, hiH, BufferedImage.TYPE_INT_RGB);
		Graphics hiGraphics2 = histImage2.getGraphics();
		hiGraphics2.setColor(Color.lightGray);
		hiGraphics2.fillRect(0, 0, hiW, hiH);
		hiGraphics2.setColor(Color.BLUE);
		for (int i = 0; i < hist.length; i++) {
			if (hist[i] > 0) {
				hiGraphics2.drawLine(i, hiH, i, hiH - hist[i]*hiH/histMax);
			}
		}
		graphics.drawImage(histImage2, 800, 480, null);
		/////////////////////////////////
		for (int i = 0; i < hist.length; i++) {hist[i] = 0;}
		try {
			Image image = Toolkit.getDefaultToolkit().getImage("winter.jpg");
			MediaTracker tracker = new MediaTracker(this);
			tracker.addImage(image, 0);
			tracker.waitForID(0);
			graphics.drawImage(image, 1200, 70, this);
			w = image.getWidth(this);
			h = image.getHeight(this);
			pixels = new int[w*h];
			PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, w, h, pixels, 0, w);
			pixelGrabber.grabPixels();
		} catch (InterruptedException e) {
			System.out.println("error dans try" + e);
		}
		for (int i = 0; i < w*h; i++) {
				int pixel = pixels[i];
				int r = 0xff & (pixel >> 16);
				int g = 0xff & (pixel >> 8);
				int b = 0xff & (pixel);
				//int y = (int)(r*0.33 + g*0.56 + b*0.11);
				int y = (r + g + b) / 3;
				hist[y]++;
			}	
		for (int i = 0; i < hist.length; i++) {
			if (hist[i] > histMax) histMax = hist[i];
		}	
		hiW = 256;
		hiH = 300;
		Image histImage3 = new BufferedImage(hiW, hiH, BufferedImage.TYPE_INT_RGB);
		Graphics hiGraphics3 = histImage3.getGraphics();
		hiGraphics3.setColor(Color.lightGray);
		hiGraphics3.fillRect(0, 0, hiW, hiH);
		hiGraphics3.setColor(Color.BLUE);
		for (int i = 0; i < hist.length; i++) {
			if (hist[i] > 0) {
				hiGraphics3.drawLine(i, hiH, i, hiH - hist[i]*hiH/histMax);
			}
		}
		graphics.drawImage(histImage3, 1200, 480, null);
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
