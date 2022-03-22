package com.example.model;

import java.util.List;

public class UsingStreamDistinct {

	public static void main(String[] args) {

		List<Student> studList = StudentUtil.getStudents();
		
		
		
		studList.stream().distinct().forEach(System.out::println); // same name will not come in distict it is unique
		
		
	}

}
