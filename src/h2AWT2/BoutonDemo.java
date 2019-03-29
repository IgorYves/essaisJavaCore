package h2AWT2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BoutonDemo extends Frame implements ActionListener {
	String msg = "";
	Button[] buttonList = {new Button("Yes"), new Button("No"), new Button("Undecided")};
	Button yes;
	Button no;
	Button maybe;
	
	public BoutonDemo() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
	}
	
	public static void main(String[] args) {
		BoutonDemo boutonDemo = new BoutonDemo();
		boutonDemo.setSize(800, 800);
		boutonDemo.setTitle("yh apli");
		boutonDemo.setVisible(true);
		boutonDemo.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		for (int i = 0; i < boutonDemo.buttonList.length; i++) {
			boutonDemo.add(boutonDemo.buttonList[i]);
			boutonDemo.buttonList[i].addActionListener(boutonDemo);
		}
		
		
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, 10, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		for (int i = 0; i < buttonList.length; i++) {
			if (e.getSource() == buttonList[i]) {
				msg = "pressed " + buttonList[i].getLabel();
			}
		}
	}
}
