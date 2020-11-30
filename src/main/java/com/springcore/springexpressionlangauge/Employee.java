package com.springcore.springexpressionlangauge;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("Hemendra Singh Chouhan")
	private String employeeName;
	
	@Value("#{20+12}") 
	private int age;

	public Employee() {
		super();

	}

	public Employee(String employeeName, int age) {
		super();
		this.employeeName = employeeName;
		this.age = age;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", age=" + age + "]";
	}

}
