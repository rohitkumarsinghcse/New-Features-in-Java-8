package com.example.service;

public interface InterfaceOne {
	
	void printNames();

	
	static void staticMethodOne() {
		System.out.println("This is staticMethodOne...");
	}
	
	static String staticMethodTwo() {
		System.out.println("This is staticMethodTwo...");
		return "staticMethodTwo";
	}
	
	static void staticMethodTree() {
		System.out.println("This is staticMethodThree...");
	}
}
