package com.project.voting;




import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.DriverManager;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class VotingpageGUI extends JApplet implements ActionListener {
	
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;






private String[] description = { "","1", "2", "3",
      "4", "5", "6", "7", "8" };

  
  



  private JComboBox combo1 = new JComboBox();
  private JComboBox combo2 = new JComboBox();
  private JComboBox combo3 = new JComboBox();
  private JComboBox combo4= new JComboBox();
  private JComboBox combo5 = new JComboBox();
  private JComboBox combo6 = new JComboBox();
  private JComboBox combo7 = new JComboBox();
  private JComboBox combo8 = new JComboBox();
  
  
  
  
  //Creating Sound buttons
  
  JButton EmmaJohnsonBtn;
  JButton FredCartmanBtn;
  JButton HomerSimpsonBtn;
  JButton JessicaAlbaBtn;
  JButton JohnGoodmanBtn;
  JButton KimDotcomBtn;
  JButton PatrickReillyBtn;
  JButton SeanBarrettBtn;
  
 
  
 
 // private JButton b = new JButton(castvote);
  
  
  
  
  

  private int count = 0;

  public void init() {
	  
	  
	  
	  
	  
	  
	  
	  	ImageIcon castvote = new ImageIcon("images/cast vote.png");
	   JButton cast = new JButton(castvote);
	  cast.setBackground(Color.white);
	   cast.setBorder(null);
	   
		ImageIcon help = new ImageIcon("images/help.png");
		   JButton Help = new JButton(help);
		   Help.setBackground(Color.white);
		   Help.setBorder(null);
		   
			ImageIcon clear = new ImageIcon("images/clear.png");
			   JButton cleared = new JButton(clear);
			   cleared.setBackground(Color.white);
			   cleared.setBorder(null);
	   

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
		
		
	
	  
    for (int i = 0; i <9; i++)
    {
    	combo1.addItem(description[count]);
        combo2.addItem(description[count]);
        combo3.addItem(description[count]);
        combo4.addItem(description[count]);
        combo5.addItem(description[count]);
        combo6.addItem(description[count]);
        combo7.addItem(description[count]);
        combo8.addItem(description[count]);
      
      count++;
    }
   
  cast.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	  
    	
    	  JOptionPane.showMessageDialog(null,""+ combo1.getSelectedIndex());
    	  JOptionPane.showMessageDialog(null,""+ combo2.getSelectedIndex());
    	  JOptionPane.showMessageDialog(null,""+ combo3.getSelectedIndex());
    	  JOptionPane.showMessageDialog(null,""+ combo4.getSelectedIndex());
    	  JOptionPane.showMessageDialog(null,""+ combo5.getSelectedIndex());
    	  JOptionPane.showMessageDialog(null,""+ combo6.getSelectedIndex());
    	  JOptionPane.showMessageDialog(null,""+ combo7.getSelectedIndex());
    	  JOptionPane.showMessageDialog(null,""+ combo8.getSelectedIndex());
    	  
    	  
        if (count < description.length) {
        	combo1.addItem(description[count]);
        	combo2.addItem(description[count]);
        	combo3.addItem(description[count]);
        	combo4.addItem(description[count]);
        	combo5.addItem(description[count]);
        	combo6.addItem(description[count]);
        	combo7.addItem(description[count]);
        	combo8.addItem(description[count]);
          count++;
      }
        
        
        //casts index of combo boxes to int
        
        int getc1, getc2, getc3, getc4, getc5, getc6, getc7, getc8 = 0;
        
        getc1 = combo1.getSelectedIndex();
        getc2 = combo2.getSelectedIndex();
        getc3 = combo3.getSelectedIndex();
        getc4 = combo4.getSelectedIndex();
        getc5 = combo5.getSelectedIndex();
        getc6 = combo6.getSelectedIndex();
        getc7 = combo7.getSelectedIndex();
        getc8 = combo8.getSelectedIndex();
        
  
        
          
          Connect connect = new Connect();
          
          try{
	        	
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            connect.con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "robindigo");
	            
	            
	                        connect.pst=connect.con.prepareStatement("insert into test_vote values ('" + getc1 + "', '" + getc2 + "', '" + getc3 + "', '" + getc4 + "', '" + getc5 + "', '" + getc6 + "', '" + getc7 + "', '" + getc8 + "')");
	        	            
	        	            connect.rs=connect.pst.executeQuery();
	        	            
	        	            ThankYouGUI frame = new ThankYouGUI();
	        	            frame.setTitle("Thank You");
	        				frame.getContentPane().setBackground(Color.WHITE);
	        				frame.setVisible(true);
	           }
	        catch (Exception ev) 
	        {
	            System.out.println(ev);
	        }
	    
      }
    });
  
  
  cleared.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
		combo1.setSelectedIndex(0);
		combo2.setSelectedIndex(0);
		combo3.setSelectedIndex(0);
		combo4.setSelectedIndex(0);
		combo5.setSelectedIndex(0);
		combo6.setSelectedIndex(0);
		combo7.setSelectedIndex(0);
		combo8.setSelectedIndex(0);
	  }
  });
  
  
    combo1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
    	  
    	  
    	  
    	  
       
      }
    });
    
    
    
    
    
    
    combo1.setPreferredSize(new Dimension(20,20));
    combo1.setForeground(Color.black);
    combo1.setBackground(new Color( 184,151,98));
    
    
   
    
    combo2.setPreferredSize(new Dimension(20,20));
    combo2.setForeground(Color.black);
    combo2.setBackground(new Color( 184,151,98));

    
    combo3.setPreferredSize(new Dimension(20,20));
    combo3.setForeground(Color.black);
    combo3.setBackground(new Color( 184,151,98));
   
    
    combo4.setPreferredSize(new Dimension(20,20));
    combo4.setForeground(Color.black);
    combo4.setBackground(new Color( 184,151,98));
   
    
    combo5.setPreferredSize(new Dimension(20,20));
    combo5.setForeground(Color.black);
    combo5.setBackground(new Color( 184,151,98));
 
    
    combo6.setPreferredSize(new Dimension(20,20));
    combo6.setForeground(Color.black);
    combo6.setBackground(new Color( 184,151,98));
  
    
    combo7.setPreferredSize(new Dimension(20,20));
    combo7.setForeground(Color.black);
    combo7.setBackground(new Color( 184,151,98));
 
    
    combo8.setPreferredSize(new Dimension(20,20));
    combo8.setForeground(Color.black);
    combo8.setBackground(new Color( 184,151,98));

    
    
    Container cp = getContentPane();
    cp.setLayout(new GridLayout(9,2,10,10));
    cp.setBackground(Color.white);
   // IMAGES CREATION
    
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
    
    
    
  
    
    cp.add(image1);
    cp.add(EmmaJohnsonBtn);
    cp.add(combo1);
   
   cp.add(image2);
   cp.add(FredCartmanBtn);
   cp.add(combo2);
   
    cp.add(image3);
    cp.add(HomerSimpsonBtn);
    cp.add(combo3);
    
    cp.add(image4);
    cp.add(JohnGoodmanBtn);
    cp.add(combo4);
 
   cp.add(image5);
   cp.add(KimDotcomBtn);
   cp.add(combo5);
   
    cp.add(image6);
    cp.add(PatrickReillyBtn);
    cp.add(combo6);
 
    cp.add(image7);
    cp.add(SeanBarrettBtn);
    cp.add(combo7);
   
    cp.add(image8);
    cp.add(JessicaAlbaBtn);
    cp.add(combo8);
    
    cp.add(Help);
    cp.add(cleared);
    cp.add(cast);
   
  }
  
  public void actionPerformed(ActionEvent ev){
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
  

  public static void main(String[] args) {
    run(new VotingpageGUI(), 750, 760);
  }

  public static void run(JApplet applet, int width, int height) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(applet);
    frame.setSize(width, height);
    frame.setTitle("Voting Page");
    applet.init();
    applet.start();
    frame.setVisible(true);
    frame.setBackground(Color.white);
    //frame.setResizable(false);
  }
} ///:~

