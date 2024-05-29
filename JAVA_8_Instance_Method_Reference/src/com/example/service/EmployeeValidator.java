package com.example.service;

import com.example.exists.Employee;

@FunctionalInterface
public interface EmployeeValidator {

	Boolean isValid(Employee employee);
}
