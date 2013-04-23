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

public class VoteHelpGUI extends JFrame implements ActionListener {

	static final long serialVersionUID = 1L;

	//GUI components
	JPanel contentPane;
	JPanel imagePane;

	JButton backBtn;
	

	static VoteHelpGUI frame2 = new VoteHelpGUI();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2.setTitle("Vote Help");
					frame2.getContentPane().setBackground(Color.WHITE);
					frame2.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the main application window.
	 */
	public VoteHelpGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setIconImage(new ImageIcon("images/progicon.png").getImage());

		setBounds(0, 0, 750, 760);
		setResizable(false);

		contentPane = createContentPane();
		setContentPane(contentPane);

		imagePane = (JPanel) createImageDisplay();
		getContentPane().add(imagePane, BorderLayout.NORTH);

		ImageIcon loginhelp = new ImageIcon("images/votehelp.png");
		JLabel loginhelpLabel = new JLabel(loginhelp);

		//Return Button
		ImageIcon backImg = new ImageIcon("images/returnbutton.png");
		backBtn = new JButton(backImg);
		backBtn.setBorder(null);
		backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backBtn.setPressedIcon(new ImageIcon("images/backpressed.png"));
		backBtn.addActionListener(this);

		contentPane.add(loginhelpLabel);
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

	@Override
	public void actionPerformed(ActionEvent ev) {

		//Return button action
		if (ev.getSource() == backBtn) {
			dispose();
			VotingpageGUI.run(new VotingpageGUI(), 750, 760); //Displays voting page
		}
	}
}