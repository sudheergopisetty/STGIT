package com.Model;
//pojo   plain old java object
public class Employeeee {
	private int empId;
	private String empName;
	private float empSalary;
	
	// same function nor constructor works in different form is called polymorphism 
	public Employeeee (){
		empId = 101;
		empName = "balu";
		empSalary = 12000;
		
	}
	
	public Employeeee(int empId, String empName, float empSalary) { // parameter constructor
		this.empId = empId;
		this.empName =empName;
		this.empSalary =empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
}
