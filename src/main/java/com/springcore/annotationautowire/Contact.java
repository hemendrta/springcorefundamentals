package com.springcore.annotationautowire;

public class Contact {

	private String country;
	private String state;
	private String city;
	private String email;
	private long mobile;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(String country, String state, String city, String email, long mobile) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.email = email;
		this.mobile = mobile;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Contact [country=" + country + ", state=" + state + ", city=" + city + ", email=" + email + ", mobile="
				+ mobile + "]";
	}

}
