package sw01;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.tree.DefaultMutableTreeNode;


class HYJPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		this.setBackground(new Color(100, 150, 150));
		this.setVisible(true);
		this.setOpaque(true);
		
		graphics.setColor(new Color(100, 160, 160));
		graphics.setFont(new Font("Ariel",Font.PLAIN,500));
		((Graphics2D) graphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		((Graphics2D) graphics).setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f ));
		graphics.drawString("AFPA", 50, this.getHeight()/2+200);
		((Graphics2D) graphics).setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f ));
	}
}

public class HYFenetre extends JFrame {
	JLabel jLabel11;
	JToggleButton jToggleButton;
	JCheckBox jCheckBox4;
	JPopupMenu jPopupMenu;
	
////////////////////////////////////////////////////////
	public HYFenetre() throws HeadlessException {
		try {
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			UIManager.setLookAndFeel(new MetalLookAndFeel());
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setDefaultLookAndFeelDecorated(true);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(dimension.width - 400, 800);
		//this.setLocation(dimension.width/2 - this.getWidth()/2, dimension.height/2 - this.getHeight()/2);
		this.setLocationRelativeTo(null);
		this.setTitle("YH swing application");
		this.setResizable(true);
		this.setAlwaysOnTop(false);
		this.setUndecorated(false);
		//this.setBackground(new Color(0, 150, 150));
		this.setIconImage(new ImageIcon("imgs/useradd.png").getImage());
		this.setForeground(new Color(200, 50, 50));
		this.setVisible(true);
		//this.pack();
		
		
		
///////////////////////////////////////////////////////////////////
		
		HYJPanel jPanel = new HYJPanel();
		
////////////////////////////////////////////////////////////////////
		
		JMenuBar jMenuBar = new JMenuBar();
		
		JMenu jMFile = new JMenu("File");
			jMFile.setMnemonic(KeyEvent.VK_F);
			
			JMenuItem jMFileNew = new JMenuItem("New", new ImageIcon("imgs/file.png"));
				jMFileNew.setMnemonic(KeyEvent.VK_N);
				jMFileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				jMFileNew.addActionListener((actionEvent)-> 
										{jLabel11.setText(actionEvent.getActionCommand());repaint();});
			jMFile.add(jMFileNew);
				
			JMenuItem jMFileOpen = new JMenuItem("Open", KeyEvent.VK_O);
				jMFileOpen.setIcon(new ImageIcon("imgs/reglages.png"));
				jMFileOpen.setToolTipText("ouvrir fichier existant");
			jMFile.add(jMFileOpen);
				
			JMenuItem jMFileClose = new JMenuItem("Close", KeyEvent.VK_C);
			jMFile.add(jMFileClose);
			
			jMFile.addSeparator();
			
			JMenuItem jMFileSave = new JMenuItem("Save", KeyEvent.VK_S);
			jMFile.add(jMFileSave);
				
			JMenuItem jMFileSaveAs = new JMenuItem("SaveAs");
				jMFileSaveAs.setToolTipText("Save avec autre nom de fichier");
			jMFile.add(jMFileSaveAs);
				
			jMFile.addSeparator();
			
			JMenuItem jMFileQuit = new JMenuItem("Quit", KeyEvent.VK_Q);
				jMFileQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
				jMFileQuit.addActionListener((actionEvent)-> {System.exit(0);});
			jMFile.add(jMFileQuit);
				
		jMenuBar.add(jMFile);
		
		JMenu jMEdit = new JMenu("Edit");
			jMEdit.setMnemonic(KeyEvent.VK_E);
			
			JMenu jMEditOptions = new JMenu("Options");
				jMEditOptions.setMnemonic(KeyEvent.VK_O);
				
				JMenu jMEditOptionsColors = new JMenu("Colors");
					jMEditOptionsColors.setMnemonic(KeyEvent.VK_C);
				
					JMenuItem jMEditOptionsColorsRed = new JMenuItem("Red", KeyEvent.VK_R);
						jMEditOptionsColorsRed.setAccelerator(
												KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
						jMEditOptionsColorsRed.addActionListener((actionEvent)-> 
												{jLabel11.setText(actionEvent.getActionCommand());repaint();});
					jMEditOptionsColors.add(jMEditOptionsColorsRed);
					
					JMenuItem jMEditOptionsColorsBlue = new JMenuItem("Blue", KeyEvent.VK_B);
						jMEditOptionsColorsBlue.setAccelerator(
												KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
						jMEditOptionsColorsBlue.addActionListener((actionEvent)-> 
													{jLabel11.setText(actionEvent.getActionCommand());repaint();});
					jMEditOptionsColors.add(jMEditOptionsColorsBlue);
			
				jMEditOptions.add(jMEditOptionsColors);
			
				JMenu jMEditOptionsPriority = new JMenu("Priority");
					jMEditOptionsPriority.setMnemonic(KeyEvent.VK_P);
				
					JMenuItem jMEditOptionsPriorityHigh = new JMenuItem("High", KeyEvent.VK_H);
						jMEditOptionsPriorityHigh.addActionListener((actionEvent)-> 
													{jLabel11.setText(actionEvent.getActionCommand());repaint();});
					jMEditOptionsPriority.add(jMEditOptionsPriorityHigh);
					
					JMenuItem jMEditOptionsPriorityLow = new JMenuItem("Low", KeyEvent.VK_L);
						jMEditOptionsPriorityLow.addActionListener((actionEvent)-> 
													{jLabel11.setText(actionEvent.getActionCommand());repaint();});
					jMEditOptionsPriority.add(jMEditOptionsPriorityLow);
					
				jMEditOptions.add(jMEditOptionsPriority);
			jMEdit.add(jMEditOptions);
			
			JMenuItem jMEdit2 = new JMenuItem("Edit2");
			jMEdit2.setEnabled(false);
			jMEdit.add(jMEdit2);
			
		jMenuBar.add(jMEdit);
		
		JMenu jMAffichage = new JMenu("Affichage");
			jMAffichage.setMnemonic(KeyEvent.VK_A);
			
			JCheckBoxMenuItem  JCBMAffichageOption1 = new JCheckBoxMenuItem("Option1");
			jMAffichage.add(JCBMAffichageOption1);
			
			jMAffichage.addSeparator();
			JCheckBoxMenuItem  JCBMAffichageOption2 = new JCheckBoxMenuItem("Option2", true);
			jMAffichage.add(JCBMAffichageOption2);
			
			jMAffichage.addSeparator();
			JCheckBoxMenuItem  JCBMAffichageOption3 = new JCheckBoxMenuItem("Option3");
				JCBMAffichageOption3.setSelected(true);
			jMAffichage.add(JCBMAffichageOption3);
			
			jMAffichage.addSeparator();
			JRadioButtonMenuItem JRMAffichageOption4 = new JRadioButtonMenuItem("Option4");
				JRMAffichageOption4.setSelected(true);
			jMAffichage.add(JRMAffichageOption4);
			
			jMAffichage.addSeparator();
			JRadioButtonMenuItem JRMAffichageOption5 = new JRadioButtonMenuItem("Option5", true);
			jMAffichage.add(JRMAffichageOption5);
			
			JRadioButtonMenuItem JRMAffichageOption6 = new JRadioButtonMenuItem("Option6");
			jMAffichage.add(JRMAffichageOption6);
			
			JRadioButtonMenuItem JRMAffichageOption7 = new JRadioButtonMenuItem("Option7");
			jMAffichage.add(JRMAffichageOption7);
			
			ButtonGroup bGroup1 = new ButtonGroup();
			bGroup1.add(JRMAffichageOption5);
			bGroup1.add(JRMAffichageOption6);
			bGroup1.add(JRMAffichageOption7);
			
			
		jMenuBar.add(jMAffichage);
		
		JMenu jMOutils = new JMenu("Outils");
			jMOutils.setMnemonic(KeyEvent.VK_O);
		jMenuBar.add(jMOutils);
		
		JMenu jMWindow = new JMenu("Window");
			jMWindow.setMnemonic(KeyEvent.VK_W);
		jMenuBar.add(jMWindow);
		
		JMenu jMHelp = new JMenu("Help");
			jMHelp.setMnemonic(KeyEvent.VK_H);
			JMenuItem jMHelpTopics = new JMenuItem("Help Topics");
				jMHelpTopics.addActionListener((actionEvent)-> {jLabel11.setText(actionEvent.getActionCommand());repaint();});
				jMHelp.add(jMHelpTopics);
			
			JMenuItem jMHelpAbout = new JMenuItem("About");
				jMHelpAbout.addActionListener((actionEvent)-> {jLabel11.setText(actionEvent.getActionCommand());repaint();});
				jMHelp.add(jMHelpAbout);
		
		jMenuBar.add(jMHelp);
		
		
		
		this.setJMenuBar(jMenuBar);
		
		
		
////////////////////////////////////////////////////////////////////
		
		JScrollPane jScrollPane = new JScrollPane(jPanel);
		jScrollPane.setOpaque(false);
		this.add(jScrollPane, BorderLayout.CENTER);
		this.setContentPane(jScrollPane);
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		jPanel.setLayout(gridBagLayout);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.ipadx = 100;
		gridBagConstraints.insets = new Insets(10, 10, 10, 10);
		//gridBagConstraints.anchor = GridBagConstraints.NORTHEAST;
		
///////////////////////////////////////////////////////////////////
		
		jPopupMenu = new JPopupMenu("Edit");
		
		JMenuItem jMCopy = new JMenuItem("Copy");
			//jMCopy.addActionListener(this);
		jPopupMenu.add(jMCopy);
		JMenuItem jMCut = new JMenuItem("Cut");
			//jMCut.addActionListener(this);
		jPopupMenu.add(jMCut);
		JMenuItem jMPaste = new JMenuItem("Paste");
			//jMPaste.addActionListener(this);
		jPopupMenu.add(jMPaste);
		
		jPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent mEvent) {
				if (mEvent.isPopupTrigger())
					jPopupMenu.show(mEvent.getComponent(), mEvent.getX(), mEvent.getY());
			}
			public void mouseReleassed(MouseEvent mEvent) {
				if (mEvent.isPopupTrigger())
					jPopupMenu.show(mEvent.getComponent(), mEvent.getX(), mEvent.getY());
			}
		});
		
		
//////////////////////////////////////////
		JToolBar jToolBar = new JToolBar("HY Tools", JToolBar.HORIZONTAL);
		JButton jBSet = new JButton("Set");
		jToolBar.add(jBSet);
		JButton jBClear = new JButton("Clear");
		jToolBar.add(jBClear);
		JButton jBResume = new JButton("Resume");
		jToolBar.add(jBResume);

		//jPanel.add(jToolBar);

///////////////////////////////////////////
		JPanel jPanelInt1 = new JPanel();
		jPanelInt1.setBackground(new Color(80, 180, 150));
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(jPanelInt1, gridBagConstraints);
		jPanel.add(jPanelInt1);
		
		JLabel jLabel1 = new JLabel("jLabel1");
		jLabel1.setBackground(Color.blue);
		jPanelInt1.add(jLabel1);
		 
		JLabel jLabel2 = new JLabel("jLabel2");
		jLabel2.setBackground(Color.red);
		jLabel2.setOpaque(true);
		jPanelInt1.add(jLabel2);
		
///////////////////////////////////////////
		JPanel jPanelInt2 = new JPanel();
		jPanelInt2.setBackground(new Color(130, 150, 150));
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(jPanelInt2, gridBagConstraints);
		jPanel.add(jPanelInt2);
		
		JButton bouton = new JButton("bouton");
		jPanelInt2.add(bouton);
		JButton bouton2 = new JButton("bouton2");
		jPanelInt2.add(bouton2);
		this.getRootPane().setDefaultButton(bouton2);
		
///////////////////////////////////////////
		JPanel jPanelInt3 = new JPanel();
		jPanelInt3.setBackground(new Color(160, 150, 150));
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = GridBagConstraints.EAST;
		gridBagLayout.setConstraints(jPanelInt3, gridBagConstraints);
		jPanel.add(jPanelInt3);
		
		JTextField jTextField = new JTextField("<Alt> + <n> to focus", 15);
		JLabel jLabel3 = new JLabel("Nom : ");
		jLabel3.setBackground(Color.green);
		jLabel3.setDisplayedMnemonic('n');
		jLabel3.setLabelFor(jTextField);
		jPanelInt3.add(jLabel3);
		jPanelInt3.add(jTextField);
		
///////////////////////////////////////////
		JPanel jPanelInt4 = new JPanel();
		jPanelInt4.setBackground(new Color(200, 150, 150));
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(jPanelInt4, gridBagConstraints);
		jPanel.add(jPanelInt4);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		JRadioButton jRadioButton1 = new JRadioButton("JRadioButton 1");
		jRadioButton1.addActionListener((actionEvent)-> {jLabel11.setText(actionEvent.getActionCommand());repaint();});
		buttonGroup.add(jRadioButton1);
		jPanelInt4.add(jRadioButton1);
		JRadioButton jRadioButton2 = new JRadioButton("JRadioButton 2");
		jRadioButton2.addActionListener((actionEvent)-> {jLabel11.setText(actionEvent.getActionCommand());repaint();});
		buttonGroup.add(jRadioButton2);
		jPanelInt4.add(jRadioButton2);
		JRadioButton jRadioButton3 = new JRadioButton("JRadioButton 3");
		jRadioButton3.addItemListener((itemEvent)-> 
					{if (itemEvent.getStateChange()==ItemEvent.SELECTED)jLabel11.setText("jRadioButton2 selected");
					else if (itemEvent.getStateChange()==ItemEvent.DESELECTED)jLabel11.setText("jRadioButton2 deselected");
					repaint();});
		//buttonGroup.add(jRadioButton3);
		jPanelInt4.add(jRadioButton3);
		
///////////////////////////////////////////
		JPanel jPanelInt5 = new JPanel();
		jPanelInt5.setBackground(new Color(230, 150, 150));
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(jPanelInt5, gridBagConstraints);
		jPanel.add(jPanelInt5);
		
		ButtonGroup buttonGroup2 = new ButtonGroup();
		JCheckBox  jCheckBox1 = new JCheckBox("jCheckBox1");
		buttonGroup2.add(jCheckBox1);
		jPanelInt5.add(jCheckBox1);
		JCheckBox jCheckBox2 = new JCheckBox("jCheckBox2");
		buttonGroup2.add(jCheckBox2);
		jPanelInt5.add(jCheckBox2);
		JCheckBox jCheckBox3 = new JCheckBox("jCheckBox3", true);
		jPanelInt5.add(jCheckBox3);
		jCheckBox4 = new JCheckBox("jCheckBox4", new ImageIcon("imgs/standby.png"));
		jCheckBox4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent itemEvent) {
				if (((JCheckBox) itemEvent.getItem()).isSelected())
						((JCheckBox) itemEvent.getItem()).setIcon(new ImageIcon("imgs/off.png"));
				else ((JCheckBox) itemEvent.getItem()).setIcon(new ImageIcon("imgs/standby.png"));
			}
		});
		jPanelInt5.add(jCheckBox4);
		
