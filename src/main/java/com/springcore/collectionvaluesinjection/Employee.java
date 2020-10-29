package com.springcore.collectionvaluesinjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String employeeName;
	private List<String> employeeDepartment;
	private Set<String> employeeContact;
	private Map<String, String> assignedManager;

	public Employee(String employeeName, List<String> employeeDepartment, Set<String> employeeContact,
			Map<String, String> assignedManager) {
		super();
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeContact = employeeContact;
		this.assignedManager = assignedManager;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<String> getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(List<String> employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public Set<String> getEmployeeContact() {
		return employeeContact;
	}

	public void setEmployeeContact(Set<String> employeeContact) {
		this.employeeContact = employeeContact;
	}

	public Map<String, String> getAssignedManager() {
		return assignedManager;
	}

	public void setAssignedManager(Map<String, String> assignedManager) {
		this.assignedManager = assignedManager;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeDepartment=" + employeeDepartment
				+ ", employeeContact=" + employeeContact + ", assignedManager=" + assignedManager + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
