package com.example.excercise;

public class StaffMembers {

	private int staffId;
	private String staffName;
	private String staffRole;
	public StaffMembers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaffMembers(int staffId, String staffName, String staffRole) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffRole = staffRole;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffRole() {
		return staffRole;
	}
	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}
	@Override
	public String toString() {
		return "StaffMembers [staffId=" + staffId + ", staffName=" + staffName + ", staffRole=" + staffRole + "]";
	}
}
