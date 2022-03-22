package com.example;

public class Country {
	
	private String country;
	private String palce;
	private long population;
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String country, String palce, long population) {
		super();
		this.country = country;
		this.palce = palce;
		this.population = population;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPalce() {
		return palce;
	}
	public void setPalce(String palce) {
		this.palce = palce;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
}	