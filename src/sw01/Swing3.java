package sw01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Swing3 {
	PaintPanel paintPanel;
	Swing3() {
		JFrame jFrame = new JFrame("YH swing application");
		jFrame.setSize(600, 800);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		paintPanel = new PaintPanel();
		jFrame.add(paintPanel);
		jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->new Swing3());
	}
}

class PaintPanel extends JPanel {
	Insets insets;
	Random rand;
	PaintPanel() {
		setBorder(BorderFactory.createLineBorder(new Color(150, 100, 150), 15, true));
		rand = new Random();
	}
	
	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		setBackground(new Color(100, 150, 150));
		graphics.setColor(new Color(100, 50, 50));
		int x, y, x2, y2;
		int height = getHeight();
		int width = getWidth();
		insets = getInsets();
		for (int i = 0; i < 100; i++) {
			x = rand.nextInt(width - insets.left);
			y = rand.nextInt(height - insets.bottom);
			x2 = rand.nextInt(width - insets.left);
			y2 = rand.nextInt(height - insets.bottom);
			graphics.drawLine(x, y, x2, y2);
		}
	}
}


