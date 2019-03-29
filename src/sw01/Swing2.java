package sw01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Swing2 extends JApplet {
	JLabel jLabel;
	JButton jButton1;
	JButton jButton2;
	private void makeGUI() {
		setLayout(new FlowLayout());
		setSize(600, 800);
		
		jButton1 = new JButton("bouton1");
		jButton2 = new JButton("bouton2");
		jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jLabel.setText("bouton1 pressed");				
			}
		});
		jButton2.addActionListener((actionEvent)->jLabel.setText("bouton2 pressed"));
		
		add(jButton1);
		add(jButton2);
		jLabel = new JLabel("press bouton");
		add(jLabel);
		
	}

	@Override
	public void init() {
		try {
			SwingUtilities.invokeAndWait(()->makeGUI());
			//SwingUtilities.invokeAndWait(new Runnable() {@Override public void run() {makeGUI();}});
		} catch (InvocationTargetException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
