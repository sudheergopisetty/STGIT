package com.stg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import java.util.List;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;

import com.stg.dao.UserDao;
import com.stg.model.User;

@Service
public class UserInterfaceImpl implements UserInterface {

	@Autowired
	private UserDao userDao;
	@Override
	public User createUser(User user) {
	/*
	 * user1.setUserId(); user1.setUserName(user.getUserName());
	 * user1.setUserPassword(user.getUserPassword());
	 */
		
		return userDao.createUser(user);
	}

	@Override
	public List<User> readUser() {

		return userDao.readAllUsers();
				//new User(112, "uuioo", "kdhksd");

	}

	@Override
	public User readByUserId(int userId) {
		/*
		 * User user1 = new User(112, "uuioo", "kdhksd"); if (user1.getUserId() ==
		 * userId) { return user1; }
		 */
		return userDao.readByUserId(userId);
	}

	@Override
	public int deleteByUser(int userId) {
	
		return userDao.deleteByUserId(userId);
	}

}
