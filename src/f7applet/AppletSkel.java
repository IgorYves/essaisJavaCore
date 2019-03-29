package f7applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*
 <applet code="Sample" width=400 height=200>
 </applet>
 */

public class AppletSkel extends Applet {
	String msg;
	int i;
	@Override
	public void init() {
		setBackground(Color.lightGray);
		setForeground(Color.blue);
		i = 0;
		msg = "salut " + i++;
	}
	@Override
	public void start() {
		msg += " - salut " + i++;
	}
	@Override
	public void stop() {
		
	}
	@Override
	public void destroy() {
		
	}
	@Override
	public void paint(Graphics g) {
		msg += " - salut " + i++;
		g.drawString(msg, 10, 30);
	}
}
