package com.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int empNo;
	private String empName;

	public Employee() {
		super();
		System.out.println("Employee constructor");
	}

	public Employee(int empNo, String empName, float empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;

		System.out.println("Employee cnstrucotor with params called");
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
