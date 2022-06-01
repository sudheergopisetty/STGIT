package com.model;

import java.util.Set;

public class EmployDepartment {
	private int employId;
	private String employName;
	
	private Set Addressss;
	
	

	
	public Set getAddressss() {
		return Addressss;
	}
	public void setAddressss(Set addressss) {
		Addressss = addressss;
	}
	public int getEmployId() {
		return employId;
	}
	public void setEmployId(int employId) {
		this.employId = employId;
	}
	public String getEmployName() {
		return employName;
	}
	public void setEmployName(String employName) {
		this.employName = employName;
	}
	public EmployDepartment(int employId, String employName) {
		super();
		this.employId = employId;
		this.employName = employName;
	}
	
}
