package f8events;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Adaptr extends Applet {
	@Override
	public void init() {
		addMouseListener(new MseAdapt(this));
		addMouseMotionListener(new MseMtnAdapt(this));
	}
}

class MseAdapt extends MouseAdapter {
	Adaptr adptr;
	public MseAdapt(Adaptr adptr) {
		this.adptr = adptr;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		adptr.showStatus("clicked");
	}
}

class MseMtnAdapt extends MouseMotionAdapter {
	Adaptr adptr;
	public MseMtnAdapt(Adaptr adptr) {
		this.adptr = adptr;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		adptr.showStatus("dragged");
	}
}