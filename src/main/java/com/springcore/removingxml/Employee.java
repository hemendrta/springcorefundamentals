package com.springcore.removingxml;

public class Employee {

	private String employeeName;
	private String employeeDepartment;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, String employeeDepartment) {
		super();
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeDepartment=" + employeeDepartment + "]";
	}

	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Employee is working!!!");
	}

}
