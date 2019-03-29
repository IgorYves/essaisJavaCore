package b1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class BoutonLam extends Frame {

	public static void main(String[] args) {
		BoutonLam boutonLam = new BoutonLam();
		
	}

	public BoutonLam() throws HeadlessException {
		super();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		setSize(800, 800);
		setTitle("yh apli");
		setBackground(new Color(100, 150, 150));
		setVisible(true);
		
		String[] strArr = {"file", "edit", "source", "refactor", "navigate"};
		
		setLayout(new BorderLayout(20,20));
		int x = 20;
		List<Button> buttonList = Arrays.stream(strArr).map(Button::new).collect(Collectors.toList());
		buttonList.stream().forEach((b) -> {add(b); b.setLocation(100, 100);});
		Iterator<Button> iterator = buttonList.stream().iterator();
		while (iterator.hasNext()) {iterator.next().setLocation(x+=80, 80);}
		
		buttonList.stream().forEach((b) -> {add(b); b.setSize(60, 20);});
		
		buttonList.stream().forEach((a)->{System.out.printf("%s \n", a);});
		
		System.out.println(buttonList.size());
		
	}

}
