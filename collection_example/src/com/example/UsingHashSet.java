package com.example;

import java.util.*;

import com.example.model.Student;

public class UsingHashSet {
	
public static void print(Collection<Student> objects){
		
		for(Student eachStudent:objects) {
			System.out.println(eachStudent);
		}
	}


	public static void main(String[] args) {
		
		Student ram = new Student(101,"Abdul",77);
		Student dravid = new Student(102,"dravid",55); // student object
		Student bravo = new Student(103,"bravo",66);
		Student bravoSenior = new Student(103,"bravo",66);
		
		
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(bravo);
		hashSet.add(dravid);
		hashSet.add(ram);
		boolean added = hashSet.add(bravoSenior);
		
		System.out.println(added);
		
		print(hashSet);
	}

}
