package com.project.voting;


import java.sql.*;
import java.awt.Color;
import java.io.*;
import java.lang.*;
import oracle.jdbc.driver.*; //make sure this is in classpath


public class AdminLogin {
  public static void main (String args [])
	throws SQLException, IOException {
    try {
	  Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("driver loaded");
    } catch (ClassNotFoundException e) {
	    System.out.println ("Could not load the driver");
	}
    String servername = "localhost";
    String portnumber = "1521";
    String sid = "xe";
    String url = "jdbc:oracle:thin:@" + servername + ":" + portnumber + ":" + sid;
    String user, pass;
	
	user = readEntry("userid  : ");
	pass = readEntry("password: ");
    System.out.println(url);
    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	System.out.println ("before connection");

    Connection conn = DriverManager.getConnection(url, user, pass);
	System.out.println ("after connection");
    Statement stmt = conn.createStatement ();

    ResultSet rset = stmt.executeQuery
	("select * from administrators");
    while (rset.next()) {
	System.out.println(rset.getString(1) + " " +
	                   rset.getString(2));
    }
    stmt.close();
    conn.close();
  }
//readEntry function -- to read input string
static String readEntry(String prompt) {
	   try {
		 StringBuffer buffer = new StringBuffer();
		 System.out.print(prompt);
		 System.out.flush();
		 int c = System.in.read();
		 while (c != '\n' && c != -1) {
		   buffer.append((char)c);
		   c = System.in.read();
	     }
	     return buffer.toString().trim();
      }  catch (IOException e) {
		 return "";
	     }
  }
}
