package com.example.app;

import com.example.exists.Employee;
import com.example.service.EmployeeValidation;

public class MainApplication {

	public static void main(String[] args) {

		// Use method reference to refer to the validateEmployeeDetails method
		EmployeeValidation validation = Employee::validateEmployeeDetails;

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("John Doe");
		employee.setGender("Male");
		employee.setSalary(50000.0);

		// Validate the employee
		boolean isValid = validation.isValidEmployee(employee);

		// Print the result
		System.out.println("Is the employee valid? " + isValid);
		
		
		Employee employeeOne = new Employee();
		employee.setId(0);
		employee.setName("John Doe");
		employee.setGender("Male");
		employee.setSalary(50000.0);
		
		boolean isValidOne = validation.isValidEmployee(employee);

		// Print the result
		System.out.println("Is the employee valid? " + isValidOne);
	}
}
