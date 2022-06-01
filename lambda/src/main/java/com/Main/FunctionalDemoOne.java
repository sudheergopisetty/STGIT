package com.Main;

import com.Service.FunctionalInterfaceOne;
public class FunctionalDemoOne {

	public static void main(String[] args) {
		FunctionalInterfaceOne  functionalInterfaceOne = () -> System.out.println("FI without arguments");
		functionalInterfaceOne.Display();
		functionalInterfaceOne.defaultMethod1();
		functionalInterfaceOne.defaultMethod2();
		FunctionalInterfaceOne.staticMethod();
	}

}
