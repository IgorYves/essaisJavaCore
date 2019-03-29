package f8events;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InnerCl extends Applet {
	@Override
	public void init() {
		addMouseListener(new YHmouseAdapter());
	}
	class YHmouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			showStatus("mouse pressed");
		}
	}
}
