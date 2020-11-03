package com.springcore.beanlifecycle;

import java.util.ArrayList;
import java.util.stream.Collectors;

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

	/*
	 * Declaration of the init and destory methods and referencing them in the xml
	 * file, it is not mandatory to have the methods name same as init and destroy
	 * we can change the methods names to any which we want. Example of same in the
	 * Person class is displayed.
	 */

	public void init() {

		System.out.println("Inside the init method!!!");

	}

	public void destroy() {

		System.out.println("Inside the destroy method!!!");

	}

}
