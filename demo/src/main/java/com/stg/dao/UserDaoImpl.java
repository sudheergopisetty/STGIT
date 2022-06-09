package com.stg.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.stg.model.User;

@Repository

public class UserDaoImpl implements UserDao {

	@Override
	public User createUser(User user) {
		String insertQuery = "INSERT INTO user_details(user_name,user_Password)VALUES(?,?)";
		Connection connection=  MySQLConnectionCheck.getConnection();
		PreparedStatement preparedStatement = null;
		boolean bool = false;
		try {
			 preparedStatement = connection.prepareStatement(insertQuery);
			 preparedStatement.setString(1, user.getUserName());
			 preparedStatement.setString(2, user.getUserPassword());
			 bool = preparedStatement.execute();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		if(bool == true) {
			return user;
		}else {
			//
		}
		return user;
	}

	@Override
	public List<User> readAllUsers() {
		Connection connection=  MySQLConnectionCheck.getConnection();
		String sqlQuery = "SELECT * FROM user_details";
		Statement statement = null;
		ResultSet resultSet = null;
		List<User> users = new ArrayList<User>();
		try {
			statement =connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			User userd = null;
			while(resultSet.next()){
				userd= new User();
				
				userd.setUserId(resultSet.getInt(1));
				userd.setUserName(resultSet.getString(2));
				userd.setUserPassword(resultSet.getString(3));
				/*
				 * System.out.println(resultSet.getInt("user_id"));
				 * System.out.println(resultSet.getInt("user_name"));
				 */
				users.add(userd);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return users;
	}

	@Override
	public User readByUserId(int userId) {
		Connection connection=  MySQLConnectionCheck.getConnection();
		String sqlQuery = "SELECT * FROM user_details WHERE User_id= \"" + userId+"\";";
		java.sql.Statement statement = null;
		ResultSet resultSet = null;
		User userd = null;
		
		try {
			statement =connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			
			while(resultSet.next()){
				userd= new User();
				
				userd.setUserId(resultSet.getInt(1));
				userd.setUserName(resultSet.getString(2));
				userd.setUserPassword(resultSet.getString(3));
				/*
				 * System.out.println(resultSet.getInt("user_id"));
				 * System.out.println(resultSet.getInt("user_name"));
				 */
				
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return userd;
		
	}

	@Override
	public List<User> readByUserName(String userName) {
		Connection connection=  MySQLConnectionCheck.getConnection();
		String sqlQuery = "SELECT * FROM user_details WHERE userName = \"" + userName+"\";";
		java.sql.Statement statement = null;
		ResultSet resultSet = null;
		User userd = null;
		List<User> users = new ArrayList<User>();
		try {
			statement =connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			
			while(resultSet.next()){
				userd= new User();
				
				userd.setUserId(resultSet.getInt(1));
				userd.setUserName(resultSet.getString(2));
				userd.setUserPassword(resultSet.getString(3));
				/*
				 * System.out.println(resultSet.getInt("user_id"));
				 * System.out.println(resultSet.getInt("user_name"));
				 */
				users.add(userd);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return users;
		
	}

	@Override
	public User validateUserIdAndPassword(int userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	  @Override 
	  public int deleteByUserId(int userId) { 
		  Connection connection= MySQLConnectionCheck.getConnection();
	  
	  String sqlQuery = "DELETE FROM user_details WHERE user_id= \"" + userId +"\";";
	  java.sql.Statement statement = null;
	 
	  int result = 0;
	  try {
		statement =connection.createStatement();
		result = statement.executeUpdate(sqlQuery);
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	  
	  
	  return result; 
	  }
	 
	@Override
	public int deleteByUserName(String userName) {
		 Connection connection= MySQLConnectionCheck.getConnection();
		  
		  String sqlQuery = "DELETE FROM user WHERE userName= \"" + userName +"\";";
		  java.sql.Statement statement = null;
		 
		  int result = 0;
		  try {
			statement =connection.createStatement();
			result = statement.executeUpdate(sqlQuery);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		  
		  
		  return result; 
	}


	@Override
	public User updateUserById(int userId,User user) {
		Connection connection=  MySQLConnectionCheck.getConnection();
		String sql = "UPDATE User_details SET userName=?, userPassword=? WHERE userId = \"" + userId + "\" ;";
		 
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, user.getUserName());
			statement.setString(2, user.getUserPassword());
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated != 0) {
			    System.out.println("An existing user was updated successfully!");
			}else {
			    System.out.println("An existing user was not updated!");

			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		return user;
	}

	
}
