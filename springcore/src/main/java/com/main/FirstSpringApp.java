package com.main;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Department;
import com.model.Employee;

public class FirstSpringApp {

	public static void main(String[] args) {
		// abs
		// interface var = new InterImpl();

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/happy.xml");
<<<<<<< Updated upstream
		Department department = (Department) applicationContext.getBean("department");
		//System.out.println("Dep id is:" + department.getDeptId());
		//System.out.println("Dep name is:" + department.getDeptName());
		Set<Employee> setOfEmployees = department.getEmployees();
		for (Employee employee : setOfEmployees) {
			//System.out.println(employee.getEmpNo());
			//System.out.println(employee.getEmpName());
		}

		setOfEmployees.forEach((cold) -> {
			System.out.println("emp id is:" + cold.getEmpNo());
			System.out.println("emp name is:" + cold.getEmpName());
		}

		);
=======
		
		/*
		 * Employ employ = (Employ) applicationContext.getBean("employ");
		 * 
		 * System.out.println("Employ Number : " + employ.getEmployNo()); // construtor
		 * System.out.println("Employ Name : " + employ.getEmpName());
		 */
		
		
		//Department department = new Department();  // developer control 
		
		Department obj = (Department) applicationContext.getBean("department");
		System.out.println("dept Number : " + obj.getDeptId());   // setter
		System.out.println("emp no : " + obj.getEmploy().getEmployNo());

		
		System.out.println("The end");
>>>>>>> Stashed changes

	}

}
