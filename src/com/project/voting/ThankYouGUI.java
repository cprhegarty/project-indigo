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

	public class ThankYouGUI extends JFrame implements ActionListener {
		
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
						ThankYouGUI frame = new ThankYouGUI();
						frame.setTitle("Voting Page");
						
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
			
	
			
            ImageIcon section1 = new ImageIcon("images/thankyou.png");
			
			JLabel section1Label = new JLabel(section1);
			
            //ImageIcon section2 = new ImageIcon("images/section2.png");
			
			//JLabel section2Label = new JLabel(section2);
			
			contentPane.add(section1Label);
			//contentPane.add(section2Label);
			
			
			
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
	}
}

