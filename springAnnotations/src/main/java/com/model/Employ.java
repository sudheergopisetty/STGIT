package com.model;

public class Employ {
	private int employId;
	private String employName;
	public Employ(int employId, String employName) {
		super();
		this.employId = employId;
		this.employName = employName;
	}
	public Employ() {
		super();
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
	
	
	

}
