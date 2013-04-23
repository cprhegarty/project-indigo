package com.project.voting;

import java.sql.*;

public class AdminConnect {
	Connection con;
	PreparedStatement pst;
	ResultSet rs; //Stores query result

	AdminConnect() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver"); //dB driver which is included as .jar file in project
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system",  //Change these if using different account, port, or service
					"robindigo");

			pst = con
					.prepareStatement("select * from administrators where alog=? and pass=?"); //Checks username and password in administrators table

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public Boolean checkLogin(String alog, String pass) {  
		try {

			pst.setString(1, alog);
			pst.setString(2, pass);

			// executes the prepared statement
			rs = pst.executeQuery();
			if (rs.next()) {
				// TRUE if the query finds any corresponding data
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error while validating" + e);
			return false;
		}
	}

}
