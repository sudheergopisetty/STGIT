package com.model;

public class Calculatorinput {

	public int sum(int a, int b) {
	 return a + b;
	
	}
	public int sub(int a, int b) {
		return a > b ? a -b:b-a;
		
		}
	public int mul(int a, int b) {
		 return a * b;
		
		}
	public int div(int a, int b) {
		 return a > b ? a /b:b/a;
		
		}
}
