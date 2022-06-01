package com.model;

public class Department {
	private int deptId;

	public Department() {
		super();
		System.out.println("DEpartment with out Constructor");
				
		
	}

	public Department(int deptId) {
		super();
		this.deptId = deptId;
		System.out.println("Employ with Constructor");

	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

}
