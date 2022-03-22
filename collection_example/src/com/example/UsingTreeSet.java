package com.example;

import java.util.*;

import com.example.model.Student;

public class UsingTreeSet {
	
	public static void print(Collection<Student> objects){
		
		for(Student eachStudent:objects) {
			System.out.println(eachStudent);
		}
	}

	public static void main(String[] args) {
		
		
		Student ram = new Student(101,"Abdul",77);
		Student dravid = new Student(102,"dravid",55); // student object
		Student bravo = new Student(103,"bravo",66);
		
		
		TreeSet<Student> treeSet = new TreeSet<Student>(); // instead of arraylist we use treeset here
		
		treeSet.add(bravo);
		treeSet.add(dravid);
		treeSet.add(ram);
		
		print(treeSet);
		
		
	}

}