////////////////////////////////////////
		JPanel jPanelInt6 = new JPanel();
		jPanelInt6.setBackground(new Color(255, 150, 150));
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = GridBagConstraints.EAST;
		gridBagLayout.setConstraints(jPanelInt6, gridBagConstraints);
		jPanel.add(jPanelInt6);
		
		JLabel jLabel5 = new JLabel();
		ImageIcon jmageIcon = new ImageIcon("imgs/accept.png");
		jLabel5.setIcon(jmageIcon);
		jLabel5.setText("bla bla");
		jLabel5.setBackground(new Color(50, 180, 200));
		jLabel5.setOpaque(true);
		jPanelInt6.add(jLabel5);

		JLabel jLabel6 = new JLabel("tra tra", new ImageIcon("imgs/standby.png"), JLabel.RIGHT);
		jLabel6.setBackground(new Color(150, 180, 200));
		jLabel6.setOpaque(true);
		jPanelInt6.add(jLabel6);
		
		JLabel jLabel7 = new JLabel("la la ala la la la");
		jLabel7.setBackground(new Color(150, 180, 180));
		jLabel7.setOpaque(true);
		jPanelInt6.add(jLabel7);

////////////////////////////////////////
		JPanel jPanelInt7 = new JPanel();
			jPanelInt7.setBackground(new Color(200, 200, 150));
			gridBagConstraints.gridx = 1;
			gridBagConstraints.gridy = 3;
			gridBagConstraints.gridwidth = 3;
			gridBagConstraints.anchor = GridBagConstraints.WEST;
			gridBagLayout.setConstraints(jPanelInt7, gridBagConstraints);
		jPanel.add(jPanelInt7);

		JButton bouton3 = new JButton();
			bouton3.setText("bouton3");
			bouton3.setIcon(new ImageIcon("imgs/useradd.png"));
			bouton3.setDisabledIcon(new ImageIcon("imgs/off.png"));
			bouton3.setPressedIcon(new ImageIcon("imgs/standby.png"));
			bouton3.setSelectedIcon(new ImageIcon("imgs/plus.png"));
			bouton3.setRolloverIcon(new ImageIcon("imgs/addfile.png"));
		jPanelInt7.add(bouton3);
		
		JButton bouton4 = new JButton("bouton4", new ImageIcon("imgs/accept.png"));
			bouton4.setActionCommand("bouton4 pressed");
			bouton4.addActionListener((actionEvent)-> {jLabel11.setText(actionEvent.getActionCommand());repaint();});
		jPanelInt7.add(bouton4);
		
		jToggleButton = new JToggleButton("JToggleButton", new ImageIcon("imgs/plus.png"));
			jToggleButton.setToolTipText("press to toggle");
			jToggleButton.setSelectedIcon(new ImageIcon("imgs/off.png"));
			jToggleButton.addActionListener((actionEvent)-> 
							{jLabel11.setText(jToggleButton.isSelected()?"jToggleButton is ON":"OFF");
																									repaint();});
		jPanelInt7.add(jToggleButton);
		
