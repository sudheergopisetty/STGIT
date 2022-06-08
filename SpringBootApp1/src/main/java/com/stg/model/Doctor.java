package com.stg.model;

public class Doctor {

	private int doctorId;
	private String doctorName;
	private String mobileNo;
//	private String emailId;
//	private String password;
	private String doctorSpecilization;
	
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
}
