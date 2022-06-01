package com.main;

import com.model.Calculatorinput;

public class Calculatorprint {

	public static void main(String[] args) {
		Calculatorinput calculatorinput = new Calculatorinput();
		int d = calculatorinput.sum(10 , 20);
		System.out.println(d);
		int a = calculatorinput.sub(10 , 20);
		System.out.println(a);
		int b = calculatorinput.mul(10 , 20);
		System.out.println(b);
		int c = calculatorinput.div(10 , 20);
		System.out.println(c);
	}

}