////////////////////////////////////////
		JPanel jPanelInt8 = new JPanel();
			jPanelInt8.setBackground(new Color(200, 200, 200));
			gridBagConstraints.gridx = 1;
			gridBagConstraints.gridy = 4;
			gridBagConstraints.gridwidth = 2;
			gridBagConstraints.anchor = GridBagConstraints.WEST;
			gridBagLayout.setConstraints(jPanelInt8, gridBagConstraints);
		jPanel.add(jPanelInt8);
		
		jLabel11 = new JLabel("jLabel11");
			jLabel11.setFont(new Font("Ariel",Font.PLAIN,20));
			jLabel11.setOpaque(true);
		jPanelInt8.setSize(250, 100);
		jPanelInt8.add(jLabel11);
		
		jLabel11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent mEvent) {
				System.out.println(mEvent.isPopupTrigger());
				if (mEvent.isPopupTrigger())
					jPopupMenu.show(mEvent.getComponent(), mEvent.getX(), mEvent.getY());
			}
			public void mouseReleassed(MouseEvent mEvent) {
				System.out.println(mEvent.isPopupTrigger());
				if (mEvent.isPopupTrigger())
					jPopupMenu.show(mEvent.getComponent(), mEvent.getX(), mEvent.getY());
			}
		});
		
