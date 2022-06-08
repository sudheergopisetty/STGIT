package com.stg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.User;

@RestController
@RequestMapping("/api/v2")
public class UserController {

	@GetMapping("getuser")
	public User getUser() {
		return new User(10, "Mohan","Mohan123@");
	}
	
	@GetMapping("getnum")
	public int getNum() {
		return 100;
	}
}
