package com.Model;

public class Department {
	private int deptId;
	private String deptName;
	
	private Employeeee[] employeeee;
	
	public Employeeee[] getEmployeeee() {
		return employeeee;
	}
	public void setEmployeeee(Employeeee[] employeeee) {
		this.employeeee = employeeee;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
