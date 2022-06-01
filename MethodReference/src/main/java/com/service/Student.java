package com.service;

public class Student {
	private int studentId;
	private String Name;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		Name = name;
	}
	public Student() {
		super();
	}

}
