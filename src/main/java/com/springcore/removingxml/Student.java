package com.springcore.removingxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Hemendra Singh")
	private String name;
	
	@Value("Indore")
	private String city;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	public void study(){
		
		System.out.println("Student is Studying....");
		
	}

}
