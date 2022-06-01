package com.Main;

import com.Model.Calculator;
import com.Model.MyCalculator;
public class CalApp {

	public static void main(String[] args) {
		// abstract className var = new inheritedClass
		
		Calculator calculator= new MyCalculator();
		
		
		int val = calculator.add(2, 3);
		System.out.println("sum of two"+val);
		
		int rel = calculator.sub(5, 2);
		System.out.println("sub of two"+rel);
		
	}

}