////////////////////////////////////////
		JPanel jPanelInt81 = new JPanel();
		jPanelInt81.setBackground(new Color(200, 100, 200));
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(jPanelInt81, gridBagConstraints);
		jPanel.add(jPanelInt81);
		
		JLabel jLabel13 = new JLabel("jLabel13 Comic Sans MS jLabel13 jLabel13");
		jLabel13.setFont(new Font("Comic Sans MS",Font.ITALIC,16));
		jLabel13.setOpaque(true);
		jPanelInt81.add(jLabel13);

////////////////////////////////////////
		JPanel jPanelInt9 = new JPanel();
		jPanelInt9.setBackground(new Color(200, 200, 100));
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(jPanelInt9, gridBagConstraints);
		jPanel.add(jPanelInt9);
		
		JTabbedPane jTabbedPane = new JTabbedPane();
		JPanel jPanelTabbedPane1 = new JPanel();
		jPanelTabbedPane1.add(new JButton("bouton1 de jPanelTabbedPane1"));
		jPanelTabbedPane1.add(new JButton("bouton2 de jPanelTabbedPane1"));
		jPanelTabbedPane1.add(new JButton("bouton3 de jPanelTabbedPane1"));
		jTabbedPane.add("first", jPanelTabbedPane1);
		
		JPanel jPanelTabbedPane2 = new JPanel();
		jPanelTabbedPane2.add(new JButton("jPanelTabbedPane2 - 1"));
		jPanelTabbedPane2.add(new JButton("jPanelTabbedPane2 - 2"));
		jPanelTabbedPane2.add(new JButton("jPanelTabbedPane2 - 3"));
		jTabbedPane.add("second", jPanelTabbedPane2);
		
		JPanel jPanelTabbedPane3 = new JPanel();
		jPanelTabbedPane3.add(new JButton("bouton1"));
		jPanelTabbedPane3.add(new JButton("bouton2"));
		jPanelTabbedPane3.add(new JButton("bouton3"));
		jTabbedPane.add("third", jPanelTabbedPane3);
		
		jPanelInt9.add(jTabbedPane);
		
