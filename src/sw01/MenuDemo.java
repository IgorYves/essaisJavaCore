package sw01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MenuDemo implements ActionListener {
	JLabel jlab;
	JMenuBar jmЬ;
	YAction setAct;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->new MenuDemo());

	}
	public MenuDemo() {
		JFrame jfrm = new JFrame("menu demo");
		jfrm.setSize(360, 200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlab = new JLabel();
		jmЬ = new JMenuBar();
		
		setAct = new YAction("Set");
		
		JMenu jmFile = new JMenu("File");
		JMenuItem jmiOpen = new JMenuItem(setAct);
		jmiOpen.addActionListener(this);
		jmFile.add(jmiOpen);
		
		jmЬ.add(jmFile);
		
		
		jfrm.add(jlab, SwingConstants.CENTER);
		jfrm.setJMenuBar(jmЬ);
		jfrm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jlab.setText(e.getActionCommand());
	}
	
	class YAction extends AbstractAction {
		public YAction(String name) {
			super(name);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			jlab.setText(e.getActionCommand());
		}
	}
}
