package com.example.service.impl;

import com.example.service.InterfaceOne;

public class ClassOne implements InterfaceOne {

	@Override
	public void printNames() {
		
		// logic
		//accessing default method from class own method
		defaultMethodOne();
		System.out.println("Printing Names");

	}

	@Override
	public String getNames() {
		// logic

		System.out.println("Get Names ");
		return "getNames";
	}

	@Override
	public void defaultMethodOne() {
		 System.out.println("defaultMethodOne Override ...");
	}

	
}
