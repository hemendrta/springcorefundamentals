package com.springcore.stereotypeannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
/*@Component("emp")*/
public class Employee {

	@Value("Hemendra Singh Chouhan")
	private String employeeName;
	
	@Value("Information Technology")
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

}
