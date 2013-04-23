package com.project.voting;

import java.sql.*;

public class Connect {
	Connection con;
	PreparedStatement pst;
	ResultSet rs; //Stores query result

	Connect() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver"); //dB driver which is included as .jar file in project
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", //Change these if using different account, port, or service
					"robindigo");

			//Checks username and password in voters table and only returns voters who have not voted
			pst = con
					.prepareStatement("select * from voters where vtrid=? and password=? and voted is null");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public Boolean checkLogin(String vtrid, String password) {
		try {

			pst.setString(1, vtrid);
			pst.setString(2, password);

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
