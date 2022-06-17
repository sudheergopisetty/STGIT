package com.stg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.Exception.ResourceNotFoundException;
import com.stg.model.User;

import com.stg.service.UserServiceInterface;

@RestController
@RequestMapping(value = "user")
public class UserController {
	@Autowired
	private UserServiceInterface userServiceInterface;

	@PostMapping(value = "create")
	public User createUser(@RequestBody User user) {

		return userServiceInterface.createUser(user);

	}

	@GetMapping(value = "readByname/{name}")
	public List<User> readUser(@PathVariable("name") String name) {
		return userServiceInterface.readByName(name);

	}

	@GetMapping(value = "readAll")
	public List<User> readOfUser() {
		return userServiceInterface.readUser();

	}

	@GetMapping(value = "readById/{id}")
	public User readBYUser(@PathVariable("id") int id)  {
		return userServiceInterface.readBYUser(id);

	}
	
	@PutMapping(value = "updateBy/{id}/{name}")
	public User upadateUser(@PathVariable("id") int id, @PathVariable("name") String name)  {
		return userServiceInterface.updateByUserId(id, name);

	}
	

}
