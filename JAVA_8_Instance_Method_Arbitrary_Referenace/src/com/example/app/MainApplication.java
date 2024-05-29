package com.example.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApplication {

	public static void main(String[] args) {
		
		String [] listOfNames= {"Raj","Rohit","Disha","Mohit","Himanshu"};
		
		Arrays.sort(listOfNames,String::compareToIgnoreCase);
		
		Collections.reverse(Arrays.asList(listOfNames));
		System.out.println(Arrays.toString(listOfNames));
		
		
		List<String> asList = Arrays.asList(listOfNames);
		
		asList.sort(String::compareToIgnoreCase);
		
		System.out.println(asList);
	}
}