/////////////////////////////////////////
		JPanel jPanelInt10 = new JPanel();
		jPanelInt10.setBackground(new Color(200, 100, 100));
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(jPanelInt10, gridBagConstraints);
		jPanel.add(jPanelInt10);
		
		JComboBox<String> jComboBox1 = new JComboBox<>();
		jComboBox1.addItem("Primo");
		jComboBox1.addItem("Secundo");
		jComboBox1.addItem("Tertio");
		jComboBox1.addItem("Quarto");
		jPanelInt10.add(jComboBox1);
		
/////////////////////////////////////////
		JPanel jPanelInt11 = new JPanel();
		jPanelInt11.setBackground(new Color(200, 150, 100));
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(jPanelInt11, gridBagConstraints);
		jPanel.add(jPanelInt11);
		
		JTextArea textArea = new JTextArea("entrez votre text ici", 5, 30);
		jPanelInt11.add(textArea);


/////////////////////////////////////////
		JPanel jPanelInt12 = new JPanel();
		jPanelInt12.setBackground(new Color(200, 100, 150));
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(jPanelInt12, gridBagConstraints);
		jPanel.add(jPanelInt12);
		
		String[] jListElemts = {"element 1", "bla bla bla", "lorem ispum", "dolor sit amet",
									"elem bla", "elem lorem"};
		JList<String> jList = new JList<>(jListElemts);
		jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane jScrollPaneInt12 = new JScrollPane(jList);
		jScrollPaneInt12.setPreferredSize(new Dimension(120, 90));
		JLabel jLabelInt12 = new JLabel("Faites votre choix : ");
		jPanelInt12.add(jLabelInt12);
		jPanelInt12.add(jScrollPaneInt12);
		
