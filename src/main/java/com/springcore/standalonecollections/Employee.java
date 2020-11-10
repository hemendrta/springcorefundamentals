package com.springcore.standalonecollections;

import java.util.List;
import java.util.Map;

public class Employee {

	private List<String> employeeDepartments;
	private Map<Integer, String> employeeInfo;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(List<String> employeeDepartments, Map<Integer, String> employeeInfo) {
		super();
		this.employeeDepartments = employeeDepartments;
		this.employeeInfo = employeeInfo;
	}

	@Override
	public String toString() {
		return "Employee [employeeDepartments=" + employeeDepartments + ", employeeInfo=" + employeeInfo + "]";
	}

	public List<String> getEmployeeDepartments() {
		return employeeDepartments;
	}

	public void setEmployeeDepartments(List<String> employeeDepartments) {
		this.employeeDepartments = employeeDepartments;
	}

	public Map<Integer, String> getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(Map<Integer, String> employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

}
