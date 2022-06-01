package com.Main;

import com.Service.InterfaceOne;
import com.Service.InterfaceOneImpl;
import com.Service.InterfaceTwoImpl;

public class InterfaceMain {
	
	public static void main(String[] args) {
		// interfaceName VAR = new interfaceImpl;
		
		InterfaceOne interfaceOne = new InterfaceOneImpl();  // abstraction
		interfaceOne.functionOne();
		System.out.println(interfaceOne.add(1, 3));

		InterfaceOne interfaceTwo = new InterfaceTwoImpl();  // abstraction
		interfaceTwo.functionOne();
		System.out.println(interfaceTwo.add(2, 4));
		
		// how to access the static variable in interface == class variable
		// className.staticVariable;
		
		System.out.println(InterfaceOne.INTVAR);
		System.out.println(InterfaceOne.subtract(5, 2));
		
		
	}

}
