package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ControllerFunction {
	@RequestMapping("one")
	public String getFunction() {
		
		return "good";
				
	}

}
