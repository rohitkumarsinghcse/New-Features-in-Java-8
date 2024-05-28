package com.example.app;

import com.example.service.InterfaceOne;
import com.example.service.impl.ClassOne;

public class Application {

	public static void main(String[] args) {

		ClassOne one = new ClassOne();

		one.printNames();
		// accessing static methods
		InterfaceOne.staticMethodOne();
		InterfaceOne.staticMethodTwo();
		
		

	}
}
