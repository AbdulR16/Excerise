package com.example.model;

import java.sql.Date;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String emailAddress;
	private long phoneNumber;
	private Date birthday;
	private Date weddingAnniversary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String firstName, String emailAddress) {
		super();
		this.firstName = firstName;
		this.emailAddress = emailAddress;
	}

	public Employee(int id, String firstName, String lastName, String address, String emailAddress, long phoneNumber,
			Date birthday, Date weddingAnniversary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.weddingAnniversary = weddingAnniversary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getWeddingAnniversary() {
		return weddingAnniversary;
	}
	public void setWeddingAnniversary(Date weddingAnniversary) {
		this.weddingAnniversary = weddingAnniversary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", birthday=" + birthday
				+ ", weddingAnniversary=" + weddingAnniversary + "]";
	}

}
