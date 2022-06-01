package com.model;

public class Employ {
	
	private int employ_id;
	private String employ_Name;
	private String employ_Password;
	public Employ() {
		super();
	}
	public Employ(int employ_id, String employ_Name, String employ_Password) {
		super();
		this.employ_id = employ_id;
		this.employ_Name = employ_Name;
		this.employ_Password = employ_Password;
	}
	
	public Employ(String employ_Name, String employ_Password) {
		super();
		this.employ_Name = employ_Name;
		this.employ_Password = employ_Password;
	}
	public int getEmploy_id() {
		return employ_id;
	}
	public void setEmploy_id(int employ_id) {
		this.employ_id = employ_id;
	}
	public String getEmploy_Name() {
		return employ_Name;
	}
	public void setEmploy_Name(String employ_Name) {
		this.employ_Name = employ_Name;
	}
	public String getEmploy_Password() {
		return employ_Password;
	}
	public void setEmploy_Password(String employ_Password) {
		this.employ_Password = employ_Password;
	}
	@Override
	public String toString() {
		return "Employ [employ_id=" + employ_id + ", employ_Name=" + employ_Name + ", employ_Password="
				+ employ_Password + "]";
	}
	
	
	

}
