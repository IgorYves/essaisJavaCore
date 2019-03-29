package sw01;

import java.awt.HeadlessException;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class ScrollTxtFond extends JFrame {
	JLabel jLabel11;
	JToggleButton jToggleButton;
	JCheckBox jCheckBox4;
	public ScrollTxtFond() throws HeadlessException {
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HYJPanel jPanel = new HYJPanel();
		
		this.setVisible(true);
		this.add(jPanel);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->new ScrollTxtFond());
	}
}
