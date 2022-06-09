package com.stg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionCheck {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/sys";
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, "root", "Root123!");
			//System.out.println(connection != null ? "connection established" : "connection failed");
			/*
			 * Statement stmt = connection.createStatement(); ResultSet rs =
			 * stmt.executeQuery("select * from EmployeeData"); while (rs.next())
			 * System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
			 * rs.getString(3)); connection.close();
			 */

		} catch (ClassNotFoundException cnfe) {
			System.out.println("There is no respective jars : " + cnfe.getMessage());
		} catch (SQLException se) {// Catching SQL Exception
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}

		/*
		 * finally { try { connection.close(); } catch (SQLException e) {
		 * e.printStackTrace(); } }
		 */
		return connection;
	}
	}
