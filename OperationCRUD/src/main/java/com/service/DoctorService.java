package com.service;

import java.util.List;

import com.model.Doctor;

public interface DoctorService {
	
	public abstract Doctor createDoctor(Doctor doctor);
	public abstract List<Doctor> readAllDoctors();
	public abstract Doctor readDoctorById(int doctorId);
	public abstract List<Doctor> readDoctorByName(String doctorName);
	public abstract Doctor updateDoctor(Doctor doctor);
	public abstract List<Doctor> deleteDoctorById(int doctorId);
	public abstract String deleteDoctorByName(String doctorName);
}
