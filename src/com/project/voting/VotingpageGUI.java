package com.project.voting;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Authors: Gareth Hayden

	public class VotingpageGUI extends JFrame implements ActionListener {
		
		static final long serialVersionUID = 1L;
		
		JPanel contentPane;
		JPanel imagePane;
		
		JButton clearBtn;
		JButton finishBtn;
		JButton backImg;
		JButton helpBtn;
		
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						VotingpageGUI frame = new VotingpageGUI();
						frame.setTitle("Voting Page");
						
						 frame.getContentPane().setBackground(Color.WHITE);
						 
						
						
						frame.setVisible(true);
						
						 
						 
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		public VotingpageGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			
			setIconImage(new ImageIcon("images/progicon.png").getImage()); 
			
			//setBounds(0, 0, 550, 650);
			setBounds(0, 0, 670, 980);
			setResizable(false);
			
			
			contentPane = createContentPane();
			setContentPane(contentPane);
			
			imagePane = (JPanel) createImageDisplay();
			getContentPane().add(imagePane, BorderLayout.NORTH);
			
			
		}
		
		private JPanel createContentPane() {
			JPanel pane = new JPanel();
			
			
			return pane;
		}
		
		
		
		
		public Container createImageDisplay()  {
			JPanel imageDisplay = new JPanel();
			
	
			
            ImageIcon section1 = new ImageIcon("images/section1.png");
			
			JLabel section1Label = new JLabel(section1);
			
            ImageIcon section2 = new ImageIcon("images/section2.png");
			
			JLabel section2Label = new JLabel(section2);
			
			contentPane.add(section1Label);
			contentPane.add(section2Label);
			
			ImageIcon clearImg = new ImageIcon("images/Election Not Pressed Clear Button Main Page.png");   
			clearBtn = new JButton(clearImg);
			clearBtn.setBorder(null);
			clearBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			clearBtn.setPressedIcon(new ImageIcon("images/Election Pressed Clear Button Main Page.png"));
			clearBtn.addActionListener(this);
			clearBtn.setPreferredSize(new Dimension(160, 130));
			clearBtn.setLocation(10, 10);
			clearBtn.setBorderPainted(false) ;
			
			contentPane.add(clearBtn);
			
			ImageIcon finishImg = new ImageIcon("images/Election Not Pressed Finish Button Main Page.png");   
			finishBtn = new JButton(finishImg);
			finishBtn.setBorder(null);
			finishBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			finishBtn.setPressedIcon(new ImageIcon("images/Election Pressed Finish Button Main Page.png"));
			finishBtn.addActionListener(this);
			finishBtn.setPreferredSize(new Dimension(160, 130));
			finishBtn.setLocation(10, 10);
			//finishBtn.setBorderPainted(false) ;
			
			contentPane.add(finishBtn);
			
			ImageIcon helpImg = new ImageIcon("images/Election Not Pressed Help Button Main Page.png");   
			helpBtn = new JButton(helpImg);
			helpBtn.setBorder(null);
			helpBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			helpBtn.setPressedIcon(new ImageIcon("images/Election Pressed Help Button Main Page.png"));
			helpBtn.addActionListener(this);
			helpBtn.setPreferredSize(new Dimension(160, 130));
			helpBtn.setLocation(10, 10);
			helpBtn.setBorderPainted(false) ;
			contentPane.add(helpBtn);
			
			
			return imageDisplay;
		}

		@Override
		public void actionPerformed(ActionEvent ev) {
			
			if(ev.getSource()==clearBtn) {
				//System.exit(0);
				LoginGUI frame = new LoginGUI();
				frame.setTitle("Login");
				frame.getContentPane().setBackground(Color.WHITE);
				frame.setVisible(true);
		}
		    if(ev.getSource()==finishBtn) {
				//System.exit(0);
				ThankYouGUI frame = new ThankYouGUI();
				frame.setTitle("Thank You");
				frame.getContentPane().setBackground(Color.WHITE);
				frame.setVisible(true);
		}

	}
}


