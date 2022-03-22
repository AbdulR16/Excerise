package com.excercise.day2;

public class Address {
	
	private int doorNumber;
	private String location;
	private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int doorNumber, String location, int pincode) {
		super();
		this.doorNumber = doorNumber;
		this.location = location;
		this.pincode = pincode;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
	