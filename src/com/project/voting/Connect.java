package com.project.voting;


import java.sql.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.*;

import javax.swing.JFrame;

import oracle.jdbc.driver.*; //make sure this is in classpath

	
	public class Connect 
	{
	    Connection con;
	    PreparedStatement pst;
	    ResultSet rs;
	    /*String servername = "localhost";
	    String portnumber = "1521";
	    String sid = "xe";
	    */
	    
	    Connect()
	    {
	        try{
	        	
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "robindigo");
	                        pst=con.prepareStatement("select * from voters where vtrid=? and password=?");
	             
	           }
	        catch (Exception e) 
	        {
	            System.out.println(e);
	        }
	    }
	    
	        //username,password
	    public Boolean checkLogin(String vtrid, String password)
	    {
	        try {
	                        
	            pst.setString(1, vtrid); 
	            pst.setString(2, password);  
	           
	            //executes the prepared statement
	            rs=pst.executeQuery();
	            if(rs.next())
	            {
	                //TRUE if the query finds any corresponding data
	                return true;
	            }
	            else
	            {
	                return false;
	            }
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            System.out.println("error while validating"+e);
	            return false;
	        }
	}
	}