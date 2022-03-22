package com.example.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class UsingStreams {
	
	public static void printByStudentCondition(Collection<Student> studList,Predicate<Student> condition) {
		
		studList.stream().filter(condition)
		.forEach(System.out::println);
		
	}
	
	public static List<Student> getStudentScoredLt90(Collection<Student> studList,Predicate<Student> condition){
		
		return studList.stream().filter(condition)
		.collect(toList());
		
		
	}
	
	public static void main(String[] args) {
	
	List<Student> studList = StudentUtil.getStudents();
	
		Predicate<Student> grtThan90 =student -> student.getMarkScored()>90;
		System.out.println("Student who have scored more than 90");
		printByStudentCondition(studList,grtThan90);
		
		System.out.println("less than 90");
		
		Predicate<Student> lessThan90 =student -> student.getMarkScored()<90;
		
		List<Student> listMarkLt90 = getStudentScoredLt90(studList,lessThan90);
	
		System.out.println(listMarkLt90);
	

}
}
