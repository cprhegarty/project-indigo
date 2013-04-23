package com.project.voting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginHelpGUI extends JFrame implements ActionListener {

	static final long serialVersionUID = 1L;

	JPanel contentPane;
	JPanel imagePane;

	JButton backBtn;
	
	static LoginHelpGUI frame2 = new LoginHelpGUI();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame2.setTitle("Login Help");
					frame2.getContentPane().setBackground(Color.WHITE);
					frame2.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginHelpGUI() {
		
		setIconImage(new ImageIcon("images/progicon.png").getImage()); //Program icon

		setBounds(0, 0, 750, 760); //Window size
		setResizable(false);

		contentPane = createContentPane();
		setContentPane(contentPane);

		imagePane = (JPanel) createImageDisplay();
		getContentPane().add(imagePane, BorderLayout.NORTH); //Layout

		//Help button image
		ImageIcon loginhelp = new ImageIcon("images/loginhelp.png");
		JLabel loginhelpLabel = new JLabel(loginhelp);

		//Return button image
		ImageIcon backImg = new ImageIcon("images/returnbutton.png");
		backBtn = new JButton(backImg);
		backBtn.setBorder(null);
		backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backBtn.setPressedIcon(new ImageIcon("images/backpressed.png"));
		backBtn.addActionListener(this);

		//Added
		contentPane.add(loginhelpLabel);
		contentPane.add(backBtn);

	}

	private JPanel createContentPane() {
		JPanel pane = new JPanel();

		return pane;
	}

	public Container createImageDisplay() {
		JPanel imageDisplay = new JPanel();

		return imageDisplay;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {

		//Return button action
		if (ev.getSource() == backBtn) {
			
			dispose(); //Closes window
			
			LoginGUI frame = new LoginGUI();
			frame.setTitle("Login");
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setVisible(true);
		}
	}
}
