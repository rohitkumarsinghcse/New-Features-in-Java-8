package com.example.service;
@FunctionalInterface
public interface CalcOperation {

	double operation(int a,int b);
	
	
	default void printInfo() {
		System.out.println("This is Default Data of Method");
	}
	
	static void typeOfOperation() {
		System.out.println("This is Static : Airthmetic Operation");
	}
}
