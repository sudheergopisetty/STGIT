package com.stg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stg.model.User;
import com.stg.service.UserInterface;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

	@Autowired
	private UserInterface userInterface;

	@GetMapping(value = "readAll")
	public List<User> readUser(){
		
		return userInterface.readUser();
	}

	@PostMapping(value = "createUser")
	public User createUser(@RequestBody User user) {

		return userInterface.createUser(user);
	}

	@GetMapping(value = "byid/{id}")
	public User readById(@PathVariable int id) {

		return userInterface.readByUserId(id);
	}
	

	@DeleteMapping(value = "delete/{id}")
	public int deleById(@PathVariable int id) {

		return  userInterface.deleteByUser(id);
	}

}
