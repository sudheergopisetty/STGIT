package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Doctor;
import com.service.DoctorService;

@RestController
public class DoctyorController {
	@Autowired
	private DoctorService doctorservice; 
	//@RequestMapping(value="listofdoctors" ,)
	@GetMapping(value="listofdoctor")
	public List<Doctor> listAllDoctors(){
		
		
		return doctorservice.readAllDoctors();
	}
	
	@GetMapping(value="readbydoctorId/{alias}") // localhost:8080/<projectname>/readbydoctorid/123
	public Doctor readByDoctorId(@PathVariable("alias") int doctorId) {
		
		return doctorservice.readDoctorById(doctorId);
	}
	
	@PostMapping("add")
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		
		return doctorservice.createDoctor(doctor);
	}
	
	@DeleteMapping("del/{id}")
	public List<Doctor> deleteBYId(@PathVariable int id) {
		
		return doctorservice.deleteDoctorById(id);
	}
}
