package com.springcore.referenceinjection;

public class User {

	private String userName;
	private String userCity;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.userName + " : " + this.userCity;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String userCity) {
		super();
		this.userName = userName;
		this.userCity = userCity;
	}

}
