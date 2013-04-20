package com.project.voting;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;






	public class TheResultGUI extends JFrame implements ActionListener {
		
		static final long serialVersionUID = 1L;
		
		JPanel contentPane;
		JPanel imagePane;
		
	 
		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JTextField field3 = new JTextField();
		JTextField field4 = new JTextField();
		JTextField field5 = new JTextField();
		JTextField field6 = new JTextField();
		JTextField field7 = new JTextField();
		JTextField field8 = new JTextField();
		
		JButton backBtn;
		JButton EmmaJohnsonBtn;
		JButton FredCartmanBtn;
		JButton HomerSimpsonBtn;
		JButton JessicaAlbaBtn;
		JButton JohnGoodmanBtn;
		JButton KimDotcomBtn;
		JButton PatrickReillyBtn;
		JButton SeanBarrettBtn;


		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						TheResultGUI frame = new TheResultGUI();
						frame.setTitle("Voting Results");
						
						frame.getContentPane().setBackground(Color.WHITE);
						 
						
						
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		
		
		public TheResultGUI() {
		
			
			
			 
			
			
			
			setIconImage(new ImageIcon("images/progicon.png").getImage()); 
			
			setBounds(0, 0, 750, 760);
			setResizable(false);
			
			contentPane = createContentPane();
			setContentPane(contentPane);
			
			
			
			
			
			Container contentPane = getContentPane();
			contentPane.setLayout(new GridLayout(9,2,10,10));
			contentPane.setBackground(Color.white);
			
			String text="";
			
			field1.setText(text);
			
			
			ImageIcon soundImg = new ImageIcon("images/sound.png");   
			EmmaJohnsonBtn = new JButton(soundImg);
			EmmaJohnsonBtn.setBorder(null);
			EmmaJohnsonBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			EmmaJohnsonBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
			EmmaJohnsonBtn.addActionListener(this);
			EmmaJohnsonBtn.setLocation(10, 10);
			EmmaJohnsonBtn.setBorderPainted(false) ;
			EmmaJohnsonBtn.setBackground(Color.white);
			
			
			ImageIcon soundImg2 = new ImageIcon("images/sound.png");   
			FredCartmanBtn = new JButton(soundImg2);
			FredCartmanBtn.setBorder(null);
			FredCartmanBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			FredCartmanBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
			FredCartmanBtn.addActionListener(this);
			FredCartmanBtn.setBorderPainted(false) ;
			FredCartmanBtn.setBackground(Color.white);
			
			ImageIcon soundImg3 = new ImageIcon("images/sound.png");   
			HomerSimpsonBtn = new JButton(soundImg3);
			HomerSimpsonBtn.setBorder(null);
			HomerSimpsonBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			HomerSimpsonBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
			HomerSimpsonBtn.addActionListener(this);
			HomerSimpsonBtn.setBorderPainted(false) ;
			HomerSimpsonBtn.setBackground(Color.white);
			
			ImageIcon soundImg4 = new ImageIcon("images/sound.png");   
			JohnGoodmanBtn = new JButton(soundImg4);
			JohnGoodmanBtn.setBorder(null);
			JohnGoodmanBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			JohnGoodmanBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
			JohnGoodmanBtn.addActionListener(this);
			JohnGoodmanBtn.setBorderPainted(false) ;
			JohnGoodmanBtn.setBackground(Color.white);
			
			ImageIcon soundImg5 = new ImageIcon("images/sound.png");   
			KimDotcomBtn = new JButton(soundImg5);
			KimDotcomBtn.setBorder(null);
			KimDotcomBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			KimDotcomBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
			KimDotcomBtn.addActionListener(this);
			KimDotcomBtn.setBorderPainted(false) ;
			KimDotcomBtn.setBackground(Color.white);
			
			ImageIcon soundImg6 = new ImageIcon("images/sound.png");   
			PatrickReillyBtn = new JButton(soundImg6);
			PatrickReillyBtn.setBorder(null);
			PatrickReillyBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			PatrickReillyBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
			PatrickReillyBtn.addActionListener(this);
			PatrickReillyBtn.setBorderPainted(false) ;
			PatrickReillyBtn.setBackground(Color.white);
			
			ImageIcon soundImg7 = new ImageIcon("images/sound.png");   
			SeanBarrettBtn = new JButton(soundImg7);
			SeanBarrettBtn.setBorder(null);
			SeanBarrettBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			SeanBarrettBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
			SeanBarrettBtn.addActionListener(this);
			SeanBarrettBtn.setBorderPainted(false) ;
			SeanBarrettBtn.setBackground(Color.white);
			
			ImageIcon soundImg8 = new ImageIcon("images/sound.png");   
			JessicaAlbaBtn = new JButton(soundImg8);
			JessicaAlbaBtn.setBorder(null);
			JessicaAlbaBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			JessicaAlbaBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
			JessicaAlbaBtn.addActionListener(this);
			JessicaAlbaBtn.setBorderPainted(false) ;
			JessicaAlbaBtn.setBackground(Color.white);
			
			
			    ImageIcon test1 =new ImageIcon("images/Emma Johnson.png");  
			    JLabel image1 = new JLabel(test1);
			    
			    ImageIcon test2 =new ImageIcon("images/Fred Cartman.png");
			    JLabel image2 = new JLabel(test2);
			    
			    ImageIcon test3 =new ImageIcon("images/Homer Simpson.png");
			    JLabel image3 = new JLabel(test3);
			    
			    ImageIcon test4 =new ImageIcon("images/John Goodman.png");
			    JLabel image4 = new JLabel(test4);
			    
			    ImageIcon test5 =new ImageIcon("images/Kim Dotcom.png");  
			    JLabel image5 = new JLabel(test5);
			    
			    ImageIcon test6 =new ImageIcon("images/Patrick Reilly.png");
			    JLabel image6 = new JLabel(test6);
			    
			    ImageIcon test7 =new ImageIcon("images/Sean Barrett.png");
			    JLabel image7 = new JLabel(test7);
			    
			    ImageIcon test8 =new ImageIcon("images/Jessica Alba.png");
			    JLabel image8 = new JLabel(test8);    
			  
			
				
				ImageIcon backImg = new ImageIcon("images/ResultReturn.png");   
				backBtn = new JButton(backImg);
				backBtn.setBorder(null);
				backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				backBtn.setPressedIcon(new ImageIcon("images/ResultReturn.png"));
				backBtn.addActionListener(this);
				backBtn.setBackground(Color.white);
				backBtn.setBorder(null);
			
			  Font myfont = new Font("SansSerif", Font.BOLD, 60);
				
			    contentPane.add(image1);
			    contentPane.add(EmmaJohnsonBtn);
			    field1.setText(can1);
			    field1.setFont(myfont);
			    field1.setHorizontalAlignment(JTextField.CENTER);
			    field1.setEditable(false);
			    contentPane.add(field1);
			   
			   contentPane.add(image2);
			   contentPane.add(FredCartmanBtn);
			   field2.setText(can2);
			    field2.setFont(myfont);
			    field2.setHorizontalAlignment(JTextField.CENTER);
			    field2.setEditable(false);
			   contentPane.add(field2);
			   
			    contentPane.add(image3);
			    contentPane.add(HomerSimpsonBtn);
			    field3.setText(can3);
			    field3.setFont(myfont);
			    field3.setHorizontalAlignment(JTextField.CENTER);
			    field3.setEditable(false);
			    contentPane.add(field3);
			    
			    contentPane.add(image4);
			    contentPane.add(JohnGoodmanBtn);
			    field4.setText(can4);
			    field4.setFont(myfont);
			    field4.setHorizontalAlignment(JTextField.CENTER);
			    field4.setEditable(false);
			    contentPane.add(field4);
			 
			   contentPane.add(image5);
			   contentPane.add(KimDotcomBtn);
			   field5.setText(can5);
			    field5.setFont(myfont);
			    field5.setHorizontalAlignment(JTextField.CENTER);
			    field5.setEditable(false);
			   contentPane.add(field5);
			   
			    contentPane.add(image6);
			    contentPane.add(PatrickReillyBtn);
			    field6.setText(can6);
			    field6.setFont(myfont);
			    field6.setHorizontalAlignment(JTextField.CENTER);
			    field6.setEditable(false);
			    contentPane.add(field6);
			 
			    contentPane.add(image7);
			    contentPane.add(SeanBarrettBtn);
			    field7.setText(can7);
			    field7.setFont(myfont);
			    field7.setHorizontalAlignment(JTextField.CENTER);
			    field7.setEditable(false);
			    contentPane.add(field7);
			   
			    contentPane.add(image8);
			    contentPane.add(JessicaAlbaBtn);
			    field8.setText(can8);
			    field8.setFont(myfont);
			    field8.setHorizontalAlignment(JTextField.CENTER);
			    field8.setEditable(false);
			    contentPane.add(field8);
			    
			    contentPane.add(backBtn);
			
			
			
		}
		
		
		private JPanel createContentPane() {
			JPanel pane = new JPanel();
			
		
			
			
		
			
		 return pane;
		}
		
		
		
		
		public Container createImageDisplay()  {
			JPanel imageDisplay = new JPanel();
			
		
			
			
		
			
			
			return imageDisplay;
		}

		@Override
		public void actionPerformed(ActionEvent ev) {
			
			if(ev.getSource()==backBtn) {
				LoginGUI frame = new LoginGUI();
				frame.setTitle("Login");
				frame.getContentPane().setBackground(Color.WHITE);
				frame.setVisible(true);
		}
			 if(ev.getSource()==EmmaJohnsonBtn) {
					
			    	try{
			            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/Emma Johnson.wav").getAbsoluteFile());
			            Clip clip = AudioSystem.getClip();
			            clip.open(audioInputStream);
			            clip.start();
			        }catch(Exception ex){
			            System.out.println("Error with playing sound.");
			            ex.printStackTrace();
			        }
					
			}
			    if(ev.getSource()==FredCartmanBtn) {
					
			    	try{
			            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/Fred Cartman.wav").getAbsoluteFile());
			            Clip clip = AudioSystem.getClip();
			            clip.open(audioInputStream);
			            clip.start();
			        }catch(Exception ex){
			            System.out.println("Error with playing sound.");
			            ex.printStackTrace();
			        }
			 		
			}
			    if(ev.getSource()==HomerSimpsonBtn) {
					
			    	try{
			            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/Homer Simpson.wav").getAbsoluteFile());
			            Clip clip = AudioSystem.getClip();
			            clip.open(audioInputStream);
			            clip.start();
			        }catch(Exception ex){
			            System.out.println("Error with playing sound.");
			            ex.printStackTrace();
			        }
					
			}
			    if(ev.getSource()==JessicaAlbaBtn) {
					
			    	try{
			            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/Jessica Alba.wav").getAbsoluteFile());
			            Clip clip = AudioSystem.getClip();
			            clip.open(audioInputStream);
			            clip.start();
			        }catch(Exception ex){
			            System.out.println("Error with playing sound.");
			            ex.printStackTrace();
			        }
					
			}
			    if(ev.getSource()==JohnGoodmanBtn) {
					
			    	try{
			            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/John Goodman.wav").getAbsoluteFile());
			            Clip clip = AudioSystem.getClip();
			            clip.open(audioInputStream);
			            clip.start();
			        }catch(Exception ex){
			            System.out.println("Error with playing sound.");
			            ex.printStackTrace();
			        }
					
			}
			    if(ev.getSource()==KimDotcomBtn) {
					
			    	try{
			            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/Kim Dotcom.wav").getAbsoluteFile());
			            Clip clip = AudioSystem.getClip();
			            clip.open(audioInputStream);
			            clip.start();
			        }catch(Exception ex){
			            System.out.println("Error with playing sound.");
			            ex.printStackTrace();
			        }
					
			}
			    if(ev.getSource()==PatrickReillyBtn) {
							
				try{
				    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/Patrick Reilly.wav").getAbsoluteFile());
				    Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					 clip.start();
					   }catch(Exception ex){
					            System.out.println("Error with playing sound.");
					            ex.printStackTrace();
					        }
							
					}
			    if(ev.getSource()==SeanBarrettBtn) {
					//System.exit(0);
			    	try{
			            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/Sean Barrett.wav").getAbsoluteFile());
			            Clip clip = AudioSystem.getClip();
			            clip.open(audioInputStream);
			            clip.start();
			        }catch(Exception ex){
			            System.out.println("Error with playing sound.");
			            ex.printStackTrace();
			        }
			    }
	}
			Connect connect = new Connect();
			
			String can1, can2, can3, can4, can5, can6, can7, can8;
		{
			try {

				Class.forName("oracle.jdbc.driver.OracleDriver");
				connect.con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", "system",
						"robindigo");

				// connect.pst=connect.con.prepareStatement("select vtrid from voters;");

				// System.out.println(connect.pst=connect.con.prepareStatement("select vtrid from voters;"));

				Statement stmt = connect.con.createStatement();
				//connect.rs = stmt.executeQuery("select * from voterprefs where kim_dotcom = 1");
				
				
				
				int seats = 3;
				int quota = 0;
				int total=0;
				int i=1;
				
				
				
				connect.rs = stmt.executeQuery
					//	("select count(*) from voterprefs where kim_dotcom = 1 and emma_johnson = 1 and homer_simpson = 1 and john_goodman = 1 and patrick_reilly = 1 and sean_barrett = 1 and jessica_alba = 1 and fred_cartman = 1");
						("select count(*) from voterprefs where kim_dotcom = 1 union all select count(*) from voterprefs where emma_johnson = 1 union all select count(*) from voterprefs where fred_cartman = 1 union all select count(*) from voterprefs where john_goodman = 1 union all select count(*) from voterprefs where patrick_reilly = 1 union all select count(*) from voterprefs where homer_simpson = 1 union all select count(*) from voterprefs where sean_barrett = 1 union all select count(*) from voterprefs where jessica_alba = 1");
								
				//connect.pst=connect.con.prepareStatement("update candidates set total = " + total);

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));

					
					
					if (i==1)
					{
						can5 =connect.rs.getString(1);
						System.out.println("can5: " + can5);
						System.out.println("Kim Dotcom");
						field1.setText(can5);
					}
					
					if (i==2)
					{
						can1 =connect.rs.getString(1);
						System.out.println("can1: " + can1);
						System.out.println("Emma Johnson");
					}
					
					if (i==3)
					{
						can2 =connect.rs.getString(1);
						System.out.println("can2: " + can2);
						System.out.println("Fred Cartman");
					}
					
					if (i==4)
					{
						can3 =connect.rs.getString(1);
						System.out.println("can3: " + can3);
						System.out.println("Homer Simpson");
					}
					
					if (i==5)
					{
						can4 =connect.rs.getString(1);
						System.out.println("can4: " + can4);
						System.out.println("John Goodman");
					}
					
					if (i==6)
					{
						can6 =connect.rs.getString(1);
						System.out.println("can6: " + can6);
						System.out.println("Patrick Reilly");
					}
					
					if (i==7)
					{
						can7 =connect.rs.getString(1);
						System.out.println("can7: " + can7);
						System.out.println("Sean Barrett");
					}
					
					if (i==8)
					{
						can8 =connect.rs.getString(1);
						System.out.println("can8: " + can8);
						System.out.println("Jessica Alba");
					}
					
					
					
					total++;
					i++;
					quota = total / seats;
					 
					System.out.println("can1: " + can1);
					field1.setText(can1);
					
				}
				
				
				System.out.println("Total: " + total);
				System.out.println("Quota: " + quota);
				connect.pst.close();
				connect.con.close();
				
				
				
				
				/*int total;
				total = connect.rs.getInt(1);
				System.out.println("Total: " + total);
				quota = total / seats;
				
				System.out.println("Quota: " + quota);
				*/
				
				
				
				//results.append(connect.rs.getString(1));

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		
}