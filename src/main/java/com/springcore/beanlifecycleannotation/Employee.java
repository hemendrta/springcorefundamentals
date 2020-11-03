package com.springcore.beanlifecycleannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	private String employeeName;
	private String employeeCity;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	public Employee(String employeeName, String employeeCity) {
		super();
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeCity=" + employeeCity + "]";
	}

	@PostConstruct
	public void start() {

		System.out.println("Init method!!!");

	}
	
	@PreDestroy
	public void end() {

		System.out.println("Destroy method!!!");

	}

}
