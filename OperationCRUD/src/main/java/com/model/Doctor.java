package com.model;

import java.util.List;

public class Doctor {
	private int doctorId;
	private String doctorName;
	private long mobileNumber;
	private String doctorSpecialization;
	private List<Patient> patient;
	
	public Doctor() {
		super();
	}

	public Doctor(int doctorId, String doctorName, long mobileNumber, String doctorSpecialization) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.mobileNumber = mobileNumber;
		this.doctorSpecialization = doctorSpecialization;
	}

	public Doctor(int doctorId, String doctorName, long mobileNumber, String doctorSpecialization,
			List<Patient> patient) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.mobileNumber = mobileNumber;
		this.doctorSpecialization = doctorSpecialization;
		this.patient = patient;
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

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}

	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

}
