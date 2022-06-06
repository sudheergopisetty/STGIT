package com.model;

<<<<<<< Updated upstream
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Department {

	private int deptId;
	private String deptName;
	// private Employee employee; // one to one
	private Set<Employee> employees;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		System.out.println("Department constructor with params");
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Department() {
		super();
		System.out.println("Department constructor");
=======
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//@Configuration
//@Component
public class Department {
	//@Component(value="121")
	private int deptId;
	private String deptName;
	//@Autowired
	private Employ employ;
	public Department() {
		super();
		System.out.println("Department with out constructor");

	}
	public Department(int deptId, String deptName, Employ employ) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.employ = employ;
		System.out.println("Department with constructor");
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
>>>>>>> Stashed changes
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Employ getEmploy() {
		return employ;
	}
	public void setEmploy(Employ employ) {
		this.employ = employ;
	}
	

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	

}
