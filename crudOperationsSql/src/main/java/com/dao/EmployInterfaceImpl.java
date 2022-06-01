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
		String sqlQuery = "SELECT * FROM employ";
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
		String sqlQuery = "INSERT INTO employ  (employ_Name,employ_password)VALUES(?,?)";
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
		String sqlQuery  = "SELECT * FROM employ WHERE employ_Id = \""+employId+"\";";
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
	public List<Employ> readByEmployName(String mployName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employ validateEmployIdAndEmployPassword(int EmployId, String Employpassword) {
		// TODO Auto-generated method stub
		return null;
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
