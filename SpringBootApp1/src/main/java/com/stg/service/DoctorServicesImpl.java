package com.stg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stg.dao.DoctorRepository;
import com.stg.model.Doctor;

@Service
public class DoctorServicesImpl implements DoctorServices {
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public Doctor CreateDoctor(Doctor doctor) {

		if(doctor.getDoctorName().length() > 4) {
			Doctor doctor2=  doctorRepository.CreateDoctor(doctor);
			return doctor2;
		} else {
			return null;
		}
	}

	@Override
	public List<Doctor> readAllDoctors() {
		return doctorRepository.readAllDoctors();
	}

	@Override
	public Doctor readById(int id) {
		return doctorRepository.readById(id);
	}

	@Override
	public List<Doctor> readByName(String doctorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		if (doctor != null) {
			return doctorRepository.updateDoctor(doctor);
		} else {
			return null;
		}
	}

	@Override
	public int deleteById(int doctorId) {
		if (doctorId != 0) {
			return doctorRepository.deleteById(doctorId);
		} else {
			return 0;
		}
	}

	
}
