package com.example.service;

import com.example.exists.Student;

@FunctionalInterface
public interface StudentDetails {

	Student getStudentInstance(Integer id,String name);
}
