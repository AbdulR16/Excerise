package com.training.ifaces;

public class Student implements Conditional {
	
	private int id;
	private double mark;

	
	public Student(int id, double mark) {
		super();
		this.id = id;
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.mark>70;
	}

}
