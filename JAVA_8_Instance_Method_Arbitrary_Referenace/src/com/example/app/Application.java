package com.example.app;

import java.util.Arrays;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {
		
		Integer[] intArray={1,2,3,4,6,7,5};
		
		//Arrays.sort(intArray,Collections.reverseOrder());
		//Arrays.sort(intArray,Integer::compareTo);
		Arrays.sort(intArray,(i1,i2)->i1.compareTo(i2));
		
		for(Integer data : intArray) {
			System.out.println(data);
		}
		
 	}
}
