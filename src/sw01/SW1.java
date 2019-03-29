package sw01;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SW1 {

	public static void main(String[] args) {
		
		JPanel contenu = new JPanel();
		
		//FlowLayout disposition = new FlowLayout();
		//GridLayout disposition = new GridLayout(4, 2);
		//GridLayout disposition = new GridLayout(4, 2, 10, 10);
		//BoxLayout disposition = new BoxLayout(contenu, BoxLayout.Y_AXIS);
		//BorderLayout disposition = new BorderLayout();
		//CardLayout disposition = new CardLayout();
		GridBagLayout disposition = new GridBagLayout();
		//SpringLayout disposition = new SpringLayout();
		contenu.setLayout(disposition);
		
		JLabel label1 = new JLabel("num1 : ");
		JTextField entr1 = new JTextField(10);
		JLabel label2 = new JLabel("num2 : ");
		JTextField entr2 = new JTextField(10);
		JLabel label3 = new JLabel("sum : ");
		JTextField result = new JTextField(10);
		JButton go = new JButton("Calculer");
		
		
		
		contenu.add(label1);
		contenu.add(entr1);
		contenu.add(label2);
		contenu.add(entr2);
		contenu.add(label3);
		contenu.add(result);
		contenu.add(go);
		
		JFrame cadre = new JFrame("calculatrice");
		cadre.setContentPane(contenu);
		cadre.setSize(700, 300);
		cadre.setVisible(true);
		
		
	}

}
