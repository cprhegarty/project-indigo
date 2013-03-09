package com.project.voting;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLoginGUI extends JFrame implements ActionListener {
	
	static final long serialVersionUID = 1L;
	
	String username = "1234";
	String password = "4321";
	
	
	
	JPanel contentPane;
	JPanel imagePane;
	
	JLabel P_NoLabel;
	JLabel PassLabel;
	
	JTextField P_No;
	JPasswordField Pass;
	
	JButton enterBtn;
	JButton enterpressedBtn;
	JButton helpBtn;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoginGUI frame = new AdminLoginGUI();
					frame.setTitle(" Administrator Login");
		
					 frame.getContentPane().setBackground(Color.CYAN);
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	/**
	 * Create the main application window.
	 */
	public AdminLoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * You are not required to stick the the following dimensions
		 * Feel free to choose your own
		 */
		
		
		setIconImage(new ImageIcon("progicon.png").getImage()); 
		
		setBounds(0, 0, 550, 560);
		 setResizable(false);
		
		contentPane = createContentPane();
		setContentPane(contentPane);
		
		imagePane = (JPanel) createImageDisplay();
		getContentPane().add(imagePane, BorderLayout.NORTH);
		
		P_NoLabel = new JLabel();
		P_NoLabel.setText("ID:");
		P_No = new JTextField(10);
		P_No.addActionListener(this);
		
		
		
		PassLabel = new JLabel();
		PassLabel.setText("Password:");
		Pass = new JPasswordField(10);
		Pass.addActionListener(this);
		
		ImageIcon enterImg = new ImageIcon("enterbutton.png");   
		enterBtn = new JButton(enterImg);
		enterBtn.setBorder(null);
		enterBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		enterBtn.setPressedIcon(new ImageIcon("enterpressed.png"));
		enterBtn.addActionListener(this);
		
		contentPane.add(P_NoLabel);
		contentPane.add(P_No);
		contentPane.add(PassLabel);
		contentPane.add(Pass);
		contentPane.add(enterBtn);
	}

	
	
	/**
	 * Set up the content pane
	 */
	private JPanel createContentPane() {
		JPanel pane = new JPanel();
		
		/*
		 * TODO Define a layout for the content pane
		 */
		
		return pane;
	}
	
	
	
	
	public Container createImageDisplay()  {
		JPanel imageDisplay = new JPanel();
		
		ImageIcon harpImage = new ImageIcon("harp.png");
		JLabel harpLabel = new JLabel(harpImage);
		
		ImageIcon loginImage = new ImageIcon("login.png");
		JLabel loginLabel = new JLabel(loginImage);

		imageDisplay.add(harpLabel);
		
		return imageDisplay;
	}
	
	
	
	/*public void updatePanel(JPanel pane) {
		getContentPane().removeAll();
		getContentPane().add(pane, BorderLayout.CENTER);
		getContentPane().doLayout();
		update(getGraphics());
		
	}*/
	

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		/*if(ev.getSource()==enterBtn) {
			//P_No.getText();
			if(username = P_No) {
				System.out.println("Success");
			}
		}
			
		
	/*	if(ev.getSource()==Pass) {
			//P_No.getText();
			if(Pass.getText() == "4321") {
				System.out.println("Success");
			}
		}*/
		
		//if(ev.getSource()==enterBtn) {
		//P_No.getText();
		
	
	}
}