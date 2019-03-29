package h2AWT2;

import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuDemo extends Frame {
	
	public static void main(String[] args) {
		Frame f = new MenuFrame("Menu Demo");
		f.setSize(800, 800);
		f.setBackground(new Color(100, 150, 150));
		f.setVisible(true);
	}
}

class MenuFrame	 extends Frame {
	String msg = "";
	CheckboxMenuItem testChkBox;
	MenuFrame(String title) {
		super(title);
		MenuBar menuBar = new MenuBar();
		setMenuBar(menuBar);
		///////////////
		Menu fileMenu = new Menu("File");
		MenuItem mi1f, mi2f, mi3f, mi4f;
		fileMenu.add(mi1f = new MenuItem("New"));
		fileMenu.add(mi2f = new MenuItem("Open"));
		fileMenu.add(mi3f = new MenuItem("Close"));
		fileMenu.add(mi4f = new MenuItem("Exit"));
		menuBar.add(fileMenu);
		///////////////
		Menu editMenu = new Menu("Edit");
		MenuItem mi1e, mi2e, mi3e;
		editMenu.add(mi1e = new MenuItem("Cut"));
		editMenu.add(mi2e = new MenuItem("Copy"));
		editMenu.add(mi3e = new MenuItem("Past"));
		testChkBox = new CheckboxMenuItem("Test");
		editMenu.add(testChkBox);
		menuBar.add(editMenu);
		///////////////
		Menu specialMenu = new Menu("Special");
		MenuItem mi1s, mi2s, mi3s, mi4s;
		specialMenu.add(mi1s = new MenuItem("Special 1"));
		specialMenu.add(mi2s = new MenuItem("Special 2"));
		specialMenu.add(mi3s = new MenuItem("Press"));
		specialMenu.add(mi4s = new MenuItem("Press me"));
		editMenu.add(specialMenu);
		/////////////////
		
		MenuHandlr handler = new MenuHandlr(this);
		mi1f.addActionListener(handler);
		mi2f.addActionListener(handler);
		mi3f.addActionListener(handler);
		mi4f.addActionListener(handler);
		mi1e.addActionListener(handler);
		mi2e.addActionListener(handler);
		mi3e.addActionListener(handler);
		mi1s.addActionListener(handler);
		mi2s.addActionListener(handler);
		mi3s.addActionListener(handler);
		mi4s.addActionListener(handler);
		testChkBox.addItemListener(handler);
		
		addWindowListener(new WindAdapter(this));
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		update(g);
		if (isLightweight()) super.paint(g);
	}
	
	@Override
	public void update(Graphics g) {
		FontMetrics fm = g.getFontMetrics();
		g.setColor(getBackground());
		g.fillRect(0, 0, this.getSize().width, this.getSize().height );
		g.setColor(getForeground());
		int x = 20;
		int y = 250;
		Font font = new Font("Verdana", Font.PLAIN, 18);
		g.setFont(font);
		g.drawString("msg : " + msg, x, y);
		System.out.println(msg);
		if (testChkBox.getState()) g.drawString("Test mode is ON", x, y + 10 + fm.getHeight());
	}
}	

class MenuHandlr implements ActionListener, ItemListener {
	MenuFrame menuFrame;
	public MenuHandlr(MenuFrame menuFrame) {
		this.menuFrame = menuFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = "Vous avez chosi : " + e.getActionCommand();
		if (e.getActionCommand() == "Press me") {
			OneDialog d = new OneDialog(menuFrame, "ceci est un dialog box", true);
			d.setVisible(true);
		}
		else if (e.getActionCommand() == "Press") {
			OneDialog d = new OneDialog(menuFrame, "ceci est un dialog box", false);
			d.setVisible(true);
		}
		else if (e.getActionCommand() == "Open") {
			FileDialog fd = new FileDialog(menuFrame, "ceci est un FileDialog");
			fd.setVisible(true);
			if (fd.getFile() != null) {
				msg = "Vous avez chosi : " + fd.getFile() + " dans " + fd.getDirectory();
			}
			else msg = "Vous n'avez rien chosi";
		}
		menuFrame.msg = msg;
		menuFrame.repaint();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		menuFrame.repaint();
	}
}

class WindAdapter extends WindowAdapter {
	MenuFrame menuFrame;
	public WindAdapter(MenuFrame menuFrame) {
		this.menuFrame = menuFrame;
	}
	@Override
	public void windowClosing(WindowEvent e) {
		menuFrame.setVisible(false);
	}
}

class OneDialog extends Dialog implements ActionListener {
	OneDialog(Frame parent, String title, boolean isModal) {
		super(parent, title, isModal);
		setLayout(new FlowLayout());
		setSize(300, 200);
		add(new Label("press button : "));
		Button b;
		add(b = new Button("Sortir"));
		b.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}

	@Override
	public void paint(Graphics g) {
		g.drawString("OneDialog dialog box", 10, 70);
	}
}
