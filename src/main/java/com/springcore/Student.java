package com.springcore;

public class Student {

	private String studentName;
	private String studentCity;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setter is called");
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		System.out.println("Setter is called");
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + "]";
	}

	public Student(String studentName, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
