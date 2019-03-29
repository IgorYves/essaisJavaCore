package h2AWT2;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutDemo extends Frame implements ActionListener {
	String msg = "";
	Button[] buttonList = {new Button("Yes"), new Button("Go"), new Button("Close")};
	Button yes;
	Button no;
	Button maybe;
	String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	int fontNext = 0;
	
	public CardLayoutDemo() {
		super();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		
		setSize(800, 800);
		setTitle("yh apli");
		setBackground(new Color(100, 150, 150));
		
		//setLayout(null);
		//setLayout(new FlowLayout(FlowLayout.RIGHT));
		//setLayout(new BorderLayout(20,20));
		//String[] bl = {BorderLayout.WEST, BorderLayout.CENTER, BorderLayout.EAST};
		//setLayout(new GridLayout(2, 2));
		 
		setLayout(new CardLayout());
		Panel p = new Panel();
		p.add(buttonList[0]);
		p.setBackground(new Color(150, 150, 150));
		
		Panel p1 = new Panel();
		p1.add(buttonList[1]);
		p1.setBackground(new Color(150, 100, 150));
		
		Panel p2 = new Panel();
		p2.add(buttonList[2]);
		p2.setBackground(new Color(150, 150, 100));
		
		add("page0", p);
		add("page1", p1);
		add("page2", p2);
		
		int x = 20;
		int y = 70;
		
		//add(BorderLayout.NORTH, buttonList[0]);
		//add(buttonList[0]);
		//buttonList[0].setLocation(x = x + 80, y);
		//buttonList[0].setSize(60, 20);
		
		//add(BorderLayout.CENTER, buttonList[1]);
		//buttonList[1].setLocation(x = x + 80, y);
		//buttonList[1].setSize(60, 20);
		
		//add(BorderLayout.EAST, buttonList[2]);
		//buttonList[2].setLocation(x = x + 80, y);
		//buttonList[2].setSize(60, 20);
		
			
		buttonList[2].setLabel("Exit");
		
		
		setVisible(true);
		
		//pack();
	}
	
	public static void main(String[] args) {
		CardLayoutDemo boutonDemo = new CardLayoutDemo();
		for (int i = 0; i < boutonDemo.buttonList.length; i++) {
			boutonDemo.buttonList[i].addActionListener(boutonDemo);
		}
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		g.setFont(new Font(fonts[fontNext++ % fonts.length], Font.PLAIN, 18));
		g.drawString(msg, 20, 250);
		System.out.println(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonList[2]) System.exit(0);
		else if (e.getSource() == buttonList[0]) {
			msg = "pressed " + buttonList[0].getLabel();
			if (buttonList[0].getLabel() == "Yes") {
				buttonList[0].setLabel("No");
			}
			else {
				buttonList[0].setLabel("Yes");
				((CardLayout)getLayout()).next(this);
			}
		}
		else if (e.getSource() == buttonList[1]) {
			msg = "pressed " + buttonList[1].getLabel();
			if (buttonList[1].getLabel() == "Go") buttonList[1].setLabel("Stop");
			else {
				buttonList[1].setLabel("Go");
				((CardLayout)getLayout()).next(this);
			}
		}
		repaint();
	}
	
	@Override
	public Insets getInsets() {
		Insets normal = super.getInsets();
		return new Insets(normal.top + 100, normal.left + 100, normal.bottom + 100, normal.right + 100);
	}
}
