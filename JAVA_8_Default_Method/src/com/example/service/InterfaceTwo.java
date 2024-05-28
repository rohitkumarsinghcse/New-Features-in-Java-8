package com.example.service;

public interface InterfaceTwo {
	
	default void defaultMethodThree() {
		System.out.println("defaultMethodThree");
	}
	
	default String defaultMethodFour() {
		System.out.println("defaultMethodFour");
		return "defaultMethodFour";
	}
	
	default void defaultMethod() {
		System.out.println("Default Method");
	}

}
