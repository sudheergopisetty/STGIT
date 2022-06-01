package com.Main;

import com.Service.FunctionalInterfaceWithAgruementsAndReyturnType;

public class FunctionWithReturnType {

	public static void main(String[] args) {
		
		FunctionalInterfaceWithAgruementsAndReyturnType reyturnType = (String abc) -> {
			return "Welcome " + abc;
		};
		String ans  = reyturnType.sayHello("Launch break !");
		System.out.println(ans);
		}

	}


