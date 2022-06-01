package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Employ;

public class EmployInterfaceImpl implements EmployInterface{

	@Override
	public List<Employ> readAllEmployers() {
		Connection connection = CheckMyConnection.getConnection();
		String sqlQuery = "SELECT * FROM USER_DETAILS";
		Statement statement = null;
		ResultSet resultSet = null;
		List<Employ> employs =new ArrayList<Employ>();
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			Employ employ = null;
			while (resultSet.next()){
				employ = new Employ();
				employ.setEmploy_id(resultSet.getInt(1));
				employ.setEmploy_Name(resultSet.getString(2));
				employ.setEmploy_Password(resultSet.getString(3));
				employs.add(employ);
			}
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		return employs;
	}

	@Override
	public Employ createEmploy(Employ user) {
		Connection connection = CheckMyConnection.getConnection();
		String sqlQuery = "INSERT INTO USER_DETAILS  (User_name,User_password)VALUES(?,?)";
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, user.getEmploy_Name());
			statement.setString(2, user.getEmploy_Password());
			
			int ans = statement.executeUpdate();
			if(ans != 0) {
				return user;
			}else {
				//
			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		return user;
	}

	@Override
	public Employ readByEmployId(int employId) {
		Connection connection = CheckMyConnection.getConnection();
		String sqlQuery  = "SELECT * FROM USER_DETAILS WHERE User_id = \""+employId+"\";";
		Statement statement = null;
		ResultSet resultSet = null;
		Employ employ = null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			
			while(resultSet.next()) {
				employ =new Employ();
				employ.setEmploy_id(resultSet.getInt(1));
				employ.setEmploy_Name(resultSet.getString(2));
				employ.setEmploy_Password(resultSet.getString(3));
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return employ;
	}

	@Override
	public List<Employ> readByEmployName(String employName) {
		Connection connection = CheckMyConnection.getConnection();	
		String sqlQuery = "SELECT * FROM USER_DETAILS WHERE User_name = \"" + employName + "\";";
		Statement statement = null;
		ResultSet resultSet = null;
		List<Employ> employs = new ArrayList<Employ>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			
			Employ employ = null;
			while(resultSet.next()) {
				employ = new Employ();
				employ.setEmploy_id(resultSet.getInt(1));
				employ.setEmploy_Name(resultSet.getString(2));
				employ.setEmploy_Password(resultSet.getString(3));
				employs.add(employ);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return employs;
	}

	@Override
	public Employ validateEmployIdAndEmployPassword(int EmployId, String Employpassword) {
		Connection connection = CheckMyConnection.getConnection();
		String sqlQuery = "SELECT * FROM USER_DETAILS WHERE User_id = \"" +EmployId+ "\" ; "; //&& User_password=\"" +Employpassword+"\"
		Statement statement = null;
		ResultSet resultSet = null;
		Employ employ = null;

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			while(resultSet.next()) {
				employ = new Employ();
				employ.setEmploy_id(resultSet.getInt(1));
				employ.setEmploy_Name(resultSet.getString(2));
				employ.setEmploy_Password(resultSet.getString(3));
				
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return employ;
	}

	@Override
	public Employ updateEmployById(int employId, Employ employ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employ deleteByEmployId(int employId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employ deleteByEmployName(String employName) {
		// TODO Auto-generated method stub
		return null;
	}

}
