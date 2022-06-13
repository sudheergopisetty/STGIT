package com.springbootdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdatajpa.model.User;
import com.springbootdatajpa.repository.UserRepository;

@RestController
@RequestMapping(value="user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(value="create")
	public User createUser(@RequestBody User user) {
		
		return userRepository.save(user);
		
		
		
	}
	
	@GetMapping(value = "readById/{name}")
	public List<User> readUser(@PathVariable("name") String name) {
		return userRepository.findByuserName(name);
		
	}
	

}
