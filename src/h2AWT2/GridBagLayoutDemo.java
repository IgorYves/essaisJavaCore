package h2AWT2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridBagLayoutDemo extends Frame implements ActionListener {
	String msg = "";
	Button[] buttonList = {new Button("Yes"), 
							new Button("Go"), 
							new Button("Close"),
							new Button("Bouton3"),
							new Button("Bouton4"),
							new Button("Bouton5"),
							new Button("Bouton6")};
	Button yes;
	Button no;
	Button maybe;
	String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	int fontNext = 0;
	
	public GridBagLayoutDemo() {
		super();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		setSize(800, 800);
		setTitle("igor's aplication pour tester GridBagLayout");
		setBackground(new Color(100, 150, 150));
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		setLayout(gridBagLayout);
		
		gridBagConstraints.fill = GridBagConstraints.VERTICAL;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.ipadx = 100;
		gridBagConstraints.insets = new Insets(10, 10, 0, 0);
		//gridBagConstraints.anchor = GridBagConstraints.NORTHEAST;
		
		///////////////////////////////////
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(buttonList[0], gridBagConstraints);
		add(buttonList[0]);
		
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = GridBagConstraints.EAST;
		gridBagLayout.setConstraints(buttonList[1], gridBagConstraints);
		add(buttonList[1]);
		
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 1;
		//gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.anchor = GridBagConstraints.EAST;
		gridBagLayout.setConstraints(buttonList[2], gridBagConstraints);
		add(buttonList[2]);
		////////////////////////////////
		
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.gridheight = 1;
		gridBagConstraints.anchor = GridBagConstraints.EAST;
		//gridBagConstraints.weightx = 1.0;
		gridBagLayout.setConstraints(buttonList[3], gridBagConstraints);
		add(buttonList[3]);
		///////////////////////////////
		
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		//gridBagConstraints.weightx = 1.0;
		gridBagLayout.setConstraints(buttonList[4], gridBagConstraints);
		add(buttonList[4]);
		
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 3;
		//gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagConstraints.anchor = GridBagConstraints.EAST;
		//gridBagConstraints.weightx = 0.0;
		gridBagLayout.setConstraints(buttonList[5], gridBagConstraints);
		add(buttonList[5]);
		
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 3;
		//gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagConstraints.anchor = GridBagConstraints.EAST;
		//gridBagConstraints.weightx = 1.0;
		gridBagLayout.setConstraints(buttonList[6], gridBagConstraints);
		add(buttonList[6]);
		////////////////////////////////
		
			
		buttonList[2].setLabel("Exit");
		
		
		setVisible(true);
		
		//pack();
	}
	
	public static void main(String[] args) {
		GridBagLayoutDemo boutonDemo = new GridBagLayoutDemo();
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
			else {buttonList[0].setLabel("Yes");}
		}
		else if (e.getSource() == buttonList[1]) {
			msg = "pressed " + buttonList[1].getLabel();
			if (buttonList[1].getLabel() == "Go") buttonList[1].setLabel("Stop");
			else {buttonList[1].setLabel("Go");}
		}
		repaint();
	}
	
	@Override
	public Insets getInsets() {
		Insets normal = super.getInsets();
		return new Insets(normal.top + 100, normal.left + 100, normal.bottom + 100, normal.right + 100);
	}
}
