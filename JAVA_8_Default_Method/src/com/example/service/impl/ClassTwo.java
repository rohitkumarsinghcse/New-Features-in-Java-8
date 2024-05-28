package com.example.service.impl;

import com.example.service.InterfaceOne;

public class ClassTwo implements InterfaceOne {

	@Override
	public void printNames() {
		System.out.println("In ClassTwo : printNames");

	}

	@Override
	public String getNames() {
		System.out.println("In ClassTwo : getNames");
		return "classTwo";
	}
	
	

}
