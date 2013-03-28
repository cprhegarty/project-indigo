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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class LoginGUI extends JFrame implements ActionListener {
	
	
	
	static final long serialVersionUID = 1L;
	
	Connect connect;
	
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
					LoginGUI frame = new LoginGUI();
					frame.setTitle("Login");
		
					 frame.getContentPane().setBackground(Color.WHITE);
					
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
	public LoginGUI() {
		
		connect = new Connect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setIconImage(new ImageIcon("progicon.png").getImage()); 
		
		setBounds(0, 0, 550, 560);
		setResizable(false);
		
		contentPane = createContentPane();
		setContentPane(contentPane);
		
		imagePane = (JPanel) createImageDisplay();
		getContentPane().add(imagePane, BorderLayout.NORTH);
		
		P_NoLabel = new JLabel();
		P_NoLabel.setText("Polling Number:");
		P_No = new JTextField(10);
		P_No.setToolTipText("Please enter your Polling Number");
		P_No.addActionListener(this);
		
		
		
		PassLabel = new JLabel();
		PassLabel.setText("Password:");
		Pass = new JPasswordField(10);
		Pass.setToolTipText("Please enter your Password");
		Pass.addActionListener(this);
		
		
		ImageIcon enterImg = new ImageIcon("enterbutton.png");   
		enterBtn = new JButton(enterImg);
		enterBtn.setBorder(null);
		enterBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		enterBtn.setPressedIcon(new ImageIcon("enterpressed.png"));
		
		enterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev)
            {
				enterBtn_actionPerformed(ev);
	        }
			});

		
		ImageIcon helpImg = new ImageIcon("helpbutton.png");   
		helpBtn = new JButton(helpImg);
		helpBtn.setBorder(null);
		helpBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		helpBtn.setPressedIcon(new ImageIcon("helppressed.png"));
		helpBtn.addActionListener(this);
		
		contentPane.add(P_NoLabel);
		contentPane.add(P_No);
		contentPane.add(PassLabel);
		contentPane.add(Pass);
		contentPane.add(enterBtn);
		contentPane.add(helpBtn);
	}

	
	
	
	/**
	 * Set up the content pane
	 */
	private JPanel createContentPane() {
		
		JPanel pane = new JPanel();
		
		return pane;
	}
	
	
	
	
	public Container createImageDisplay()  {
		
		JPanel imageDisplay = new JPanel();
		ImageIcon harpImage = new ImageIcon("harp.png");
		JLabel harpLabel = new JLabel(harpImage);
		
		imageDisplay.add(harpLabel);
		
		return imageDisplay;
	}
	
	

	@Override
	public void actionPerformed(ActionEvent ev) {
		
		if(ev.getSource()==helpBtn) {
			//System.exit(0);
			LoginHelpGUI frame = new LoginHelpGUI();
			frame.setTitle("Login Help");
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setVisible(true);
		}
	}
		
		private void enterBtn_actionPerformed(ActionEvent ev)
		    {	
			
				//Simple validation test
			
		        /*System.out.println("login event called.");
		        String username = new String(P_No.getText());
		        String password = new String(Pass.getText());
		  
		    
		        if(username.equals("1234") && password.equals("4321")) 
		                {
		        	System.out.println("Success");
		        	JOptionPane.showMessageDialog(null,"Welcome " + username);
		                }
		        else
		        {
		        	System.out.println("Denied");
		        	JOptionPane.showMessageDialog(null,"Denied");
		        }*/
			
			
			char[] temp_pwd = Pass.getPassword();
			String pwd = null;
			pwd = String.copyValueOf(temp_pwd);
			System.out.println("Username,Pwd:"+P_No.getText()+","+pwd); System.out.println("Username,Pwd:"+P_No.getText()+","+pwd);
			
			//if login details are correct
			if(connect.checkLogin(P_No.getText(), pwd)) {
				//JOptionPane.showMessageDialog(null,"Welcome");
				VotingpageGUI frame = new VotingpageGUI();
				frame.setTitle("Voting Page");
				frame.getContentPane().setBackground(Color.WHITE);
				frame.setVisible(true);
			}
			else
	        {
	        	JOptionPane.showMessageDialog(null,"Denied");
	        }
	
	}
}