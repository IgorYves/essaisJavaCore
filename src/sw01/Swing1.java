package sw01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Swing1 {
	JLabel jLabel;
	public Swing1() {
		JFrame jFrame = new JFrame("YH swing application");
		jFrame.setLayout(new FlowLayout());
		jFrame.setSize(600, 800);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton jButton1 = new JButton("bouton1");
		JButton jButton2 = new JButton("bouton2");
		jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jLabel.setText("bouton1 pressed");				
			}
		});
		jButton2.addActionListener((actionEvent)->jLabel.setText("bouton2 pressed"+actionEvent));
		
		jFrame.add(jButton1);
		jFrame.add(jButton2);
		jLabel = new JLabel("press bouton");
		jFrame.add(jLabel);
		jFrame.setVisible(true);
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
										@Override
										public void run() {
											new Swing1();
											}
									}
								);
	}
}
