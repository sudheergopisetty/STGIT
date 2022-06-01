package com.service;

import com.exception.ManualException;

public interface calService {

	public abstract int addition(int num1, int num2);
	public abstract int subtraction(int num1, int num2);
	public abstract int multiplication(int num1, int num2);
	public abstract int division(int num1, int num2) throws ManualException;
}
