package com.stg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.authentication.UserAuthenticationinterface;
import com.stg.dto.EmployeDto;
import com.stg.dto.UserLog;
import com.stg.entity.Employe;
import com.stg.repository.EmployeRepository;
import com.stg.service.EmployeService;

@CrossOrigin(value = "http://localhost:4200/")
@RestController
@RequestMapping(value = "employe")
public class EmployeController {
	@Autowired
	private EmployeService EmployeService;
	
	@Autowired
	private EmployeRepository EmployeRepository;
	
	@Autowired
	private UserAuthenticationinterface authenticationinterface;
	
	@GetMapping(value="allEmployes")
	public ResponseEntity<List<Employe>> allEmployes(){
		ResponseEntity<List<Employe>> employes = new ResponseEntity<>(EmployeService.readAllEmployes(),HttpStatus.ACCEPTED);
		
		return employes;
	}
	
	@GetMapping(value="allUsers")
	public ResponseEntity<List<Employe>> allUsers(){
		ResponseEntity<List<Employe>> employes = new ResponseEntity<>(EmployeService.readAllUsers(),HttpStatus.ACCEPTED);
		
		return employes;
	}
	
	@GetMapping(value="getemployeBytype/{employeType}")
	public ResponseEntity<List<Employe>> allM(@PathVariable(value="employeType") int employeType){
		ResponseEntity<List<Employe>> employes = new ResponseEntity<>(EmployeRepository.readEmployeType(employeType),HttpStatus.ACCEPTED);
		
		return employes;
	}
	
	@PostMapping(value = "createEmploye")
	public ResponseEntity<Employe> createEmploye(@RequestBody Employe employe) {
		
		ResponseEntity<Employe> newEmploye = new ResponseEntity<>(EmployeService.createEmploye(employe),HttpStatus.CREATED);
		return newEmploye;
	}
	
	@GetMapping(value="readUsingId/{id}")
	public ResponseEntity<Employe> readById(@PathVariable(value = "id") int employeId){
		ResponseEntity<Employe> Employe = new ResponseEntity<>(EmployeService.readByEmployeId(employeId),HttpStatus.FOUND);
		
		return Employe;
	}
	
	@DeleteMapping(value="deleteUsing/{id}")
	public ResponseEntity<String> deleteById(@PathVariable(value = "id") int employeId){
    ResponseEntity<String> d  = new ResponseEntity<>(EmployeService.deleteByEmployeId(employeId),HttpStatus.OK);
		
	return d;
	}
	
	@PutMapping(value="updateUsingId/{id}")
	public ResponseEntity<Employe> updateById(@PathVariable(value = "id") int employeId,@RequestBody Employe employe ){
		ResponseEntity<Employe> newEmploye = new ResponseEntity<>(EmployeService.updateByEmployeId(employe, employeId),HttpStatus.FOUND);
		
		return newEmploye	;
	}
	
	@GetMapping(value="readUsingName/{name}")
	public ResponseEntity<Employe> getUserName(@PathVariable(value = "name") String userName){
		ResponseEntity<Employe> user = new ResponseEntity<Employe>(EmployeService.readEmployeByName(userName),HttpStatus.ACCEPTED);
		
		return user;
	}
	
	@PutMapping(value="authenticate")
	public ResponseEntity<UserLog> getUser(@RequestBody EmployeDto employe){
		ResponseEntity<UserLog> user = new ResponseEntity<>(authenticationinterface.userAuthentivation(employe),HttpStatus.FOUND);
		
		return user;
	}
	

}
