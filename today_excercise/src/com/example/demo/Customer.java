package com.example.demo;

public class Customer {
	
	private double customerId;
	private String customerName;
	public double getCustomerId() {
		return customerId;
	}
	public void setCustomerId(double customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	
	public Customer(double customerId, String customerName, int phoneNumber, String email)throws IvalidEmailException {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		
		if(email.contains("@") &&email.contains(".com") ||email.contains(".in")||email.contains(".org")){
			this.email=email;
	}else {
			throw new IvalidEmailException("Ivalid Email");
	}
	}
	private int phoneNumber;
	private String email;
	public Customer() {
		super();
	}
	public void setEmail(String email) {
		
		if(email.contains("@") &&email.contains(".com") ||email.contains(".in")||email.contains(".org")){
			this.email=email;
	}else {
		try {
			throw new IvalidEmailException("Ivalid Email");
		} catch (IvalidEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}}


