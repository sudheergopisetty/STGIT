package com.Service;

public interface InterfaceTwo {
	
	public default int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtract (int num1, int num2) {
		return num1 - num2 + 100;
	}

}
