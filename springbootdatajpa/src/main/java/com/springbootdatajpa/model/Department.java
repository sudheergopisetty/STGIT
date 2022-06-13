package com.springbootdatajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	@Column(name = "department_name",length  = 25)  // size = 255
	private String departmentName;
	@Column(name = "noOfEmploysInDept")
	private int noOfEmployeesInDept;
	public Department() {
		super();
	}
	public Department(String departmentName,int noOfEmployeesInDept) {
		super();
		this.departmentName = departmentName;
		this.noOfEmployeesInDept = noOfEmployeesInDept;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getNoOfEmployeesInDept() {
		return noOfEmployeesInDept;
	}
	public void setNoOfEmployeesInDept(int noOfEmployeesInDept) {
		this.noOfEmployeesInDept = noOfEmployeesInDept;
	}
	
	

}
