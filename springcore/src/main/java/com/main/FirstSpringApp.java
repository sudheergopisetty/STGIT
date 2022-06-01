package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Department;
import com.model.Employ;

public class FirstSpringApp {

	public static void main(String[] args) {
		// abstract 
		// interface var = new interfaceImpl();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/happy.xml");
		
		Employ employ = (Employ) applicationContext.getBean("employ");
		
		System.out.println("Employ Number : " + employ.getEmployNo());  // construtor
		System.out.println("Employ Name : " + employ.getEmpName());
		
		
		//Department department = new Department();  // developer control 
		
		//Department obj = (Department) applicationContext.getBean("department");
		//System.out.println("dept Number : " + obj.getDeptId());   // setter

		
		System.out.println("The end");

	}

}
