package com.stg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.Exception.ResourceNotFoundException;
import com.stg.model.User;
import com.stg.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceInterface {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> readUser() {

		return userRepository.readAllUsers();

	}

	@Override
	public User readBYUser(int userId) {
		User id = userRepository.readById(userId);
		if (id == null) {
			throw new ResourceNotFoundException("not");
		} else {
			return userRepository.readById(userId);
		}

	}

	@Override
	public User createUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public List<User> readByName(String userName) {

		return userRepository.findByuserName(userName);
	}

	@Override
	public User updateByUserId(int userId, String name) {
		User user = userRepository.updatedUser(userId);
		user.setUserName(name);
		userRepository.save(user);
		return userRepository.updatedUser(userId);
	}

}
