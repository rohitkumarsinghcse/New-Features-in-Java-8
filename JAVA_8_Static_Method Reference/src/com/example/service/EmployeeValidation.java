package com.example.service;

import com.example.exists.Employee;

@FunctionalInterface
public interface EmployeeValidation {

	Boolean isValidEmployee(Employee employee);
}
