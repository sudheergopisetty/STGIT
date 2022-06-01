package com.main;

import com.exception.ManualException;
import com.service.calServiceimpl;

public class calMain {

	public static void main(String[] args) throws ManualException {
		//interface var = new interface();
		calServiceimpl calServiceimpl = new calServiceimpl();
		int a = 10;
		int b =0;
		int ans = calServiceimpl.addition(a, b);
		//System.out.println("addition of numbers :" + (ans + 100));
		int anssub = calServiceimpl.subtraction(a, b);
		int ansmul = calServiceimpl.multiplication(a, b);
		int ansdiv = calServiceimpl.division(a, b);
		
		System.out.println("The division of two numbers : " +ansdiv);
	}

}
