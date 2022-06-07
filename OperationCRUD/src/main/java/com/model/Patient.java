package com.model;

public class Patient {
	private int patientId;
	private String patientName;
	private long mobileNumber;
	private String disease;
	private Doctor doctor;
	public Patient() {
		super();
	}
	public Patient(int patientId, String patientName, long mobileNumber, String disease, Doctor doctor) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
		this.disease = disease;
		this.doctor = doctor;
	}
	
	public Patient(int patientId, String patientName, long mobileNumber, String disease) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
		this.disease = disease;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	

}
