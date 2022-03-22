package com.exanple.model;

import java.util.*;

public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private String specialization;
	private String location;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctorId, String doctorName, String specialization, String location) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.location = location;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return  doctorId + ","+ doctorName +","+specialization+","+location+",";
	}
}	