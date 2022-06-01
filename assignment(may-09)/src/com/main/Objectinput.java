package com.main;

import com.model.Objectstructure;
import com.service.Objectprint;


public class Objectinput {

	public static void main(String[] args) {
		Objectstructure objectstructure = new Objectstructure();
		
		objectstructure.setEmpId(101);
		objectstructure.setEmpName("balu");
		objectstructure.setSalary(12000);
		
		Objectstructure objectstructure2 = new Objectstructure();
		objectstructure2.setEmpId(102);
		objectstructure2.setEmpName("Ram");
		objectstructure2.setSalary(18000);
		
		Objectprint objectprint = new Objectprint();
		System.out.println("Employ Name : "+objectprint.add(objectstructure));
	    objectprint.def(objectstructure);
	    
	   
	}

}
