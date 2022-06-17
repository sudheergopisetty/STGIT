package com.stg.service;

import java.util.List;

import com.stg.Exception.ResourceNotFoundException;
import com.stg.model.User;

public interface UserServiceInterface {
	public abstract List<User> readUser();
	
	public abstract User readBYUser(int userId) throws ResourceNotFoundException;
	public abstract User createUser(User user);
	public abstract List<User> readByName(String userName);
	public abstract User updateByUserId(int userId,String name);
	
}
