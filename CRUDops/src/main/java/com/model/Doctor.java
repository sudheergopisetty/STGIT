package com.model;

import java.util.List;

public class Doctor {

	private int doctorId;
	private String doctorName;
	private String mobileNo;
//	private String emailId;
//	private String password;
	private String doctorSpecilization;
	private List<Patient> patients;
	
	public Doctor() {
		super();
	}
	
	

	public Doctor(int doctorId, String doctorName, String mobileNo, String doctorSpecilization) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.mobileNo = mobileNo;
		this.doctorSpecilization = doctorSpecilization;
	}



	public Doctor(int doctorId, String doctorName, String mobileNo, String doctorSpecilization, List<Patient> patients) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.mobileNo = mobileNo;
		this.doctorSpecilization = doctorSpecilization;
		this.patients = patients;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String string) {
		this.mobileNo = string;
	}

	public String getDoctorSpecilization() {
		return doctorSpecilization;
	}

	public void setDoctorSpecilization(String doctorSpecilization) {
		this.doctorSpecilization = doctorSpecilization;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	
	
	
}
