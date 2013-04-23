package com.project.voting;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
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

	//Candidates
	int votecan1;
	int votecan2;
	int votecan3;
	int votecan4;
	int votecan5;
	int votecan6;
	int votecan7;
	int votecan8;
	
	int quota = 7;
	int elected = 0;

	//GUI components
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
		contentPane.setLayout(new GridLayout(9, 2, 10, 10)); //Layout
		contentPane.setBackground(Color.white);

		String text = "";

		field1.setText(text);

		ImageIcon soundImg = new ImageIcon("images/sound.png");
		EmmaJohnsonBtn = new JButton(soundImg);
		EmmaJohnsonBtn.setBorder(null);
		EmmaJohnsonBtn
				.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		EmmaJohnsonBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
		EmmaJohnsonBtn.addActionListener(this);
		EmmaJohnsonBtn.setLocation(10, 10);
		EmmaJohnsonBtn.setBorderPainted(false);
		EmmaJohnsonBtn.setBackground(Color.white);

		ImageIcon soundImg2 = new ImageIcon("images/sound.png");
		FredCartmanBtn = new JButton(soundImg2);
		FredCartmanBtn.setBorder(null);
		FredCartmanBtn
				.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		FredCartmanBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
		FredCartmanBtn.addActionListener(this);
		FredCartmanBtn.setBorderPainted(false);
		FredCartmanBtn.setBackground(Color.white);

		ImageIcon soundImg3 = new ImageIcon("images/sound.png");
		HomerSimpsonBtn = new JButton(soundImg3);
		HomerSimpsonBtn.setBorder(null);
		HomerSimpsonBtn.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		HomerSimpsonBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
		HomerSimpsonBtn.addActionListener(this);
		HomerSimpsonBtn.setBorderPainted(false);
		HomerSimpsonBtn.setBackground(Color.white);

		ImageIcon soundImg4 = new ImageIcon("images/sound.png");
		JohnGoodmanBtn = new JButton(soundImg4);
		JohnGoodmanBtn.setBorder(null);
		JohnGoodmanBtn
				.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JohnGoodmanBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
		JohnGoodmanBtn.addActionListener(this);
		JohnGoodmanBtn.setBorderPainted(false);
		JohnGoodmanBtn.setBackground(Color.white);

		ImageIcon soundImg5 = new ImageIcon("images/sound.png");
		KimDotcomBtn = new JButton(soundImg5);
		KimDotcomBtn.setBorder(null);
		KimDotcomBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		KimDotcomBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
		KimDotcomBtn.addActionListener(this);
		KimDotcomBtn.setBorderPainted(false);
		KimDotcomBtn.setBackground(Color.white);

		ImageIcon soundImg6 = new ImageIcon("images/sound.png");
		PatrickReillyBtn = new JButton(soundImg6);
		PatrickReillyBtn.setBorder(null);
		PatrickReillyBtn.setCursor(Cursor
				.getPredefinedCursor(Cursor.HAND_CURSOR));
		PatrickReillyBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
		PatrickReillyBtn.addActionListener(this);
		PatrickReillyBtn.setBorderPainted(false);
		PatrickReillyBtn.setBackground(Color.white);

		ImageIcon soundImg7 = new ImageIcon("images/sound.png");
		SeanBarrettBtn = new JButton(soundImg7);
		SeanBarrettBtn.setBorder(null);
		SeanBarrettBtn
				.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SeanBarrettBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
		SeanBarrettBtn.addActionListener(this);
		SeanBarrettBtn.setBorderPainted(false);
		SeanBarrettBtn.setBackground(Color.white);

		ImageIcon soundImg8 = new ImageIcon("images/sound.png");
		JessicaAlbaBtn = new JButton(soundImg8);
		JessicaAlbaBtn.setBorder(null);
		JessicaAlbaBtn
				.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JessicaAlbaBtn.setPressedIcon(new ImageIcon("images/sound2.png"));
		JessicaAlbaBtn.addActionListener(this);
		JessicaAlbaBtn.setBorderPainted(false);
		JessicaAlbaBtn.setBackground(Color.white);

		ImageIcon test1 = new ImageIcon("images/Emma Johnson.png");
		JLabel image1 = new JLabel(test1);

		ImageIcon test2 = new ImageIcon("images/Fred Cartman.png");
		JLabel image2 = new JLabel(test2);

		ImageIcon test3 = new ImageIcon("images/Homer Simpson.png");
		JLabel image3 = new JLabel(test3);

		ImageIcon test4 = new ImageIcon("images/John Goodman.png");
		JLabel image4 = new JLabel(test4);

		ImageIcon test5 = new ImageIcon("images/Kim Dotcom.png");
		JLabel image5 = new JLabel(test5);

		ImageIcon test6 = new ImageIcon("images/Patrick Reilly.png");
		JLabel image6 = new JLabel(test6);

		ImageIcon test7 = new ImageIcon("images/Sean Barrett.png");
		JLabel image7 = new JLabel(test7);

		ImageIcon test8 = new ImageIcon("images/Jessica Alba.png");
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
		votecan1 = Integer.parseInt(can1);

		if (votecan1 > quota && elected < 3)// where vote will be greater than
											// quota
		{
			elected++;
			System.out.println("elected: " + elected);
			field1.setText("Elected");
			Connect connect = new Connect();
			try {
				connect.pst = connect.con
						.prepareStatement("update candidates set seated=1 where fname = 'Emma' ");
				connect.rs = connect.pst.executeQuery();

				// Fred Cartman second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where Emma_Johnson = 1 and fred_cartman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int ej_secpref1 = connect.rs.getInt(1);
					System.out.println("S: " + ej_secpref1);

					int ej_second_counter1 = Integer.parseInt(can2);
					System.out.println("can2: " + can2);
					ej_second_counter1 = ej_second_counter1 + ej_secpref1;
					System.out.println("ej_second_counter: "
							+ ej_second_counter1);

					String testcan2 = Integer.toString(ej_second_counter1);
					can2 = testcan2;
				}

				// /Homer Simpson second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where Emma_Johnson = 1 and homer_simpson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int ej_secpref2 = connect.rs.getInt(1);
					System.out.println("S2: " + ej_secpref2);

					int ej_second_counter2 = Integer.parseInt(can3);
					System.out.println("can3: " + can3);
					ej_second_counter2 = ej_second_counter2 + ej_secpref2;
					System.out.println("secondpref2: " + ej_second_counter2);

					String testcan3 = Integer.toString(ej_second_counter2);
					can3 = testcan3;
				}

				// John Goodman second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where Emma_Johnson = 1 and john_goodman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int ej_secpref3 = connect.rs.getInt(1);
					System.out.println("S3: " + ej_secpref3);

					int ej_second_counter3 = Integer.parseInt(can4);
					System.out.println("can4: " + can4);
					ej_second_counter3 = ej_second_counter3 + ej_secpref3;
					System.out.println("secondpref3: " + ej_second_counter3);

					String testcan4 = Integer.toString(ej_second_counter3);
					can4 = testcan4;
				}

				// Kim Dotcom second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where Emma_Johnson = 1 and kim_dotcom = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int ej_secpref4 = connect.rs.getInt(1);
					System.out.println("S4: " + ej_secpref4);

					int ej_second_counter4 = Integer.parseInt(can5);
					System.out.println("can5: " + can5);
					ej_second_counter4 = ej_second_counter4 + ej_secpref4;
					System.out.println("secondpref4: " + ej_second_counter4);

					String testcan5 = Integer.toString(ej_second_counter4);
					can5 = testcan5;
				}

				// Patrick Reilly second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where Emma_Johnson = 1 and patrick_reilly = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int ej_secpref5 = connect.rs.getInt(1);
					System.out.println("S5: " + ej_secpref5);

					int ej_second_counter5 = Integer.parseInt(can6);
					System.out.println("can6: " + can6);
					ej_second_counter5 = ej_second_counter5 + ej_secpref5;
					System.out.println("secondpref5: " + ej_second_counter5);

					String testcan6 = Integer.toString(ej_second_counter5);
					can6 = testcan6;
				}

				// Sean Barrett second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where Emma_Johnson = 1 and sean_barrett = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int ej_secpref6 = connect.rs.getInt(1);
					System.out.println("S6: " + ej_secpref6);

					int ej_second_counter6 = Integer.parseInt(can7);
					System.out.println("can7: " + can7);
					ej_second_counter6 = ej_second_counter6 + ej_secpref6;
					System.out.println("secondpref6: " + ej_second_counter6);

					String testcan7 = Integer.toString(ej_second_counter6);
					can7 = testcan7;
				}

				// Jessica Alba second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where Emma_Johnson = 1 and jessica_alba = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int ej_secpref7 = connect.rs.getInt(1);
					System.out.println("S7: " + ej_secpref7);

					int ej_second_counter7 = Integer.parseInt(can8);
					System.out.println("can8: " + can8);
					ej_second_counter7 = ej_second_counter7 + ej_secpref7;
					System.out.println("secondpref7: " + ej_second_counter7);

					String testcan8 = Integer.toString(ej_second_counter7);
					can8 = testcan8;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				{

				}

			}

		}
		field1.setFont(myfont);
		field1.setHorizontalAlignment(JTextField.CENTER);
		field1.setEditable(false);
		contentPane.add(field1);

		contentPane.add(image2);
		contentPane.add(FredCartmanBtn);
		field2.setText(can2);
		votecan2 = Integer.parseInt(can2);

		if (votecan2 > 6 && elected < 3)// where vote will be greater than quota
		{
			elected++;
			System.out.println("elected: " + elected);
			field2.setText("Elected");

			try {

				// Emma Johnson second preference

				Connect connect = new Connect();
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where fred_cartman = 1 and emma_johnson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int fc_secpref1 = connect.rs.getInt(1);
					System.out.println("S17: " + fc_secpref1);

					int fc_second_counter1 = Integer.parseInt(can1);
					System.out.println("dhgchjsgdchjggchjsdh: " + can1);
					fc_second_counter1 = fc_second_counter1 + fc_secpref1;
					System.out.println("secondpref7: " + fc_second_counter1);

					String testcan18 = Integer.toString(fc_second_counter1);
					can1 = testcan18;
				}

				// Fred Cartman second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where fred_cartman = 1 and homer_simpson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int fc_secpref2 = connect.rs.getInt(1);
					System.out.println("S: " + fc_secpref2);

					int fc_second_counter2 = Integer.parseInt(can3);
					System.out.println("can3: " + can3);
					fc_second_counter2 = fc_second_counter2 + fc_secpref2;
					System.out.println("secondpref: " + fc_second_counter2);

					String testcan12 = Integer.toString(fc_second_counter2);
					can3 = testcan12;
				}

				// /Homer Simpson second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where fred_cartman = 1 and john_goodman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int fc_secpref3 = connect.rs.getInt(1);
					System.out.println("S2: " + fc_secpref3);

					int fc_second_counter3 = Integer.parseInt(can3);
					System.out.println("can3: " + can3);
					fc_second_counter3 = fc_second_counter3 + fc_secpref3;
					System.out.println("secondpref2: " + fc_second_counter3);

					String testcan13 = Integer.toString(fc_second_counter3);
					can3 = testcan13;
				}

				// John Goodman second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where fred_cartman = 1 and kim_dotcom = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int fc_secpref4 = connect.rs.getInt(1);
					System.out.println("S3: " + fc_secpref4);

					int fc_second_counter4 = Integer.parseInt(can4);
					System.out.println("can4: " + can4);
					fc_second_counter4 = fc_second_counter4 + fc_secpref4;
					System.out.println("secondpref3: " + fc_second_counter4);

					String testcan14 = Integer.toString(fc_second_counter4);
					can4 = testcan14;
				}

				// Kim Dotcom second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where fred_cartman = 1 and patrick_reilly = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int fc_secpref5 = connect.rs.getInt(1);
					System.out.println("S4: " + fc_secpref5);

					int fc_second_counter5 = Integer.parseInt(can5);
					System.out.println("can5: " + can5);
					fc_second_counter5 = fc_second_counter5 + fc_secpref5;
					System.out.println("secondpref4: " + fc_second_counter5);

					String testcan15 = Integer.toString(fc_second_counter5);
					can5 = testcan15;
				}

				// Patrick Reilly second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where fred_cartman = 1 and sean_barrett = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int fc_secpref6 = connect.rs.getInt(1);
					System.out.println("S5: " + fc_secpref6);

					int fc_second_counter6 = Integer.parseInt(can6);
					System.out.println("can6: " + can6);
					fc_second_counter6 = fc_second_counter6 + fc_secpref6;
					System.out.println("secondpref5: " + fc_second_counter6);

					String testcan16 = Integer.toString(fc_second_counter6);
					can6 = testcan16;
				}

				// Sean Barrett second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where fred_cartman = 1 and jessica_alba = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int fc_secpref7 = connect.rs.getInt(1);
					System.out.println("S6: " + fc_secpref7);

					int fc_second_counter7 = Integer.parseInt(can7);
					System.out.println("can7: " + can7);
					fc_second_counter7 = fc_second_counter7 + fc_secpref7;
					System.out.println("secondpref6: " + fc_second_counter7);

					String testcan17 = Integer.toString(fc_second_counter7);
					can7 = testcan17;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				{

				}

			}
		}
		field2.setFont(myfont);
		field2.setHorizontalAlignment(JTextField.CENTER);
		field2.setEditable(false);
		contentPane.add(field2);

		contentPane.add(image3);
		contentPane.add(HomerSimpsonBtn);
		field3.setText(can3);
		votecan3 = Integer.parseInt(can3);

		if (votecan3 > 1 && elected < 3)// where vote will be greater than quota
		{
			elected++;
			System.out.println("elected: " + elected);
			field3.setText("Elected");

			try {

				Connect connect = new Connect();
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where homer_simpson = 1 and emma_johnson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s3 = connect.rs.getInt(1);
					System.out.println("S3: " + s3);

					int secondpref3 = Integer.parseInt(can4);
					System.out.println("can4: " + can4);
					secondpref3 = secondpref3 + s3;
					System.out.println("secondpref3: " + secondpref3);

					String testcan4 = Integer.toString(secondpref3);
					can4 = testcan4;
				}

				// fred cartman second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where homer_simpson = 1 and fred_cartman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s = connect.rs.getInt(1);
					System.out.println("S: " + s);

					int secondpref = Integer.parseInt(can2);
					System.out.println("can2: " + can2);
					secondpref = secondpref + s;
					System.out.println("secondpref: " + secondpref);

					String testcan2 = Integer.toString(secondpref);
					can2 = testcan2;
				}

				// John Goodman second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where homer_simpson = 1 and john_goodman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s3 = connect.rs.getInt(1);
					System.out.println("S3: " + s3);

					int secondpref3 = Integer.parseInt(can4);
					System.out.println("can4: " + can4);
					secondpref3 = secondpref3 + s3;
					System.out.println("secondpref3: " + secondpref3);

					String testcan4 = Integer.toString(secondpref3);
					can4 = testcan4;
				}

				// Kim Dotcom second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where homer_simpson = 1 and kim_dotcom = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s4 = connect.rs.getInt(1);
					System.out.println("S4: " + s4);

					int secondpref4 = Integer.parseInt(can5);
					System.out.println("can5: " + can5);
					secondpref4 = secondpref4 + s4;
					System.out.println("secondpref4: " + secondpref4);

					String testcan5 = Integer.toString(secondpref4);
					can5 = testcan5;
				}

				// Patrick Reilly second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where homer_simpson = 1 and patrick_reilly = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s5 = connect.rs.getInt(1);
					System.out.println("S5: " + s5);

					int secondpref5 = Integer.parseInt(can6);
					System.out.println("can6: " + can6);
					secondpref5 = secondpref5 + s5;
					System.out.println("secondpref5: " + secondpref5);

					String testcan6 = Integer.toString(secondpref5);
					can6 = testcan6;
				}

				// Sean Barrett second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where homer_simpson = 1 and sean_barrett = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s6 = connect.rs.getInt(1);
					System.out.println("S6: " + s6);

					int secondpref6 = Integer.parseInt(can7);
					System.out.println("can7: " + can7);
					secondpref6 = secondpref6 + s6;
					System.out.println("secondpref6: " + secondpref6);

					String testcan7 = Integer.toString(secondpref6);
					can7 = testcan7;
				}

				// Jessica Alba second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where homer_simpson = 1 and jessica_alba = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s7 = connect.rs.getInt(1);
					System.out.println("S7: " + s7);

					int secondpref7 = Integer.parseInt(can8);
					System.out.println("can8: " + can8);
					secondpref7 = secondpref7 + s7;
					System.out.println("secondpref7: " + secondpref7);

					String testcan8 = Integer.toString(secondpref7);
					can8 = testcan8;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				{

				}

			}

		}
		field3.setFont(myfont);
		field3.setHorizontalAlignment(JTextField.CENTER);
		field3.setEditable(false);
		contentPane.add(field3);

		contentPane.add(image4);
		contentPane.add(JohnGoodmanBtn);
		field4.setText(can4);
		votecan4 = Integer.parseInt(can4);

		if (votecan4 > 7 && elected < 3)// where vote will be greater than quota
		{
			elected++;
			System.out.println("elected: " + elected);
			field4.setText("Elected");

			try {

				// emma johnson
				Connect connect = new Connect();
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where john_goodman = 1 and emma_johnson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s3 = connect.rs.getInt(1);
					System.out.println("S3: " + s3);

					int secondpref3 = Integer.parseInt(can1);
					System.out.println("can4: " + can1);
					secondpref3 = secondpref3 + s3;
					System.out.println("secondpref3: " + secondpref3);

					String testcan4 = Integer.toString(secondpref3);
					can1 = testcan4;
				}

				// Fred Cartman second preferences

				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where john_goodman = 1 and fred_cartman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s = connect.rs.getInt(1);
					System.out.println("S: " + s);

					int secondpref = Integer.parseInt(can2);
					System.out.println("can2: " + can2);
					secondpref = secondpref + s;
					System.out.println("secondpref: " + secondpref);

					String testcan2 = Integer.toString(secondpref);
					can2 = testcan2;
				}

				// /Homer Simpson second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where john_goodman = 1 and homer_simpson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s2 = connect.rs.getInt(1);
					System.out.println("S2: " + s2);

					int secondpref2 = Integer.parseInt(can3);
					System.out.println("can3: " + can3);
					secondpref2 = secondpref2 + s2;
					System.out.println("secondpref2: " + secondpref2);

					String testcan3 = Integer.toString(secondpref2);
					can3 = testcan3;
				}

				// Kim Dotcom second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where john_goodman = 1 and kim_dotcom = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s4 = connect.rs.getInt(1);
					System.out.println("S4: " + s4);

					int secondpref4 = Integer.parseInt(can5);
					System.out.println("can5: " + can5);
					secondpref4 = secondpref4 + s4;
					System.out.println("secondpref4: " + secondpref4);

					String testcan5 = Integer.toString(secondpref4);
					can5 = testcan5;
				}

				// Patrick Reilly second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where john_goodman = 1 and patrick_reilly = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s5 = connect.rs.getInt(1);
					System.out.println("S5: " + s5);

					int secondpref5 = Integer.parseInt(can6);
					System.out.println("can6: " + can6);
					secondpref5 = secondpref5 + s5;
					System.out.println("secondpref5: " + secondpref5);

					String testcan6 = Integer.toString(secondpref5);
					can6 = testcan6;
				}

				// Sean Barrett second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where john_goodman = 1 and sean_barrett = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s6 = connect.rs.getInt(1);
					System.out.println("S6: " + s6);

					int secondpref6 = Integer.parseInt(can7);
					System.out.println("can7: " + can7);
					secondpref6 = secondpref6 + s6;
					System.out.println("secondpref6: " + secondpref6);

					String testcan7 = Integer.toString(secondpref6);
					can7 = testcan7;
				}

				// Jessica Alba second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where john_goodman = 1 and jessica_alba = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s7 = connect.rs.getInt(1);
					System.out.println("S7: " + s7);

					int secondpref7 = Integer.parseInt(can8);
					System.out.println("can8: " + can8);
					secondpref7 = secondpref7 + s7;
					System.out.println("secondpref7: " + secondpref7);

					String testcan8 = Integer.toString(secondpref7);
					can8 = testcan8;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				{

				}

			}
		}
		field4.setFont(myfont);
		field4.setHorizontalAlignment(JTextField.CENTER);
		field4.setEditable(false);
		contentPane.add(field4);

		contentPane.add(image5);
		contentPane.add(KimDotcomBtn);
		field5.setText(can5);
		votecan5 = Integer.parseInt(can5);

		if (votecan5 > 7 && elected < 3)// where vote will be greater than quota
		{
			elected++;
			System.out.println("elected: " + elected);
			field5.setText("Elected");

			try {

				// Emma_Johnson second preference
				Connect connect = new Connect();
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where Emma_Johnson = 1 and emma_johnson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s4 = connect.rs.getInt(1);
					System.out.println("S4: " + s4);

					int secondpref4 = Integer.parseInt(can1);
					System.out.println("can1: " + can1);
					secondpref4 = secondpref4 + s4;
					System.out.println("secondpref4: " + secondpref4);

					String testcan5 = Integer.toString(secondpref4);
					can1 = testcan5;
				}

				// Fred Cartman second preferences

				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where kim_dotcom = 1 and fred_cartman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s = connect.rs.getInt(1);
					System.out.println("S: " + s);

					int secondpref = Integer.parseInt(can2);
					System.out.println("can2: " + can2);
					secondpref = secondpref + s;
					System.out.println("secondpref: " + secondpref);

					String testcan2 = Integer.toString(secondpref);
					can2 = testcan2;
				}

				// /Homer Simpson second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where kim_dotcom = 1 and homer_simpson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s2 = connect.rs.getInt(1);
					System.out.println("S2: " + s2);

					int secondpref2 = Integer.parseInt(can3);
					System.out.println("can3: " + can3);
					secondpref2 = secondpref2 + s2;
					System.out.println("secondpref2: " + secondpref2);

					String testcan3 = Integer.toString(secondpref2);
					can3 = testcan3;
				}

				// John Goodman second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where kim_dotcom = 1 and john_goodman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s3 = connect.rs.getInt(1);
					System.out.println("S3: " + s3);

					int secondpref3 = Integer.parseInt(can4);
					System.out.println("can4: " + can4);
					secondpref3 = secondpref3 + s3;
					System.out.println("secondpref3: " + secondpref3);

					String testcan4 = Integer.toString(secondpref3);
					can4 = testcan4;
				}

				// Patrick Reilly second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where kim_dotcom = 1 and patrick_reilly = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s5 = connect.rs.getInt(1);
					System.out.println("S5: " + s5);

					int secondpref5 = Integer.parseInt(can6);
					System.out.println("can6: " + can6);
					secondpref5 = secondpref5 + s5;
					System.out.println("secondpref5: " + secondpref5);

					String testcan6 = Integer.toString(secondpref5);
					can6 = testcan6;
				}

				// Sean Barrett second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where kim_dotcom = 1 and sean_barrett = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s6 = connect.rs.getInt(1);
					System.out.println("S6: " + s6);

					int secondpref6 = Integer.parseInt(can7);
					System.out.println("can7: " + can7);
					secondpref6 = secondpref6 + s6;
					System.out.println("secondpref6: " + secondpref6);

					String testcan7 = Integer.toString(secondpref6);
					can7 = testcan7;
				}

				// Jessica Alba second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where kim_dotcom = 1 and jessica_alba = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s7 = connect.rs.getInt(1);
					System.out.println("S7: " + s7);

					int secondpref7 = Integer.parseInt(can8);
					System.out.println("can8: " + can8);
					secondpref7 = secondpref7 + s7;
					System.out.println("secondpref7: " + secondpref7);

					String testcan8 = Integer.toString(secondpref7);
					can8 = testcan8;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				{

				}

			}

		}
		field5.setFont(myfont);
		field5.setHorizontalAlignment(JTextField.CENTER);
		field5.setEditable(false);
		contentPane.add(field5);

		contentPane.add(image6);
		contentPane.add(PatrickReillyBtn);
		field6.setText(can6);
		votecan6 = Integer.parseInt(can6);

		if (votecan6 > 7 && elected < 3)// where vote will be greater than quota
		{
			elected++;
			System.out.println("elected: " + elected);
			field6.setText("Elected");

			try {

				// Patrick Reilly second preference
				Connect connect = new Connect();
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where patrick_reilly = 1 and Emma_Johnson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s5 = connect.rs.getInt(1);
					System.out.println("S5: " + s5);

					int secondpref5 = Integer.parseInt(can1);
					System.out.println("can1: " + can1);
					secondpref5 = secondpref5 + s5;
					System.out.println("secondpref5: " + secondpref5);

					String testcan6 = Integer.toString(secondpref5);
					can1 = testcan6;
				}

				// Fred Cartman second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where patrick_reilly = 1 and fred_cartman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s = connect.rs.getInt(1);
					System.out.println("S: " + s);

					int secondpref = Integer.parseInt(can2);
					System.out.println("can2: " + can2);
					secondpref = secondpref + s;
					System.out.println("secondpref: " + secondpref);

					String testcan2 = Integer.toString(secondpref);
					can2 = testcan2;
				}

				// /Homer Simpson second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where patrick_reilly = 1 and homer_simpson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s2 = connect.rs.getInt(1);
					System.out.println("S2: " + s2);

					int secondpref2 = Integer.parseInt(can3);
					System.out.println("can3: " + can3);
					secondpref2 = secondpref2 + s2;
					System.out.println("secondpref2: " + secondpref2);

					String testcan3 = Integer.toString(secondpref2);
					can3 = testcan3;
				}

				// John Goodman second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where patrick_reilly = 1 and john_goodman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s3 = connect.rs.getInt(1);
					System.out.println("S3: " + s3);

					int secondpref3 = Integer.parseInt(can4);
					System.out.println("can4: " + can4);
					secondpref3 = secondpref3 + s3;
					System.out.println("secondpref3: " + secondpref3);

					String testcan4 = Integer.toString(secondpref3);
					can4 = testcan4;
				}

				// Kim Dotcom second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where patrick_reilly = 1 and kim_dotcom = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s4 = connect.rs.getInt(1);
					System.out.println("S4: " + s4);

					int secondpref4 = Integer.parseInt(can5);
					System.out.println("can5: " + can5);
					secondpref4 = secondpref4 + s4;
					System.out.println("secondpref4: " + secondpref4);

					String testcan5 = Integer.toString(secondpref4);
					can5 = testcan5;
				}

				// Sean Barrett second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where patrick_reilly = 1 and sean_barrett = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s6 = connect.rs.getInt(1);
					System.out.println("S6: " + s6);

					int secondpref6 = Integer.parseInt(can7);
					System.out.println("can7: " + can7);
					secondpref6 = secondpref6 + s6;
					System.out.println("secondpref6: " + secondpref6);

					String testcan7 = Integer.toString(secondpref6);
					can7 = testcan7;
				}

				// Jessica Alba second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where patrick_reilly = 1 and jessica_alba = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s7 = connect.rs.getInt(1);
					System.out.println("S7: " + s7);

					int secondpref7 = Integer.parseInt(can8);
					System.out.println("can8: " + can8);
					secondpref7 = secondpref7 + s7;
					System.out.println("secondpref7: " + secondpref7);

					String testcan8 = Integer.toString(secondpref7);
					can8 = testcan8;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				{

				}

			}

		}
		field6.setFont(myfont);
		field6.setHorizontalAlignment(JTextField.CENTER);
		field6.setEditable(false);
		contentPane.add(field6);

		contentPane.add(image7);
		contentPane.add(SeanBarrettBtn);
		field7.setText(can7);
		votecan7 = Integer.parseInt(can7);

		if (votecan7 > 7 && elected < 3)// where vote will be greater than quota
		{
			elected++;
			System.out.println("elected: " + elected);
			field7.setText("Elected");

			try {

				// Sean Barrett second preference
				Connect connect = new Connect();
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where sean_barrett = 1 and Emma_Johnson  = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s6 = connect.rs.getInt(1);
					System.out.println("S6: " + s6);

					int secondpref6 = Integer.parseInt(can1);
					System.out.println("can1: " + can1);
					secondpref6 = secondpref6 + s6;
					System.out.println("secondpref6: " + secondpref6);

					String testcan7 = Integer.toString(secondpref6);
					can1 = testcan7;
				}

				// Fred Cartman second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where sean_barrett = 1 and fred_cartman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s = connect.rs.getInt(1);
					System.out.println("S: " + s);

					int secondpref = Integer.parseInt(can2);
					System.out.println("can2: " + can2);
					secondpref = secondpref + s;
					System.out.println("secondpref: " + secondpref);

					String testcan2 = Integer.toString(secondpref);
					can2 = testcan2;
				}

				// /Homer Simpson second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where sean_barrett = 1 and homer_simpson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s2 = connect.rs.getInt(1);
					System.out.println("S2: " + s2);

					int secondpref2 = Integer.parseInt(can3);
					System.out.println("can3: " + can3);
					secondpref2 = secondpref2 + s2;
					System.out.println("secondpref2: " + secondpref2);

					String testcan3 = Integer.toString(secondpref2);
					can3 = testcan3;
				}

				// John Goodman second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where sean_barrett = 1 and john_goodman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s3 = connect.rs.getInt(1);
					System.out.println("S3: " + s3);

					int secondpref3 = Integer.parseInt(can4);
					System.out.println("can4: " + can4);
					secondpref3 = secondpref3 + s3;
					System.out.println("secondpref3: " + secondpref3);

					String testcan4 = Integer.toString(secondpref3);
					can4 = testcan4;
				}

				// Kim Dotcom second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where sean_barrett = 1 and kim_dotcom = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s4 = connect.rs.getInt(1);
					System.out.println("S4: " + s4);

					int secondpref4 = Integer.parseInt(can5);
					System.out.println("can5: " + can5);
					secondpref4 = secondpref4 + s4;
					System.out.println("secondpref4: " + secondpref4);

					String testcan5 = Integer.toString(secondpref4);
					can5 = testcan5;
				}

				// Patrick Reilly second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where sean_barrett = 1 and patrick_reilly = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s5 = connect.rs.getInt(1);
					System.out.println("S5: " + s5);

					int secondpref5 = Integer.parseInt(can6);
					System.out.println("can6: " + can6);
					secondpref5 = secondpref5 + s5;
					System.out.println("secondpref5: " + secondpref5);

					String testcan6 = Integer.toString(secondpref5);
					can6 = testcan6;
				}

				// Jessica Alba second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where sean_barrett = 1 and jessica_alba = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s7 = connect.rs.getInt(1);
					System.out.println("S7: " + s7);

					int secondpref7 = Integer.parseInt(can8);
					System.out.println("can8: " + can8);
					secondpref7 = secondpref7 + s7;
					System.out.println("secondpref7: " + secondpref7);

					String testcan8 = Integer.toString(secondpref7);
					can8 = testcan8;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				{

				}

			}

		}
		field7.setFont(myfont);
		field7.setHorizontalAlignment(JTextField.CENTER);
		field7.setEditable(false);
		contentPane.add(field7);

		contentPane.add(image8);
		contentPane.add(JessicaAlbaBtn);
		field8.setText(can8);
		votecan8 = Integer.parseInt(can8);

		if (votecan8 > 7)// where vote will be greater than quota
		{
			field8.setText("Elected");

			try {

				// Emma_Johnson second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where jessica_alba = 1 and Emma_Johnson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s7 = connect.rs.getInt(1);
					System.out.println("S7: " + s7);

					int secondpref7 = Integer.parseInt(can8);
					System.out.println("can8: " + can8);
					secondpref7 = secondpref7 + s7;
					System.out.println("secondpref7: " + secondpref7);

					String testcan8 = Integer.toString(secondpref7);
					can8 = testcan8;
				}
				// Fred Cartman second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where jessica_alba = 1 and fred_cartman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s = connect.rs.getInt(1);
					System.out.println("S: " + s);

					int secondpref = Integer.parseInt(can2);
					System.out.println("can2: " + can2);
					secondpref = secondpref + s;
					System.out.println("secondpref: " + secondpref);

					String testcan2 = Integer.toString(secondpref);
					can2 = testcan2;
				}

				// /Homer Simpson second preferences
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where jessica_alba = 1 and homer_simpson = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s2 = connect.rs.getInt(1);
					System.out.println("S2: " + s2);

					int secondpref2 = Integer.parseInt(can3);
					System.out.println("can3: " + can3);
					secondpref2 = secondpref2 + s2;
					System.out.println("secondpref2: " + secondpref2);

					String testcan3 = Integer.toString(secondpref2);
					can3 = testcan3;
				}

				// John Goodman second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where jessica_alba = 1 and john_goodman = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s3 = connect.rs.getInt(1);
					System.out.println("S3: " + s3);

					int secondpref3 = Integer.parseInt(can4);
					System.out.println("can4: " + can4);
					secondpref3 = secondpref3 + s3;
					System.out.println("secondpref3: " + secondpref3);

					String testcan4 = Integer.toString(secondpref3);
					can4 = testcan4;
				}

				// Kim Dotcom second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where jessica_alba = 1 and kim_dotcom = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s4 = connect.rs.getInt(1);
					System.out.println("S4: " + s4);

					int secondpref4 = Integer.parseInt(can5);
					System.out.println("can5: " + can5);
					secondpref4 = secondpref4 + s4;
					System.out.println("secondpref4: " + secondpref4);

					String testcan5 = Integer.toString(secondpref4);
					can5 = testcan5;
				}

				// Patrick Reilly second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where jessica_alba = 1 and patrick_reilly = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s5 = connect.rs.getInt(1);
					System.out.println("S5: " + s5);

					int secondpref5 = Integer.parseInt(can6);
					System.out.println("can6: " + can6);
					secondpref5 = secondpref5 + s5;
					System.out.println("secondpref5: " + secondpref5);

					String testcan6 = Integer.toString(secondpref5);
					can6 = testcan6;
				}

				// Sean Barrett second preference
				connect.pst = connect.con
						.prepareStatement("select count (rowid) from voterprefs where jessica_alba = 1 and sean_barrett = 2");
				connect.rs = connect.pst.executeQuery();

				while (connect.rs.next()) {
					System.out.println(connect.rs.getInt(1));
					int s6 = connect.rs.getInt(1);
					System.out.println("S6: " + s6);

					int secondpref6 = Integer.parseInt(can7);
					System.out.println("can7: " + can7);
					secondpref6 = secondpref6 + s6;
					System.out.println("secondpref6: " + secondpref6);

					String testcan7 = Integer.toString(secondpref6);
					can7 = testcan7;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				{

				}

			}

		}
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

	public Container createImageDisplay() {
		JPanel imageDisplay = new JPanel();

		return imageDisplay;
	}

	@Override
	public void actionPerformed(ActionEvent ev) {

		if (ev.getSource() == backBtn) {

			dispose();
			LoginGUI frame = new LoginGUI();
			frame.setTitle("Login");
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setVisible(true);
		}
		if (ev.getSource() == EmmaJohnsonBtn) {

			try {
				AudioInputStream audioInputStream = AudioSystem
						.getAudioInputStream(new File("sounds/Emma Johnson.wav")
								.getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			} catch (Exception ex) {
				System.out.println("Error with playing sound.");
				ex.printStackTrace();
			}

		}
		if (ev.getSource() == FredCartmanBtn) {

			try {
				AudioInputStream audioInputStream = AudioSystem
						.getAudioInputStream(new File("sounds/Fred Cartman.wav")
								.getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			} catch (Exception ex) {
				System.out.println("Error with playing sound.");
				ex.printStackTrace();
			}

		}
		if (ev.getSource() == HomerSimpsonBtn) {

			try {
				AudioInputStream audioInputStream = AudioSystem
						.getAudioInputStream(new File(
								"sounds/Homer Simpson.wav").getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			} catch (Exception ex) {
				System.out.println("Error with playing sound.");
				ex.printStackTrace();
			}

		}
		if (ev.getSource() == JessicaAlbaBtn) {

			try {
				AudioInputStream audioInputStream = AudioSystem
						.getAudioInputStream(new File("sounds/Jessica Alba.wav")
								.getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			} catch (Exception ex) {
				System.out.println("Error with playing sound.");
				ex.printStackTrace();
			}

		}
		if (ev.getSource() == JohnGoodmanBtn) {

			try {
				AudioInputStream audioInputStream = AudioSystem
						.getAudioInputStream(new File("sounds/John Goodman.wav")
								.getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			} catch (Exception ex) {
				System.out.println("Error with playing sound.");
				ex.printStackTrace();
			}

		}
		if (ev.getSource() == KimDotcomBtn) {

			try {
				AudioInputStream audioInputStream = AudioSystem
						.getAudioInputStream(new File("sounds/Kim Dotcom.wav")
								.getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			} catch (Exception ex) {
				System.out.println("Error with playing sound.");
				ex.printStackTrace();
			}

		}
		if (ev.getSource() == PatrickReillyBtn) {

			try {
				AudioInputStream audioInputStream = AudioSystem
						.getAudioInputStream(new File(
								"sounds/Patrick Reilly.wav").getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			} catch (Exception ex) {
				System.out.println("Error with playing sound.");
				ex.printStackTrace();
			}

		}
		if (ev.getSource() == SeanBarrettBtn) {
			try {
				AudioInputStream audioInputStream = AudioSystem
						.getAudioInputStream(new File("sounds/Sean Barrett.wav")
								.getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			} catch (Exception ex) {
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

			Statement stmt = connect.con.createStatement();

			int seats = 3;
			int quota = 0;
			int total = 0;
			int i = 1; // column

			String rowid = "AAAE/wAABAAAK=5AAI";

			connect.rs = stmt.executeQuery
					("select count(*) from voterprefs where kim_dotcom = 1 union all select count(*) from voterprefs where emma_johnson = 1 union all select count(*) from voterprefs where fred_cartman = 1 union all select count(*) from voterprefs where john_goodman = 1 union all select count(*) from voterprefs where patrick_reilly = 1 union all select count(*) from voterprefs where homer_simpson = 1 union all select count(*) from voterprefs where sean_barrett = 1 union all select count(*) from voterprefs where jessica_alba = 1");

			while (connect.rs.next()) {
				// System.out.println(connect.rs.getInt(1));

				if (i == 1) {
					can5 = connect.rs.getString(1);
					System.out.println("can5: " + can5);
					System.out.println("Kim Dotcom");
					field1.setText(can5);
				}

				if (i == 2) {
					can1 = connect.rs.getString(1);
					System.out.println("can1: " + can1);

					System.out.println("Emma Johnson");

				}

				if (i == 3) {
					can2 = connect.rs.getString(1);
					System.out.println("can2: " + can2);
					System.out.println("Fred Cartman");

				}

				if (i == 4) {
					can3 = connect.rs.getString(1);
					System.out.println("can3: " + can3);
					System.out.println("Homer Simpson");
				}

				if (i == 5) {
					can4 = connect.rs.getString(1);
					System.out.println("can4: " + can4);
					System.out.println("John Goodman");
				}

				if (i == 6) {
					can6 = connect.rs.getString(1);
					System.out.println("can6: " + can6);
					System.out.println("Patrick Reilly");
				}

				if (i == 7) {
					can7 = connect.rs.getString(1);
					System.out.println("can7: " + can7);
					System.out.println("Sean Barrett");
				}

				if (i == 8) {
					can8 = connect.rs.getString(1);
					System.out.println("can8: " + can8);
					System.out.println("Jessica Alba");
				}

				total++;
				i++;
				// quota = total / seats;
				quota = 7;

				System.out.println("quota" + quota);

			}

			System.out.println("Total: " + total);
			System.out.println("Quota: " + quota);
			connect.pst.close();
			connect.con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}