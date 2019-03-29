package h1AWT;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.StringTokenizer;

public class AppliWindow4 extends Frame {
	int curX = 10;
	int curY = 100;
	int margin = 20;
	String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
			+ "Sed non risus. Suspendisse lectus tortor, dignissim sit amet, "
			+ "adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam."
			+ " Maecenas ligula massa, varius a, semper congue, euismod non, mi. "
			+ "Proin porttitor, orci nec nonummy molestie, enim est eleifend mi,"
			+ " non fermentum diam nisl sit amet erat. Duis semper. Duis arcu massa, "
			+ "scelerisque vitae, consequat in, pretium a, enim. Pellentesque congue."
			+ " Ut in risus volutpat libero pharetra tempor. "
			+ "Cras vestibulum bibendum augue. Praesent egestas leo in pede. "
			+ "Praesent blandit odio eu enim. Pellentesque sed dui ut augue"
			+ " blandit sodales. Vestibulum ante ipsum primis in faucibus orci "
			+ "luctus et ultrices posuere cubilia Curae; Aliquam nibh. Mauris "
			+ "ac mauris sed pede pellentesque fermentum. "
			+ "Maecenas adipiscing ante non diam sodales hendrerit. ";
	
	public AppliWindow4() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				repaint();
			}
		}
		
	);
	}
	
	public static void main(String[] args) {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fonts = ge.getAvailableFontFamilyNames();
		for (String f : fonts) {
			System.out.println(f);
		}
		
		
		AppliWindow4 appliWindow = new AppliWindow4();
		appliWindow.setSize(800, 800);
		appliWindow.setTitle("yh apli");
		appliWindow.setVisible(true);
		Font font = new Font("Verdana", Font.PLAIN, 18);
		appliWindow.setFont(font);
		
	}
	
	@Override
	public void paint(Graphics g) {
		update(g);
	}
	
	@Override
	public void update(Graphics g) {
		FontMetrics fm = g.getFontMetrics();
		StringTokenizer st = new StringTokenizer(text) ;
		String ligne = "";
		String nextWorld = "";
		curX = margin;
		g.setColor(getBackground());
		g.fillRect(0, 0, this.getSize().width, this.getSize().height );
		g.setColor(getForeground());
		while (st.hasMoreTokens()) {
			nextWorld = st.nextToken();
			if (fm.stringWidth(ligne + nextWorld) < (this.getSize().width - margin*2))
				ligne += nextWorld + " ";
			else {
				g.drawString(ligne, curX, curY);
				curY += fm.getHeight();
				ligne = "";
			}
		}
		curY = 100;
	}
	
	
}
