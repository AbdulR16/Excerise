package com.training1;

public class Hotel {
	
	private String hotelLocation;
	private boolean isOpen;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelLocation, boolean hotelopen) {
		super();
		this.hotelLocation = hotelLocation;
		this.isOpen = hotelopen;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	public boolean isHotelopen() {
		return isOpen;
	}
	public void setHotelopen(boolean hotelopen) {
		this.isOpen = hotelopen;
	}
	

}
