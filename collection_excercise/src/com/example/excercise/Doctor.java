package com.example.excercise;

import java.util.*;

public class Doctor {
	
	private int DoctorId;
	private String DoctorName;
	private String specialization;
	private String location;
	
	Set <Patient> patitList;
	Map<String,StaffMembers>StaffDetails;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctorId, String doctorName, String specialization, String location, Set<Patient> patitList,
			Map<String, StaffMembers> staffDetails) {
		super();
		this.DoctorId = doctorId;
		this.DoctorName = doctorName;
		this.specialization = specialization;
		this.location = location;
		this.patitList = patitList;
		StaffDetails = staffDetails;
	}
	public int getDoctorId() {
		return DoctorId;
	}
	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
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
	public Set<Patient> getPatitList() {
		return patitList;
	}
	public void setPatitList(Set<Patient> patitList) {
		this.patitList = patitList;
	}
	public Map<String, StaffMembers> getStaffDetails() {
		return StaffDetails;
	}
	public void setStaffDetails(Map<String, StaffMembers> staffDetails) {
		StaffDetails = staffDetails;
	}
	@Override
	public String toString() {
		return "Doctor [DoctorId=" + DoctorId + ", DoctorName=" + DoctorName + ", specialization=" + specialization
				+ ", location=" + location + ", patitList=" + patitList + ", StaffDetails=" + StaffDetails + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DoctorId;
		result = prime * result + ((DoctorName == null) ? 0 : DoctorName.hashCode());
		result = prime * result + ((StaffDetails == null) ? 0 : StaffDetails.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((patitList == null) ? 0 : patitList.hashCode());
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (DoctorId != other.DoctorId)
			return false;
		if (DoctorName == null) {
			if (other.DoctorName != null)
				return false;
		} else if (!DoctorName.equals(other.DoctorName))
			return false;
		if (StaffDetails == null) {
			if (other.StaffDetails != null)
				return false;
		} else if (!StaffDetails.equals(other.StaffDetails))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (patitList == null) {
			if (other.patitList != null)
				return false;
		} else if (!patitList.equals(other.patitList))
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		return true;
	}
	
	
}