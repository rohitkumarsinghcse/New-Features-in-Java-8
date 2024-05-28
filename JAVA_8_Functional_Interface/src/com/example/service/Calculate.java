package com.example.service;

@FunctionalInterface
public interface Calculate {

	// 1: abstract method
	void printName();

	// N : default methods
	default void defaultMethodOne() {
		System.out.println("This is default methodOne");
	}
	
	default void defaultMethodTwo() {
		System.out.println("This is default methodTwo");
	}
	
	// N : static methods
	static void staticMethodOne() {
		System.out.println("This is static methodOne");
	}
	
	static void staticMethodTwo() {
		System.out.println("This is static methodTwo");
	}

}
