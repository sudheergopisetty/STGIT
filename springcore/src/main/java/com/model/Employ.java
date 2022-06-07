package com.model;

//import org.springframework.stereotype.Component;

//@Component
public class Employ {
	private int employNo;
	private String empName;
	
	public Employ() {
		super();
		System.out.println("Employ with out Constructor");
	}
	public Employ(int employNo, String empName) {
		super();
		this.employNo = employNo;
		this.empName = empName;
		System.out.println("Employ with Constructor");

	}
	public int getEmployNo() {
		return employNo;
	}
	public void setEmployNo(int employNo) {
		this.employNo = employNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
