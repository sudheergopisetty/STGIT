package com.model;

public class StudentDetails {
	private int studentId;
	private String studentName;
	private float collegeFee;
	public float getCollegeFee() {
		return collegeFee;
	}
	public void setCollegeFee(float collegeFee) {
		this.collegeFee = collegeFee;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
