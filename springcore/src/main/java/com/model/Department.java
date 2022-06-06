package com.model;

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
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	

}
