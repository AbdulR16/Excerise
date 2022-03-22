package com.example.model;

import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.*;


public class UsingStreamMap {

	public static void main(String[] args) {
		
		List<Student> studList = StudentUtil.getStudents();
		
		Function<Student,String> mapCondition = (student) -> student.getStudentnmae(); // using Fuction method
		
		List<String> nameList= studList.stream().map(mapCondition).collect(toList());
		
		System.out.println(nameList);
		
		System.out.println("Names of Student Who Scored More than 90");
		
		List<String> nameGrtThan90= studList.stream().filter(e-> e.getMarkScored()>90)
				.map(e-> e.getStudentnmae()).collect(toList());
		
		System.out.println(nameGrtThan90);

	}

}
