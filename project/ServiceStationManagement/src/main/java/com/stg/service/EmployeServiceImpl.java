package com.stg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stg.entity.Employe;
import com.stg.exception.ResourceNotFoundException;
import com.stg.repository.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeService{
	
	@Autowired
	private EmployeRepository EmployeRepository;
	
	

	@Override
	public Employe createEmploye(Employe employe) {
		return EmployeRepository.save(employe);
	}


	@Override
	public Employe readByEmployeId(int employeId) {
		
		return EmployeRepository.findById(employeId).get();
	}

	@Override
	public Employe updateByEmployeId(Employe employe, int employeId) {
		Employe presentEmploye = this.readByEmployeId(employeId);
		presentEmploye.setUserName(employe.getUserName());
		presentEmploye.setPassword(employe.getPassword());
		presentEmploye.setMobileNumber(employe.getMobileNumber());
		presentEmploye.setEmployeGmail(employe.getEmployeGmail());
		presentEmploye.setFirstName(employe.getFirstName());
		presentEmploye.setLastName(employe.getLastName());
		presentEmploye.setEmployeType(employe.getEmployeType());
		EmployeRepository.save(presentEmploye);
		return presentEmploye;
	}

	@Override
	public String deleteByEmployeId(int employeId) {
		Employe Employe = this.readByEmployeId(employeId);
		if(Employe != null) {
			EmployeRepository.deleteEmploye(employeId); 
			return "employe deleted";
		}else {
			throw new ResourceNotFoundException("employe is not present or you entered wrong employe id");
		}
		
		
		
	}


	@Override
	public List<Employe> readAllEmployes() {
		
		return EmployeRepository.readAllEmployes();
	}


	@Override
	public Employe readEmployeByName(String employeName) throws ResourceNotFoundException {
		Employe employe = EmployeRepository.findByUserName(employeName);
		if (employe != null) {
			return employe;
		}else {
			throw new ResourceNotFoundException("user with : "+ employeName +" not found");
		}
		
	}


	@Override
	public List<Employe> readAllUsers() {
		
		return EmployeRepository.readUsers(0);
	}

}
