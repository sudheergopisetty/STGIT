package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.User;
import com.service.Checkpassword;

public class UserDaoImpl implements UserDemo {

	@Override
	public User createUser(User user) {
		String insertQuery = "INSERT INTO user (user_name,password ) VALUES (?,?)";
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement preparedStatement = null;
		boolean bool = false;

		try {
			preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, user.getUser_name());
			preparedStatement.setString(2, user.getPassword());
			bool = preparedStatement.execute();

		} catch (SQLException e) {

			System.err.println(e.getMessage());
		}
		if (bool) {
			return user;
		} else {
			return user;
		}
	}

	@Override
	public List<User> readAllUser() {
		// logic
		Connection connection = MySQLConnection.getConnection();
		String sqlQuery = "SELECT * FROM user";
		Statement statement = null;
		ResultSet resultSet = null;

		List<User> users = new ArrayList<User>();

		try {

			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			User user = null;
			// iterate

			while (resultSet.next()) {
				user = new User();
				user.setUser_id(resultSet.getInt("user_id"));
				user.setUser_name(resultSet.getString("user_name"));
				user.setPassword(resultSet.getString("password"));
				// System.out.println(resultSet.getInt("user_id"));
				// System.out.println(resultSet.getString("user_name"));
				users.add(user);
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		return users;
	}

	@Override
	public User readByUserId(int userId) {
		Connection connection = MySQLConnection.getConnection();
		String sqlQuery = "select * from user where user_id = \"" + userId + "\"";
		Statement statement = null;
		ResultSet resultSet = null;
		// PreparedStatement preparedStatement = null;
		User user = new User();

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
				if (resultSet.getInt(1) == userId) {
					user.setUser_id(resultSet.getInt(1));
					user.setUser_name(resultSet.getString(2));
					user.setPassword(resultSet.getString(3));
				}
			}
		} catch (SQLException e) {

			System.err.println(e.getMessage());
		}
		return user;
	}

	@Override
	public User readByUserName(String userName) {
		Connection connection = MySQLConnection.getConnection();
		String sqlQuery = "select * from user where user_name = \"" + userName + "\";";
		Statement statement = null;
		ResultSet resultSet = null;
		// PreparedStatement preparedStatement = null;
		User user = new User();

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			
			while (resultSet.next()) {
				user.setUser_id(resultSet.getInt(1));
				user.setUser_name(resultSet.getString("user_name"));
			}
		} catch (SQLException e) {

			System.err.println(e.getMessage());
		}
		return user;
	}

	@Override
	public User validateUserById(int userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateByUserId(int userId) {
		Connection connection = MySQLConnection.getConnection();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter new  User Name : ");
		String user_name = sc.next();
		System.out.println("Password must contain 8 digits and have aleast one uppercase, lowercase,number and special character");
		System.out.println("Enter new  User Password : ");
		String password = sc.next();
		
		String sqlQuery = "Update user set user_name = \""+ user_name +"\" ,password = \""+password+"\" where user_id = \"" + userId + "\";";
		Statement statement = null;
		int result = 0;
	    //PreparedStatement preparedStatement = null;
		User user = new User();

		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(sqlQuery);
			
			if (result!=0) {
				
				String selectQuery = "select * from user where user_name = \"" + user_name  + "\";";
				Statement statement1 = null;
				ResultSet resultSet = null;

				try {
					statement1 = connection.createStatement();
					resultSet = statement1.executeQuery(selectQuery);
					
					while (resultSet.next()) {
						user.setUser_id(resultSet.getInt(1));
						user.setUser_name(resultSet.getString(2));
						user.setPassword(resultSet.getString(3));
					}
				} catch (SQLException e) {

					System.err.println(e.getMessage());
				}
			}
			
			/*
			 * while (resultSet.next()) { user.setUser_id(resultSet.getInt(1));
			 * user.setUser_name(resultSet.getString("user_name"));
			 * user.setPassword(resultSet.getString("password")); }
			 */
		} catch (SQLException e) {

			System.err.println(e.getMessage());
		}
		return user;
	}

	@Override
	public User updateByUserNamw(String userName) {
		Connection connection = MySQLConnection.getConnection();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter User Name : ");
		String user_name = sc.next();
		System.out.print("Enter User Password : ");
		String password = sc.next();
		
		String sqlQuery = "Update user set user_name = \""+ user_name +"\" ,password = \""+password+"\" where user_name = \"" + userName + "\";";
		Statement statement = null;
		sc.close();
		int result = 0;
	    //PreparedStatement preparedStatement = null;
		User user = new User();

		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(sqlQuery);
			
			if (result!=0) {
				
				String selectQuery = "select * from user where user_name = \"" + user_name  + "\";";
				Statement statement1 = null;
				ResultSet resultSet = null;

				try {
					statement1 = connection.createStatement();
					resultSet = statement1.executeQuery(selectQuery);
					
					while (resultSet.next()) {
						user.setUser_id(resultSet.getInt(1));
						user.setUser_name(resultSet.getString(2));
						user.setPassword(resultSet.getString(3));
					}
				} catch (SQLException e) {

					System.err.println(e.getMessage());
				}
			}
			
			/*
			 * while (resultSet.next()) { user.setUser_id(resultSet.getInt(1));
			 * user.setUser_name(resultSet.getString("user_name"));
			 * user.setPassword(resultSet.getString("password")); }
			 */
		} catch (SQLException e) {

			System.err.println(e.getMessage());
		}
		return user;
	}
	

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteByUserId(int userId) {
		Connection connection = MySQLConnection.getConnection();
		String sqlQuery = "Delete from user  where user_id = \"" + userId + "\";";
		Statement statement = null;
		int result = 0;
	    //PreparedStatement preparedStatement = null;
		User user = new User();
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(sqlQuery);
			/*
			 * while (resultSet.next()) { user.setUser_id(resultSet.getInt(1));
			 * user.setUser_name(resultSet.getString("user_name"));
			 * user.setPassword(resultSet.getString("password")); }
			 */
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return user;
	}

	@Override
	public User deleteByUserId(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
		public User createUser(String name, String password) {
			int id = 0;
			User user = null;
			String createQuery = "INSERT INTO user(user_name,password) values (\"" + name + "\"" + ",\"" + password + "\"" + ");";
			String selectQuery = "SELECT * FROM user WHERE user_name like \"" + name + "\";";
			try {
				Connection connection =  MySQLConnection.getConnection();
				Statement statement = connection.createStatement();
				int status = statement.executeUpdate(createQuery);
				if (status != 0) {
					//System.out.println("User added");
				} else {
					//System.out.println("Something wrong");
				}
				ResultSet result = statement.executeQuery(selectQuery);
				while (result.next()) {
					id = result.getInt("user_id");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			if (id != 0) {
				user = new User(id, name, password);
				return user;
			}
			return null;
	}

}
