package com.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	@RequestMapping(value = "abc")	//http://localhost:8080/<projectNAme>/abc
	public String myFunction() {
		return "success";				//output == view 
	}
	
	@RequestMapping(value = "efg")	//http://localhost:8080/<projectNAme>/efg
	public String myFunctionTwo() {
		return "thankyou";
	}

}
