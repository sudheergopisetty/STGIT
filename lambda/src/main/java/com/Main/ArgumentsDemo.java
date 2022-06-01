package com.Main;

import com.Service.FunctionalInterfaceWithArgguments;

public class ArgumentsDemo {

	public static void main(String[] args) {
		FunctionalInterfaceWithArgguments functionalInterfaceWithArgguments =  (int a) ->{
		System.out.println("arguements "+a);
		System.out.println("more than one Statement{ } "+a);
		};
		functionalInterfaceWithArgguments.functionWithArguementsAndNoReturnType(23);
	}

}
