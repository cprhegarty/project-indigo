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
import javax.swing.JPanel;

public class ThankYouGUI extends JFrame implements ActionListener {

	static final long serialVersionUID = 1L;

	//GUI components
	JPanel contentPane;
	JPanel imagePane;

	JButton clearBtn;
	JButton finishBtn;
	JButton backImg;
	JButton pageBtn;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThankYouGUI frame = new ThankYouGUI();
					frame.setTitle("Thank You");
					frame.getContentPane().setBackground(Color.WHITE);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ThankYouGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setIconImage(new ImageIcon("images/progicon.png").getImage()); //Program icon

		setBounds(0, 0, 750, 760); //Window size
		setResizable(false);

		contentPane = createContentPane();
		setContentPane(contentPane);

		imagePane = (JPanel) createImageDisplay();
		getContentPane().add(imagePane, BorderLayout.NORTH); //Layout

	}

	private JPanel createContentPane() {
		JPanel pane = new JPanel();

		return pane;
	}

	public Container createImageDisplay() {
		JPanel imageDisplay = new JPanel();

		//Clickable page
		ImageIcon backImg = new ImageIcon("images/thankyou.png");
		pageBtn = new JButton(backImg);
		pageBtn.setBorder(null);
		pageBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pageBtn.setPressedIcon(new ImageIcon("images/thankyou.png"));
		pageBtn.addActionListener(this);

		contentPane.add(pageBtn);

		return imageDisplay;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {

		if (ev.getSource() == pageBtn) {
			// System.exit(0);
			dispose(); //Closes window

			LoginGUI frame = new LoginGUI(); //Displays Login page
			frame.setTitle("Login");
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setVisible(true);
		}
	}
}
