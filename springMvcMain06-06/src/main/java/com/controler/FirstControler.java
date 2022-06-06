package com.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstControler {
	
	@RequestMapping("one")
	public String firstFunction() {
		return "success";
	}
	
	@RequestMapping(value = "two")
	
	public String secondFunction() {
		return "thank";
	}
}
