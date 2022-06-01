package com.main;

import com.model.Employe;
import com.model.FunctionalInterfaceWithObject;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		// LHS =RHS 
		FunctionalInterfaceWithObject withObject = ( emp) -> {
			return emp.getEmployName();
			
		};
		
		Employe employe = new Employe(10, "babu", 20000);
		String str  = withObject.getName(employe);
		System.out.println(str);
	}

}
