package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.Employ;

@RestController
public class First {
	@RequestMapping("fun")
	public Employ getFunction() {
		Employ employ = new Employ(101,"babu");
		return employ;
	}

}
