package sw01;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


public class PopupMenuDemo  {
    JTextArea jTextArea;
    JScrollPane scrollPane;
    JPopupMenu jPopupMenu;
   

    public Container createContentPane() {
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        //Create a scrolled text area.
        jTextArea = new JTextArea(5, 30);
        jTextArea.setEditable(false);
        scrollPane = new JScrollPane(jTextArea);

        //Add the text area to the content pane.
        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;
    }

    public void createPopupMenu() {
        JMenuItem menuItem;

        //Create the jPopupMenu menu.
        jPopupMenu = new JPopupMenu();
        menuItem = new JMenuItem("A jPopupMenu menu item");
        jPopupMenu.add(menuItem);
        menuItem = new JMenuItem("Another jPopupMenu menu item");
        jPopupMenu.add(menuItem);

        jTextArea.addMouseListener(new MouseAdapter() {
            @Override
    		public void mousePressed(MouseEvent e) {
            	System.out.println(e.isPopupTrigger());
				if (e.isPopupTrigger()) {
                     jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
                 }
            }
            @Override
    		public void mouseReleased(MouseEvent e) {
            	System.out.println(e.isPopupTrigger());
				if (e.isPopupTrigger()) {
                     jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
                 }
            }
        });
    }

   

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame jFrame = new JFrame("PopupMenuDemo");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create/set menu bar and content pane.
        PopupMenuDemo demo = new PopupMenuDemo();
        jFrame.setContentPane(demo.createContentPane());

        //Create and set up the jPopupMenu menu.
        demo.createPopupMenu();

        //Display the window.
        jFrame.setSize(450, 260);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
			public void run() {
                createAndShowGUI();
            }
        });
    }
}
