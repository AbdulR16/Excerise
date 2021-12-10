package com.training.ifaces;

public class Professor implements Conditional {
	
	private int id;
	private String qualification;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getqualification() {
		return qualification;
	}

	public void setqualification(String qualification) {
		this.qualification = qualification;
	}

	public Professor(int id, String qualification) {
		super();
		this.id = id;
		this.qualification = qualification;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.qualification.equalsIgnoreCase("mca");
	}

}
