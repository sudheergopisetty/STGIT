package com.stg.service;



import java.util.List;

import com.stg.model.User;

public interface UserInterface {
	public abstract User createUser(User user);

	public abstract List<User> readUser();

	public abstract User readByUserId(int userId);
	
	public abstract int deleteByUser(int userId);

}