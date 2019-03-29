package sw01;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.RenderingHints;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class Scroll extends JFrame {
	JLabel jLabel11;
	JToggleButton jToggleButton;
	JCheckBox jCheckBox4;
	public Scroll() throws HeadlessException {
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jPanel = new JPanel();
		jPanel.setVisible(true);
		jPanel.setOpaque(true);
		jPanel.setBackground(new Color(100, 150, 150));
		
//		JScrollPane jScrollPane = new JScrollPane(jPanel);
//		this.add(jScrollPane, BorderLayout.CENTER);
//		this.setContentPane(jPanel);
		this.setVisible(true);
		this.add(jPanel);
		
		Graphics2D graphics = (Graphics2D) jPanel.getGraphics();
		System.out.println(graphics);
		graphics.setColor(new Color(0, 0, 160));
		graphics.setFont(new Font("Ariel",Font.PLAIN,500));
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f ));
		graphics.drawString("AFPA", 50, this.getHeight()/2+200);
		graphics.drawRect(100, 100, 300, 300);
		graphics.dispose();
		
//		GridBagLayout gridBagLayout = new GridBagLayout();
//		jPanel.setLayout(gridBagLayout);
//		
//		GridBagConstraints gridBagConstraints = new GridBagConstraints();
//		gridBagConstraints.fill = GridBagConstraints.BOTH;
//		gridBagConstraints.weightx = 1.0;
//		gridBagConstraints.ipadx = 100;
//		gridBagConstraints.insets = new Insets(10, 10, 10, 10);
//		
//		for (int i = 1; i <= 20; i++) {
//			for (int j = 1; j < 30; j++) {
//				gridBagConstraints.gridx = i;
//				gridBagConstraints.gridy = j;
//				JButton b = new JButton("bouton" + i + "-" + j);
//				gridBagLayout.setConstraints(b, gridBagConstraints);
//				jPanel.add(b);
//			}
//		}
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->new Scroll());
	}
}
