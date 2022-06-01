package com.service;

import com.exception.ManualException;

public class calServiceimpl implements calService {

	@Override
	public int addition(int num1, int num2) {
		
		return num1 + num2;
	}

	@Override
	public int subtraction(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int multiplication(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int division(int num1, int num2) throws ManualException{
		int c = 0;
		
		try {
			
			if(num2 == 0) {
				throw new ManualException("please enter number > 0 ");
			}
			c = num1 / num2 ;
		} catch (java.lang.ArithmeticException e) {
			System.err.println("please enter number from 1 " + e.getMessage());
		} catch(Exception y) {
			System.out.println("enter 2");
		}
		return c;
	}

	
}
