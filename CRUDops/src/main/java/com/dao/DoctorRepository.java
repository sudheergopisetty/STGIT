package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Doctor;

@Repository
public interface DoctorRepository {

	public abstract Doctor CreateDoctor(Doctor doctor);
	public abstract List<Doctor> readAllDoctors();
	public abstract Doctor readById(int doctorId);
	public abstract List<Doctor> readByName(String doctorName);
	public abstract Doctor updateDoctor(Doctor doctor);
	public abstract int deleteById(int doctorId);
}
