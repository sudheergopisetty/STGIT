package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employ;


public class LogInApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("com/config/springconfig.xml");
		Employ employ = (Employ)applicationContext.getBean("employ");
		System.out.println("emp name : " + employ.getEmployId());
	}

}
