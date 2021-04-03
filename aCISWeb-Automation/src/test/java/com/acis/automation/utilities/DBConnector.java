package com.acis.automation.utilities;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * This class is used for DB connection creation
 * 
 */
public class DBConnector {

	public Connection getSQLConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Connecting to database...");

			con = DriverManager.getConnection("jdbc:mysql://E-DEV-LMS-DB.inspiredlms.com", "ilmsuser", "ilmsuser");
		      System.out.println("Connected  to database..." +con.getSchema());

			
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	public static void main(String args[])
	{
		DBConnector db = new DBConnector();
		db.getSQLConnection();
	}

}
