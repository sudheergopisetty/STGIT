package com.main;

import com.service.MyInterface;

public class InstanceMethodMain {
	
	public void myFunction() {
		System.out.println("Welcome to method reference");
	}

	public static void main(String[] args) {
		// 
		
		MyInterface myInterface = () ->{System.out.println("Welcome to lambda");};
			myInterface.display();
			InstanceMethodMain instanceMethodMain = new InstanceMethodMain();
			MyInterface myInterface2 = instanceMethodMain :: myFunction;
			myInterface2.display();
	}

	
}

