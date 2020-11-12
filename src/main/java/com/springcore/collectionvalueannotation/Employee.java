package com.springcore.collectionvalueannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	@Value("Hemendara Singh Chouhan")
	private String employeeName;
	
	@Value("Indore")
	private String employeeCity;
	
	@Value("#{skills}")
	private List<String> employeeSkills;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, String employeeCity, List<String> employeeSkills) {
		super();
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
		this.employeeSkills = employeeSkills;
	}

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

	public List<String> getEmployeeSkills() {
		return employeeSkills;
	}

	public void setEmployeeSkills(List<String> employeeSkills) {
		this.employeeSkills = employeeSkills;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeCity=" + employeeCity + ", employeeSkills="
				+ employeeSkills + "]";
	}

}
