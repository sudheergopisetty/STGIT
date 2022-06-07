package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.DoctorRepository;
import com.model.Doctor;

@RestController
@RequestMapping("/api/v1/")
public class HospitalMangementController {

	@Autowired
	private DoctorRepository doctorService;
	
	@GetMapping("listofdoctors")
	public List<Doctor> listAllDoctors(){
		return doctorService.readAllDoctors();
	}
	
	@PostMapping(value= "createdoctor")
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		return doctorService.CreateDoctor(doctor);
	}
}
