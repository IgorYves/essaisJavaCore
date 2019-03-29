package h2AWT2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppliWindow1 extends Frame {
	
	public AppliWindow1() {
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
		
		
		AppliWindow1 appliWindow = new AppliWindow1();
		appliWindow.setSize(800, 800);
		appliWindow.setTitle("yh apli");
		appliWindow.setVisible(true);
		Font font = new Font("Verdana", Font.PLAIN, 18);
		appliWindow.setFont(font);
		appliWindow.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		Label l1 = new Label("one");
		Label l2 = new Label("two");
		Label l3 = new Label("three");
		appliWindow.add(l1);
		appliWindow.add(l2);
		appliWindow.add(l3);
		
		Button b1 = new Button("but one");
		Button b2 = new Button("but two");
		Button b3 = new Button("but three");
		appliWindow.add(b1);
		appliWindow.add(b2);
		appliWindow.add(b3);
		
		
	}
	
	
	
	
	
}
