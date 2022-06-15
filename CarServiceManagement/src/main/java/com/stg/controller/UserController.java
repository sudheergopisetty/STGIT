package com.stg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.User;
import com.stg.repository.UserRepository;

@RestController
@RequestMapping(value = "user")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping(value = "create")
	public User createUser(@RequestBody User user) {

		return userRepository.save(user);

	}

	/*
	 * @GetMapping(value = "readByname/{name}") public List<User>
	 * readUser(@PathVariable("name") String name) { return
	 * userRepository.findByuserName(name);
	 * 
	 * }
	 */

	@GetMapping(value = "readAll")
	public List<User> readUser() {
		return userRepository.readAllUsers();

	}

	@GetMapping(value = "readById/{id}")
	public User readBYUser(@PathVariable("id") int id) {
		return userRepository.readById(id);

	}

}
