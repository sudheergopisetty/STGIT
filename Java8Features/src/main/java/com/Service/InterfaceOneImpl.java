package com.Service;

public class InterfaceOneImpl implements InterfaceOne, InterfaceTwo{

	@Override
	public void functionOne() {
		System.out.println("Function one called");
		
	}

	@Override
	public int add(int num1, int num2) {

		return num1 + num2 + 300;
	}
	
	
	
	

	

	
	// @override  dynamic polymorphism the method in parent class is override in child class

	

}
