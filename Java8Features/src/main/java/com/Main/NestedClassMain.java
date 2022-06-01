package com.Main;

import com.Service.OuterClass;
import com.Service.OuterClass.InnerClass;


public class NestedClassMain {

	public static void main(String[] args) {
		
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerVariable = outerClass.new InnerClass();

	}

}
