package com.example.model;

public class Student implements Comparable<Student>{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(markScored);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rollNumber;
		result = prime * result + ((studentnmae == null) ? 0 : studentnmae.hashCode());
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
		Student other = (Student) obj;
		if (Double.doubleToLongBits(markScored) != Double.doubleToLongBits(other.markScored))
			return false;
		if (rollNumber != other.rollNumber)
			return false;
		if (studentnmae == null) {
			if (other.studentnmae != null)
				return false;
		} else if (!studentnmae.equals(other.studentnmae))
			return false;
		return true;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentnmae() {
		return studentnmae;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentnmae=" + studentnmae + ", markScored=" + markScored
				+ "]";
	}
	public void setStudentnmae(String studentnmae) {
		this.studentnmae = studentnmae;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	public Student(int rollNumber, String studentnmae, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.studentnmae = studentnmae;
		this.markScored = markScored;
	}
	private int rollNumber; // it should be always private
	private String studentnmae;
	private double markScored;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Student obj) {
		
		if(obj.markScored<this.markScored) return 1;
		if(obj.markScored>this.markScored) return -1;
		return 0;


		
	}

}
