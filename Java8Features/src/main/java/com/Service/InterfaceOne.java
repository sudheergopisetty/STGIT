package com.Service;

public interface InterfaceOne {
	
	public static final int INTVAR = 100;
	public abstract void functionOne();       // method declaration
	
	// default method java 8 for give extra instructions
	public default int add(int num1, int num2) {
		return num1 + num2;
	}
		
	public static int subtract (int num1, int num2) {
		return num1 - num2;
	}

}