//////////////////////////////////////////////////////
		JPanel jPanelInt13 = new JPanel();
		jPanelInt13.setBackground(new Color(200, 150, 150));
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 7;
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(jPanelInt13, gridBagConstraints);
		jPanel.add(jPanelInt13);
		
		//tree
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
		
		DefaultMutableTreeNode level1son1 = new DefaultMutableTreeNode("level1son1");
		root.add(level1son1);
		DefaultMutableTreeNode level2son1 = new DefaultMutableTreeNode("level2son1");
		level1son1.add(level2son1);
		DefaultMutableTreeNode level2son2 = new DefaultMutableTreeNode("level2son2");
		level1son1.add(level2son2);
		DefaultMutableTreeNode level2son3 = new DefaultMutableTreeNode("level2son3");
		level1son1.add(level2son3);
		
		
		DefaultMutableTreeNode level1son2 = new DefaultMutableTreeNode("level1son2");
		root.add(level1son2);
		DefaultMutableTreeNode level2son11 = new DefaultMutableTreeNode("level2son11");
		level1son2.add(level2son11);
		DefaultMutableTreeNode level2son22 = new DefaultMutableTreeNode("level2son22");
		level1son2.add(level2son22);
		DefaultMutableTreeNode level2son33 = new DefaultMutableTreeNode("level2son33");
		level1son2.add(level2son33);
		
		
		DefaultMutableTreeNode level1son3 = new DefaultMutableTreeNode("level1son3");
		root.add(level1son3);
		DefaultMutableTreeNode level2son111 = new DefaultMutableTreeNode("level2son111");
		level1son3.add(level2son111);
		DefaultMutableTreeNode level2son222 = new DefaultMutableTreeNode("level2son222");
		level1son3.add(level2son222);
		
		
		DefaultMutableTreeNode level1son4 = new DefaultMutableTreeNode("level1son4");
		root.add(level1son4);
		DefaultMutableTreeNode level2son1111 = new DefaultMutableTreeNode("level2son1111");
		level1son4.add(level2son1111);
		
		JTree jTree = new JTree(root);
		JScrollPane treeJScrolPane = new JScrollPane(jTree);
		jPanelInt13.add(treeJScrolPane);
		
		jTree.addTreeSelectionListener((e)->{jLabel11.setText("selection : " + e.getPath());repaint();});
		
