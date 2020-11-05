package com.springcore.autowiring;

public class StudentInfo {

	private String studentName;
	private String studentEmail;
	private String studentCity;

	public StudentInfo(String studentName, String studentEmail, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentCity = studentCity;
	}

	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "StudentInfo [studentName=" + studentName + ", studentEmail=" + studentEmail + ", studentCity="
				+ studentCity + "]";
	}

}
