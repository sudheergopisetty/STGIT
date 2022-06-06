package com.model;

public class Department {
	private int depatmentId;
	private String  departmentName;
	private Employ employ;
	public Department(int depatmentId, String departmentName, Employ employ) {
		super();
		this.depatmentId = depatmentId;
		this.departmentName = departmentName;
		this.employ = employ;
	}
	public Department() {
		super();
	}
		public Employ getEmploy() {
		return employ;
	}
	public void setEmploy(Employ employ) {
		this.employ = employ;
	}
		public int getDepatmentId() {
		return depatmentId;
	}
	public void setDepatmentId(int depatmentId) {
		this.depatmentId = depatmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	

}
