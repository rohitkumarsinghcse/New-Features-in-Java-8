package com.example.app;

import com.example.service.ConvertToUpperCase;

public class Application {

	public static void main(String[] args) {
		
		// Lambda Expression
		ConvertToUpperCase upperCase=(value)-> value.toUpperCase();
		
		String toUpperCase = upperCase.convertToUpperCase("rohit");
		
		System.out.println(toUpperCase);
		
		
		//Method References
		// Re-Using/executing a pre define method from String class
		//assigning that method reference of Class
		ConvertToUpperCase upperCaseTwo = String ::toUpperCase;
		
		String string = upperCaseTwo.convertToUpperCase("singh");
		System.out.println(string);
		
		/*
		 *  Class/InstanceReference :: methodName;
		 */
	}
}
