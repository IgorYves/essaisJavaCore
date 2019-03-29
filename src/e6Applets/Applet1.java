package e6Applets;

import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="Applet1" width=300 height=40>
</applet>
 */

public class Applet1 extends Applet {

	@Override
	public void paint(Graphics g) {
		g.drawString("simple applet", 20, 20);
	}

}