//////////////////////////////////////////////////////
		JPanel jPanelInt14 = new JPanel();
		jPanelInt14.setBackground(new Color(220, 200, 200));
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 7;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.fill = gridBagConstraints.BOTH;
		//gridBagConstraints.anchor = GridBagConstraints.WEST;
		gridBagLayout.setConstraints(jPanelInt14, gridBagConstraints);
		jPanel.add(jPanelInt14);		
		
		//table
		int cols = 15;
		int rows = 100;
		String[] headers = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", 
							"Nueve", "Diez", "Once", "Doce", "Trece", "Catorce", "Quince"};
		Object[][] data = new Object[rows][cols];
		boolean go;
		int wLength;
		char[] charused = alfabet();
		Random rnd = new Random();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				String word = "";
				go = true;
				do {wLength = rnd.nextInt(20);
					if(wLength > 8) {go = false;};
				} while(go);
				for(int k=0; k<wLength; k++) {
					word += charused[rnd.nextInt(charused.length)];
				};
				data[i][j] = word;
			}
		}
		
//		JTable jTable = new JTable(data, headers);
//		//jTable.setRowMargin(5);
//		for(int i=0; i<jTable.getColumnCount(); i++) {
//			jTable.getColumnModel().getColumn(i).setMinWidth(40);
//			jTable.getColumnModel().getColumn(i).setPreferredWidth(80);
//		}
//		//jTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
//		//jTable.doLayout();
//		//jTable.setPreferredSize(new Dimension(600, 300));
//		
//		JPanel innerPanel = new JPanel(new BorderLayout());
//		innerPanel.add(jTable);
//		
//		JScrollPane tableJScrolPane = new JScrollPane(innerPanel, 
//										JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
//										JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		tableJScrolPane.setColumnHeaderView(jTable.getTableHeader());
//		jPanelInt14.add(tableJScrolPane);
		
		JTable jTable = new JTable(data, headers) {
			@Override
			public boolean getScrollableTracksViewportWidth() {
				return super.getScrollableTracksViewportWidth()
						&& getPreferredSize().width < getParent().getWidth();
			}
		};
		//jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		//jTable.setFillsViewportHeight(true);
		
		jTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		for(int i=0; i<jTable.getColumnCount(); i++) {
			jTable.getColumnModel().getColumn(i).setPreferredWidth(140);
		}
		JScrollPane tableJScrolPane = new JScrollPane(jTable);
		tableJScrolPane.setPreferredSize(new Dimension(800, 300));
		jPanelInt14.add(tableJScrolPane);
		
		//jPanelInt14.add(new JScrollPane(jTable));
		
		
//**********************************************
		
	}
	private static char[] alfabet() {
		char[] abcd = new char[26];
		int ind=0;
		for (int i=97; i<=122; i++) {abcd[ind++]=((char)i);};//minuscules
		return abcd;
	};
	
//	@Override
//	public void actionPerformed(ActionEvent actionEvent) {
//		jLabel11.setText(actionEvent.getActionCommand());
//	}
//	@Override
//	public void itemStateChanged(ItemEvent itemEvent) {
//		//if(itemEvent.getStateChange()==ItemEvent.SELECTED)
//		if (itemEvent.getItem() == jCheckBox4) {
//			if (((JCheckBox) itemEvent.getItem()).isSelected())
//					((JCheckBox) itemEvent.getItem()).setIcon(new ImageIcon("imgs/off.png"));
//			else ((JCheckBox) itemEvent.getItem()).setIcon(new ImageIcon("imgs/standby.png"));
//		}
//	}
}

