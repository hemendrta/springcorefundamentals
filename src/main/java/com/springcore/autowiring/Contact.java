package com.springcore.autowiring;

public class Contact {

	private String contactType;
	private long contactNumber;
	private String contactEmail;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(String contactType, long contactNumber, String contactEmail) {
		super();
		this.contactType = contactType;
		this.contactNumber = contactNumber;
		this.contactEmail = contactEmail;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	@Override
	public String toString() {
		return "Contact [contactType=" + contactType + ", contactNumber=" + contactNumber + ", contactEmail="
				+ contactEmail + "]";
	}

}
