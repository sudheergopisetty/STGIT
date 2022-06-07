package com.service;

import java.util.List;

import com.model.Doctor;

public interface PatientServices {

	public abstract Doctor CreateDoctor(Doctor doctor);
	public abstract List<Doctor> readAllDoctors();
	public abstract Doctor readById(int doctorId);
	public abstract List<Doctor> readByName(String doctorName);
	public abstract Doctor updateDoctor(Doctor doctor);
	public abstract int deleteById(int doctorId);
}
