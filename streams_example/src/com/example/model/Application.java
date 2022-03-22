package com.example.model;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Student> studList = new ArrayList(); //interface
		
		Student ram = new Student(101,"Abdul",77);
		Student dravid = new Student(102,"dravid",55); // student object
		Student bravo = new Student(103,"bravo",66);
		Student raina = new Student(104,"raina",88);
		Student jaddu = new Student(105,"jaddu",99);
		
		String rakesh=new String("Rakesh"); // string object
		
		studList.add(ram);//0
		studList.add(dravid);//1
		studList.add(bravo);//2
		studList.add(raina);//3
		studList.add(jaddu);//4
		
		//cannot add other than student object to studlist since its a type safe collection => its 
		//collection of only student
		//studList.add(rakesh);
		
		//System.out.println(studList.get(3));
		
		for(Student eachStudent:studList) {
			System.out.println(eachStudent);
		}
		
		Object[] list =studList.toArray();
		
		
		//DownCasting object [] to Student []
		//toArray() method return type is object[]
		//but we require a Student[] array ,we doing downcasting
		for(Object obj:list) {
			
			Student stud=(Student)obj;
			System.out.println(stud.getStudentnmae());
		}
		
		
		Student[] studentList= {
				new Student(210,"abdul",78),
				new Student(213,"rahuman",89)
		};
		
		List<Student> listFromArray = Arrays.asList(studentList);
		
		System.out.println(listFromArray);
		
	}
	
	}
	
	


