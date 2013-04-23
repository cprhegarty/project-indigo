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

public class AdminLoginGUI extends JFrame implements ActionListener {

	static final long serialVersionUID = 1L;
	
//Declare GUI components
	JPanel contentPane;
	JPanel imagePane;

	JLabel AdminLabel;
	JLabel PassLabel;

	JTextField AdminId;
	JPasswordField Pass;

	JButton enterBtn;
	JButton enterpressedBtn;
	JButton helpBtn;
	JButton backBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoginGUI frame = new AdminLoginGUI();
					frame.setTitle("Administrator Login");

					frame.getContentPane().setBackground(Color.white);

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

		setIconImage(new ImageIcon("images/progicon.png").getImage());  //Program icon

		setBounds(0, 0, 750, 760);  //Window size
		setResizable(false);  

		contentPane = createContentPane();
		setContentPane(contentPane);

		imagePane = (JPanel) createImageDisplay();
		getContentPane().add(imagePane, BorderLayout.NORTH);

		//Admin ID
		AdminLabel = new JLabel();
		AdminLabel.setText("ID:");
		AdminId = new JTextField(10);
		AdminId.addActionListener(this);

		//Password
		PassLabel = new JLabel();
		PassLabel.setText("Password:");
		Pass = new JPasswordField(10);
		Pass.addActionListener(this);

		ImageIcon harpImage = new ImageIcon("images/admin login.png");
		JLabel harpLabel = new JLabel(harpImage);

		ImageIcon harpImage2 = new ImageIcon("images/login section 2.png");
		JLabel harpLabel2 = new JLabel(harpImage2);

		//Enter Button
		ImageIcon enterImg = new ImageIcon("images/enterbutton.png");
		enterBtn = new JButton(enterImg);
		enterBtn.setBorder(null);
		enterBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		enterBtn.setPressedIcon(new ImageIcon("images/enterpressed.png"));

		//Return Button
		ImageIcon helpImg = new ImageIcon("images/returnbutton.png");
		backBtn = new JButton(helpImg);
		backBtn.setBorder(null);
		backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backBtn.setPressedIcon(new ImageIcon("images/backpressed.png"));
		backBtn.addActionListener(this);

		ImageIcon harpImage3 = new ImageIcon("images/login section 3.png");
		JLabel harpLabel3 = new JLabel(harpImage3);

		//Enter Button Action Prototype
		enterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				enterBtn_actionPerformed(ev);
			}
		});

		//Add components to window
		contentPane.add(harpLabel);
		contentPane.add(AdminLabel);
		contentPane.add(AdminId);
		contentPane.add(PassLabel);
		contentPane.add(Pass);
		contentPane.add(harpLabel2);
		contentPane.add(enterBtn);
		contentPane.add(harpLabel3);
		contentPane.add(backBtn);
	}

	/**
	 * Set up the content pane
	 */
	private JPanel createContentPane() {
		JPanel pane = new JPanel();
		
		return pane;
	}

	public Container createImageDisplay() {
		JPanel imageDisplay = new JPanel();

		return imageDisplay;
	}

	//Return Button Action
	@Override
	public void actionPerformed(ActionEvent ev) {

		if (ev.getSource() == backBtn) {

			dispose(); //Closes window

			LoginGUI frame = new LoginGUI();  //Opens Main (voter) Login window
			frame.setTitle("Login");
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setVisible(true);
		}
	}

	//Enter Button Action
	private void enterBtn_actionPerformed(ActionEvent ev) {
		AdminConnect adminconnect = new AdminConnect(); //Database link

		char[] temp_pwd = Pass.getPassword();
		String pwd = null;
		pwd = String.copyValueOf(temp_pwd);
		System.out.println("Username,Pwd:" + AdminId.getText() + "," + pwd);
		System.out.println("Username,Pwd:" + AdminId.getText() + "," + pwd);

		// if login details are correct
		if (adminconnect.checkLogin(AdminId.getText(), pwd)) {

			dispose();

			TheResultGUI frame = new TheResultGUI();  //Enter voting page
			frame.setTitle("Results");
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setVisible(true);

			JOptionPane.showMessageDialog(null, "Welcome: " + AdminId.getText());
		}

		else {
			JOptionPane.showMessageDialog(null, "Denied");
		}
	}
}