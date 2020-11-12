package com.springcore.beanscopes;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("Hemendra Singh Chouhan")
	private String employeeName;
	
	@Value("Indore")
	private String employeeCity;
	
	@Value("#{skills}")
	private List<String> skills;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, String employeeCity, List<String> skills) {
		super();
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
		this.skills = skills;
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

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeCity=" + employeeCity + ", skills=" + skills + "]";
	}

}
