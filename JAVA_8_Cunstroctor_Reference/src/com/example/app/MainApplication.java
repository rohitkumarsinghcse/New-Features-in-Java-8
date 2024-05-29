package com.example.app;

import com.example.exists.Student;
import com.example.service.StudentDetails;

public class MainApplication {

	public static void main(String[] args) {
		
		StudentDetails details=Student::new;
		
		Student student = details.getStudentInstance(101, "Rohit");
		
		System.out.println(student.getId());
		System.out.println(student.getName());
	}
}
