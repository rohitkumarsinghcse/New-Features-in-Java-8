package com.example.app;

import com.example.service.CalcOperation;

public class MainApplication {

	public static void main(String[] args) {

		CalcOperation addition = (int x, int y) -> {
			int sum = x + y;
			System.out.println("Addition : " + sum);
			return sum;
		};
		
		
		
		double operation = addition.operation(10,20);
		System.out.println(operation);
		
		
		CalcOperation subtraction=(p,q)->{
			return p-q;
		};
		
		double subtrct = subtraction.operation(50, 10);
		System.out.println(subtrct);
		
		
		System.out.println(addition);
		System.out.println(subtraction);
		
		
		CalcOperation multiplication=(r,s)-> r*s;
		
		double operation2 = multiplication.operation(10, 10);
		System.out.println(operation2);
		
		multiplication.printInfo();
		
		CalcOperation.typeOfOperation();
	}
}
