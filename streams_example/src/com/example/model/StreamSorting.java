package com.example.model;

import java.util.Comparator;
import java.util.List;

public class StreamSorting {

	public static void main(String[] args) {

		List<Student> studList = StudentUtil.getStudents();
		
		Comparator<Student> nameComparator = Comparator.comparing(Student::getStudentnmae);
		
		Comparator<Student> markComparator = Comparator.comparing(Student::getMarkScored);

		System.out.println("Sort  by name");
		studList.stream().sorted(Comparator.comparing(Student::getRollNumber))
							.forEach(System.out::println);
		
		System.out.println("Sort  by mark");
		studList.stream().sorted(Comparator.comparing(Student::getStudentnmae))
		.forEach(System.out::println);

	}

}
