package com.Service;

@FunctionalInterface
public interface FunctionalInterfaceOne {
	
	public abstract void Display();
public default void defaultMethod1() {
	System.out.println("DEFAULT 1");
}

public default void defaultMethod2() {
	System.out.println("DEFAULT 2");
}

public static void staticMethod() {
	System.out.println("Static 1");
}
}
