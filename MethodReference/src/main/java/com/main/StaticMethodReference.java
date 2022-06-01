package com.main;

import java.util.function.Function;

import com.service.StaticClass;
import com.service.StaticInterface;

public class StaticMethodReference {

	public static void main(String[] args) {
		// interface --=--->
		
		StaticInterface staticInterface = StaticClass :: staticFunction;
		Function<String, String> fun = StaticClass :: staticFunction;
		String val = staticInterface.sayHello("sleepy");
		String val2 = fun.sayHello("sleepy");
		System.out.println(val);
		System.out.println(val2);

	}

}
