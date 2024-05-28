package com.example.app;

import com.example.service.impl.ClassOne;
import com.example.service.impl.ClassThree;
import com.example.service.impl.ClassTwo;

public class Application {

	
	public static void main(String[] args) {
		
		ClassOne one = new ClassOne();
		
		// accessing default methods
		one.defaultMethodOne();
		one.defaultMethodTwo();
		
		//abstract methods
		one.printNames();
		one.getNames();
		
		
		ClassTwo two = new ClassTwo();
		two.defaultMethodOne();
		two.defaultMethodTwo();
		two.printNames();
		two.getNames();
		
		ClassThree three = new ClassThree();
		three.defaultMethodOne();
		three.defaultMethodTwo();
		three.defaultMethodThree();
		three.defaultMethodFour();
		
		three.defaultMethod();
	}
}
