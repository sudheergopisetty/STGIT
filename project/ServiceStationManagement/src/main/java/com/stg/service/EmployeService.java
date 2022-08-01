package com.stg.service;

import java.util.List;


import com.stg.entity.Employe;
import com.stg.exception.ResourceNotFoundException;

public interface EmployeService {
	public abstract Employe createEmploye(Employe employe);
	public abstract List<Employe> readAllEmployes();
	public abstract List<Employe> readAllUsers();
	public abstract Employe readByEmployeId(int employeId) throws ResourceNotFoundException;
	public abstract Employe updateByEmployeId(Employe employe,int employeId) throws ResourceNotFoundException;
	public abstract String deleteByEmployeId(int employeId)  throws ResourceNotFoundException;
	public abstract Employe readEmployeByName(String employeName) throws ResourceNotFoundException;
}
