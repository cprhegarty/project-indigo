package com.project.voting;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



	public class VoteHelpGUI extends JFrame implements ActionListener {
		
		static final long serialVersionUID = 1L;
		
		JPanel contentPane;
		JPanel imagePane;
		
		JButton backBtn;
		//JButton backImg;
		
		static VoteHelpGUI frame2 = new VoteHelpGUI();


		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						//LoginHelpGUI frame1 = new LoginHelpGUI();
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
			
			/*
			 * You are not required to stick the the following dimensions
			 * Feel free to choose your own
			 */
			
			setIconImage(new ImageIcon("images/progicon.png").getImage()); 
			
			setBounds(0, 0, 750, 760);
			setResizable(false);
			
			contentPane = createContentPane();
			setContentPane(contentPane);
			
			imagePane = (JPanel) createImageDisplay();
			getContentPane().add(imagePane, BorderLayout.NORTH);
			
			ImageIcon loginhelp = new ImageIcon("images/votehelp.png");
			JLabel loginhelpLabel = new JLabel(loginhelp);
			
			
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
			
			/*
			 * TODO Define a layout for the content pane
			 */
			
			
			
			
			
			return pane;
		}
		
		
		
		
		public Container createImageDisplay()  {
			JPanel imageDisplay = new JPanel();
			
			/*
			 * TODO
			 * 		Define a layout for this container
			 * 		Create the number display
			 * 		Choose appropriate display font/size
			 */
			
			
			
			
			//ImageIcon loginhelp = new ImageIcon("images/loginhelp.png");
			//JLabel loginhelpLabel = new JLabel(loginhelp);
			/*
			loginhelpLabel.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent ev) {
					//loginhelpLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					System.out.println("Click at: " + ev.getPoint());
				}
			});
		*/
		
			//imageDisplay.add(loginhelpLabel);
			
			
			return imageDisplay;
		}

		@Override
		public void actionPerformed(ActionEvent ev) {
			
			if(ev.getSource()==backBtn) {
				dispose();
				VotingpageGUI.run(new VotingpageGUI(), 750, 760);
		}
	}
}