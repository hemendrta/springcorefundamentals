package com.springcore.constructorinjection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class Employee {

	private String employeeName;
	private String employeeCity;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, String employeeCity) {
		super();
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeCity=" + employeeCity + "]";
	}

}
