package com.dao;

import java.util.List;

import com.model.User;


public interface UserDao {
	public abstract User createUser(User user);
	public abstract List<User> readAllUsers();
	public abstract User readByUserId(int userId);
	public abstract List<User> readByUserName(String name);
	public abstract User validateUserIdAndPassword(int userId, String password);
	public abstract User updateUserById(int userId, User user);
	public abstract int deleteByUserId(int userId);
	public abstract int deleteByUserName(String userName);

}
