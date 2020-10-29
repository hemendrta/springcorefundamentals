package com.springcore.referenceinjection;

public class Student {

	private String studentId;
	private User user;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentId, User user) {
		super();
		this.studentId = studentId;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", user=" + user + "]";
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
