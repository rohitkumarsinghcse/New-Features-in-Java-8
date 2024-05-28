package com.example.service;

public interface InterfaceOne {

	// Abstract methods / Non-Implemented methods
	void printNames();
	String getNames();

	
	default void defaultMethodOne() {
		//logic
		System.out.println("Inside defaultMethodOne ..");
	}

	default String defaultMethodTwo() {
		
		//logic
		System.out.println("Inside defaultMethodTwo ..");
		return "defaultMethodTwo";
	}
	
	default void defaultMethod() {
		System.out.println("Default Method");
	}

}
