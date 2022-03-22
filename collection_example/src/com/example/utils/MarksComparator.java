package com.example.utils;

import java.util.Comparator;

import com.example.model.Student;

public class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getMarkScored()<o2.getMarkScored()) return 1;
		if(o1.getMarkScored()>o2.getMarkScored()) return -1; //through setter getter we access it
		return 0;
	}

}
