package com.service;

import java.util.List;

import com.model.User;

public interface DbWorks {
	
	public abstract User createUser(String name,String password);
	
	public abstract void readAllUsers();

	public abstract List<User> getAllUsers();

	public abstract User getUserById(int userId);

	public abstract List<User> getUserByName(String userName);
	
	public abstract User validateUserIdAndPassword(int id,String password);

	public abstract User readByUserId(int userId);
	
	public abstract void updateUser(int user_id,String name,String password);

	public abstract boolean deleteUserById(int userId);

	public abstract boolean deleteUserByName(String userName);
	public abstract User validateUserId(int userId, String password);
}
