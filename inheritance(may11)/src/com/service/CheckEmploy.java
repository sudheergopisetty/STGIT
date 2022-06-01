package com.service;


import com.Model.Department;
import com.Model.Employeeee;

public class CheckEmploy {
	public boolean getEmp(Department departments, int empt) {
		boolean bool= false;
		for (int i = 0; i < departments.getEmployeeee().length; i++) {
			if( departments.getEmployeeee()[i].getEmpId() == empt) {
				bool= true;
			
			}else {
				bool = false;
			}
		}
		return bool;
		
		
}
	
	
	public Employeeee[] getArrayName(Department employes, String name) {
		int indes = 0;
		for (int i = 0; i < employes.getEmployeeee().length; i++) {
			if(employes.getEmployeeee()[i].getEmpName() == name) {
				indes++;
				
			}
		}
		
		int inde = 0;
		Employeeee[] employeeees = new Employeeee[indes];
		for (int i = 0; i < employes.getEmployeeee().length; i++) {
			if(employes.getEmployeeee()[i].getEmpName()  == name) {
				employeeees[inde] = employes.getEmployeeee()[i];
				inde++;
			}
		}
		
		return employeeees;
	}
}
