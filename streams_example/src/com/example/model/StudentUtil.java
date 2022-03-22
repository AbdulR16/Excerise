package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
	
	public static List<Student> getStudents(){
		
		Student ram = new Student(101,"Abdul",77);
		Student dravid = new Student(102,"dravid",55); // student object
		Student bravo = new Student(103,"bravo",66);
		Student raina = new Student(104,"raina",91);
		Student jaddu = new Student(105,"jaddu",99);
		//Student jadduRavi = new Student(105,"jaddu",99);
		
		ArrayList <Student> studList = new ArrayList<Student>();
		
		
		studList.add(ram);//0
		studList.add(dravid);//1
		studList.add(bravo);//2
		studList.add(raina);//3
		studList.add(jaddu);//4
		//studList.add(jadduRavi);//4 
		
		return studList;
	}

}
