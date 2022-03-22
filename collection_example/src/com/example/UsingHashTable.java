package com.example;

import java.util.Hashtable;

import com.example.model.Student;

public class UsingHashTable {

	public static void main(String[] args) {

		Student ram = new Student(101,"Abdul",77);
		Student dravid = new Student(102,"dravid",55); // student object
		Student bravo = new Student(103,"bravo",66);
		
		Hashtable<Integer,Student> map = new Hashtable<Integer,Student>(); // wrapper class
		
		map.put(1, null);
		
		
		if(map.get(1)==null){
			
			map.put(1, ram);
		}
		
		System.out.println(map);
	}

}
