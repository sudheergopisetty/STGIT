package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckMyConnection {
	


	public static  Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sql_demo";

			con = DriverManager.getConnection(url, "root", "Root123!");
			Statement stmt = con.createStatement();
			//System.out.println(stmt != null ? "connection established" : "not connected");
//			long re = stmt.executeUpdate("delete from emp1;");
//			System.out.println(re);

			/*
			 * ResultSet rs = stmt.executeQuery("select * from EmployeeData");
			 * 
			 * while (rs.next()) System.out.println(rs.getInt(1) + "  " + rs.getString(2) +
			 * "  " + rs.getString(3));
			 */
		} catch (ClassNotFoundException cnfe) {
			System.out.println("There is no respective jars : " + cnfe.getMessage());
		} catch (SQLException se) {// Catching SQL Exception
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
	}
}
