package com.springcore.autowiring;

public class Student {

	private StudentInfo studentInfo;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(StudentInfo studentInfo) {
		super();
		this.studentInfo = studentInfo;
	}

	public StudentInfo getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}

	@Override
	public String toString() {
		return "Student [studentInfo=" + studentInfo + "]";
	}

}
