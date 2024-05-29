package com.example.app;

import com.example.exists.Employee;
import com.example.service.EmployeeValidator;

public class MainApplication {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(0);
		employee.setName("Rohit");
		employee.setGender("Male");
		employee.setSalary(7500000.00);

		EmployeeValidator validator = employee::validateEmployeeDetails;
	
	
		Boolean valid = validator.isValid(employee);
		System.out.println(valid);
	}
}
