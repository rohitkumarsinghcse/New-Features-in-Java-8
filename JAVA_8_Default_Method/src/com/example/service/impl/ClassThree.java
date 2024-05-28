 package com.example.service.impl;

import com.example.service.InterfaceOne;
import com.example.service.InterfaceTwo;

public class ClassThree implements InterfaceOne, InterfaceTwo {

	@Override
	public void printNames() {
		System.out.println("Print Names");
	}

	@Override
	public String getNames() {
		System.out.println("GetNames");
		return "getNames";
	}

	@Override
	public void defaultMethod() {
		System.out.println("Override Default Method ..");
		InterfaceOne.super.defaultMethod();
        InterfaceTwo.super.defaultMethod();
	}

}
