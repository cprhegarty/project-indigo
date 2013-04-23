package com.project.voting;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Results extends JFrame {

	Connect connect = new Connect();

	static final long serialVersionUID = 1L;

	JPanel contentPane;

	JLabel resultslbl;
	JTextArea results;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Results frame = new Results();
					frame.setTitle("Results");

					frame.getContentPane().setBackground(Color.WHITE);

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Results() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(0, 0, 550, 560);

		contentPane = createContentPane();
		setContentPane(contentPane);
		
		//contentPane.setLayout(new GridLayout(0,1));

		/*String data[][] = {{"vinod","BCA","A"},{"Raju","MCA","b"},
				   {"Ranjan","MBA","c"},{"Rinku","BCA","d"}};
		String col[] = {"fname"};
		JTable results = new JTable(data, col);*/
		
		JTextArea results = new JTextArea();
		

		resultslbl = new JLabel();
		resultslbl.setText("Results:");

		contentPane.add(resultslbl);
		contentPane.add(results);
	}

	private JPanel createContentPane() {

		JPanel pane = new JPanel();

		return pane;
	}

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
					String can1 =connect.rs.getString(1);
					System.out.println("can1: " + can1);
					System.out.println("Kim Dotcom");
				}
				
				if (i==2)
				{
					String can2 =connect.rs.getString(1);
					//System.out.println("can2: " + can2);
					System.out.println("Seated: ");
					System.out.println("Emma Johnson");
				}
				
				if (i==3)
				{
					String can3 =connect.rs.getString(1);
					System.out.println("can3: " + can3);
					System.out.println("Fred Cartman");
				}
				
				if (i==4)
				{
					String can4 =connect.rs.getString(1);
					System.out.println("can4: " + can4);
					System.out.println("Homer Simpson");
				}
				
				if (i==5)
				{
					String can5 =connect.rs.getString(1);
					System.out.println("can5: " + can5);
					System.out.println("John Goodman");
				}
				
				if (i==6)
				{
					String can6 =connect.rs.getString(1);
					System.out.println("can6: " + can6);
					System.out.println("Homer Simpson");
				}
				
				if (i==7)
				{
					String can7 =connect.rs.getString(1);
					System.out.println("can7: " + can7);
					System.out.println("Sean Barrett");
				}
				
				if (i==8)
				{
					String can8 =connect.rs.getString(1);
					System.out.println("can8: " + can8);
					System.out.println("Jessica Alba");
				}
				
				
				
				total++;
				i++;
				quota = total / seats;
				  
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
