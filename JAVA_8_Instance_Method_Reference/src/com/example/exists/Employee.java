package com.example.exists;

public class Employee {

	private Integer id;
	private String name;
	private String gender;
	private Double salary;

	public Boolean validateEmployeeDetails(Employee employee) {

		if (employee.getId() != 0 && employee.getName() != null)
			return true;

		return false;
	}

	Boolean validSalary() {
		return this.getSalary() > 0 ? true : false;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
