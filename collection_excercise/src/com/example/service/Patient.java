package com.example.service;

public class Patient {
	private int patitId;
	private String patientName;
	private String address;
	private String email;
	public Patient(int patitId, String patientName, String address, int i) {
		super();
		this.patitId = patitId;
		this.patientName = patientName;
		this.address = address;
		this.email = i;
	}
	public int getPatitId() {
		return patitId;
	}
	public void setPatitId(int patitId) {
		this.patitId = patitId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Patient [patitId=" + patitId + ", patientName=" + patientName + ", address=" + address + ", email="
				+ email + "]";
	}

}

//(id,parientName,address,email)