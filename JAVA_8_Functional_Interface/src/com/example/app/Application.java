package com.example.app;

import com.example.service.Calculate;
import com.example.service.impl.Camel;

public class Application {

	public static void main(String[] args) {

		// Interface can refer impl. class Instance
		Calculate calc = new Camel();
		calc.printName();
		
		
		//Lambda Expression Implemetion
		Calculate calcTwo=()->{
			System.out.println("Using Lambda Expression");
			System.out.println("This is Camel Company calc");
		};
		
		Calculate calcThree=()->{
			System.out.println("Using Lambda Expression");
			System.out.println("This is Camel two Company calc");
		};
		
		calcTwo.printName();
		calcThree.printName();
	}
}
