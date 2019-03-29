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

public class ImageFilters extends Frame implements ActionListener  {
	Image img;
	int w, h;
	int[] hist = new int[256];
	int[] pixels;
	int histMax;
	public ImageFilters() {
		super();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		setSize(1600, 1000);
		setTitle("igor's aplication pour tester image filters");
		setBackground(new Color(100, 100, 130));
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ImageFilters imageFilters = new ImageFilters();
	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		
		for (int i = 0; i < hist.length; i++) {hist[i] = 0;}
		try {
			Image image = Toolkit.getDefaultToolkit().getImage("oiseau.png");
			MediaTracker tracker = new MediaTracker(this);
			tracker.addImage(image, 0);
			tracker.waitForID(0);
			graphics.drawImage(image, 200, 70, this);
			graphics.drawImage(imageHistogramme(image), 200, 480, null);
		} catch (InterruptedException e) {
			System.out.println("error dans try" + e);
		}
	}

	private Image imageHistogramme(Image image) {
		w = image.getWidth(this);
		h = image.getHeight(this);
		pixels = new int[w*h];
		PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, w, h, pixels, 0, w);
		try {
			pixelGrabber.grabPixels();
		} catch (InterruptedException e) {System.out.println("error dans try" + e);}
		for (int i = 0; i < w*h; i++) {
			int pixel = pixels[i];
			int r = 0xff & (pixel >> 16);
			int g = 0xff & (pixel >> 8);
			int b = 0xff & (pixel);
			//int y = (int)(r*0.33 + g*0.56 + b*0.11);
			int y = (int)(r*0.33 + g*0.56 + b*0.11);
			hist[y]++;
		}	
		for (int i = 0; i < hist.length; i++) {
			if (hist[i] > histMax) histMax = hist[i];
		}	
		int hiW = 256;
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
		return histImage;
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
