package com.example.excercise;

public class Patient {
	private int patitId;
	private String patientName;
	private String address;
	private int doctorRef;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patitId, String patientName, String address, int doctorRef) {
		super();
		this.patitId = patitId;
		this.patientName = patientName;
		this.address = address;
		this.doctorRef = doctorRef;
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
	public int getDoctorRef() {
		return doctorRef;
	}
	public void setDoctorRef(int doctorRef) {
		this.doctorRef = doctorRef;
	}
	@Override
	public String toString() {
		return "Patient [patitId=" + patitId + ", patientName=" + patientName + ", address=" + address + ", doctorRef="
				+ doctorRef + "]";
	}
}	