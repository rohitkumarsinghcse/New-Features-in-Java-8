package com.example.service.impl;

import com.example.service.InterfaceOne;
import com.example.service.InterfaceTwo;

public class ClassOne  implements InterfaceOne,InterfaceTwo{

	@Override
	public void printNames() {
		InterfaceOne.staticMethodOne();
		String staticMethodTwo = InterfaceOne.staticMethodTwo();
		System.out.println(staticMethodTwo);
		System.out.println("PrintNames....");
	}
	
	

	
}
