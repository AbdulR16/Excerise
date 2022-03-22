package com.example;

import java.util.*;

//import java.util.MapEntry;

import com.example.model.Student;

public class UsingHashMap {

	public static void main(String[] args) {
		
		Student ram = new Student(101,"Abdul",77);
		Student dravid = new Student(102,"dravid",55); // student object
		Student bravo = new Student(103,"bravo",66);
		Student bravoSenior = new Student(103,"bravoSenior",66);
		
		HashMap<Integer,Student> map = new HashMap<Integer,Student>(); // wrapper class
		
		//Autoboxing feature of java allow primitive 989 to be converted to object Integer
		
		System.out.println(map.put(989, ram));
		System.out.println(map.put(990, dravid)); //autoboxing
		System.out.println(map.put(991, bravo));
		System.out.println(map.put(991, bravo));
		
		//it will return the new entry and not the old one
		//it will replace the old entry with new one
		System.out.println("From Map"+ map.get(991));
		
		Set<Map.Entry<Integer, Student>> setView= map.entrySet();
		
		Iterator<Map.Entry<Integer, Student>> itr	=setView.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry<Integer, Student> eachElement = itr.next();			
			System.out.println("key:="+eachElement.getKey());
			System.out.println("value:="+eachElement.getValue());
			
			Set<Map.Entry<Integer,Student>> studSet = map.entrySet();
			
			for(Map.Entry<Integer,Student> eachElement1: studSet) {
				
				System.out.println("key:="+eachElement1.getKey());
				System.out.println("value:="+eachElement1.getValue());
				
				
			}
		}
	}

}
