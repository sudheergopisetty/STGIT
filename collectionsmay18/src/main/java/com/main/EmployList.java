package com.main;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;


import com.model.EmployAddress;
import com.model.EmployDepartment;
import com.service.EmployListService;

public class EmployList {

	public static void main(String[] args) {
		// interface interfacename   =New interfaceimpl;
		EmployDepartment department1 = new EmployDepartment(10,"balu");
		EmployDepartment department2 = new EmployDepartment(20,"kiran");
		EmployDepartment department3 = new EmployDepartment(30,"sobh");
		
		List list =  new ArrayList();
		System.out.println(list.size());
		
		list.add(department1);
		list.add(department2);
		list.add(department3);
		list.add(department3);
		EmployAddress address1 = new EmployAddress(12);
		EmployAddress address2 = new EmployAddress(14);
		EmployAddress address3 = new EmployAddress(16);
		
		list.add(address1);
		list.add(address2);
		
	System.out.println("list afteradd" + list.size());
	list.add(department3);
	System.out.println("list afteradd duplicate" + list.size());
	//list.remove(department3);
	System.out.println("list afteradd" + list.size());
	
	list.add(22);  // auto convert premitive data type to object
	
	EmployListService employListService = new EmployListService();
	employListService.getHouseDetails(list);
	
	}

}
