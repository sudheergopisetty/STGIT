package com.stg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stg.model.Doctor;
import com.stg.service.DoctorServices;

@RestController
@RequestMapping("/api/v1/")
public class HospitalMangementController {

	@Autowired
	private DoctorServices doctorServices;
	
	@GetMapping("listofdoctors")
	public List<Doctor> listAllDoctors(){
		return doctorServices.readAllDoctors();
	}
	
	@PostMapping(value= "createdoctor")
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		return doctorServices.CreateDoctor(doctor);
	}
	
	@GetMapping("readById/{id}")
	public Doctor readById(@PathVariable("id") int id){
		return doctorServices.readById(id);
	}
	
	@PutMapping("updatedoctor")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		return doctorServices.updateDoctor(doctor);
	}
	
	@DeleteMapping("deleteById/{id}")
	public int deleteById(@PathVariable("id") int id) {
		return doctorServices.deleteById(id);
	}
}
