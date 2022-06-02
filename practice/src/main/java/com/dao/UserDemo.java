package com.dao;

import java.util.List;

import com.model.User;

public interface UserDemo {
	public abstract User createUser(User user);
	public abstract List<User> readAllUser();
	public abstract User readByUserId(int userId);
	public abstract User readByUserName(String userName);
	public abstract User validateUserById(int userId,String password);
	public abstract User updateByUserId(int userId);
	public abstract User updateByUserNamw(String userName);
	public abstract User updateUser(User user);
	public abstract User deleteByUserId(int userId);
	public abstract User deleteByUserId(String userName);
	public abstract User createUser(String name, String password);
	
}
