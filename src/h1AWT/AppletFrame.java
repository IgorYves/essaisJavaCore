package h1AWT;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppletFrame extends Applet {
	Frame f;
	
	@Override
	public void init() {
		f = new YFrame("frame window");
		f.setSize(250, 250);
		f.setVisible(true);
	}
	
	@Override
	public void start() {f.setVisible(true);}
	@Override
	public void stop() {f.setVisible(false);}
	
	@Override
	public void paint(Graphics g) {g.drawString("applet window", 10, 20);}

	class YFrame extends Frame {
		
		public YFrame(String title) {
			super(title);
			YWindowAdapter adapter = new YWindowAdapter(this);
			addWindowListener(adapter);
		}
		
		@Override
		public void paint(Graphics g) {g.drawString("y frame window", 10, 40);}
	}
	
	class YWindowAdapter extends WindowAdapter {
		YFrame yFrame;
		
		public YWindowAdapter(YFrame yFrame) {this.yFrame = yFrame;}
		
		@Override
		public void windowClosing(WindowEvent e) {yFrame.setVisible(false);}
	}
}
