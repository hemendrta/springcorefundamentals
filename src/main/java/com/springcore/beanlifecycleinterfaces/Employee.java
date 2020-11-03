package com.springcore.beanlifecycleinterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	private String employeeName;
	private String employeeCity;

	public Employee(String employeeName, String employeeCity) {
		super();
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeCity=" + employeeCity + "]";
	}

	/* Method which we get from the interface InitializingBean */

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Inside the init method!!!");

	}

	/* Method which we get from the interface DisposableBean */

	@Override
	public void destroy() throws Exception {

		System.out.println("Inside the destroy method!!!");

	}

}
