package com.model;

public class Employe {
	private int employeNo;
	private String employName;
	private float salary;
	public Employe() {
		super();
	}
	public Employe(int employeNo, String employName, float salary) {
		super();
		this.employeNo = employeNo;
		this.employName = employName;
		this.salary = salary;
	}
	public int getEmployeNo() {
		return employeNo;
	}
	public void setEmployeNo(int employeNo) {
		this.employeNo = employeNo;
	}
	public String getEmployName() {
		return employName;
	}
	public void setEmployName(String employName) {
		this.employName = employName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
