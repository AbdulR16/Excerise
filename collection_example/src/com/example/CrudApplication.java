package com.example;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.example.ifaces.CrudRepository;
import com.example.ifaces.StudentRepository;
import com.example.model.Student;
import com.example.services.StudentService;
import com.example.utils.MarksComparator;
import com.example.utils.StudentNameComparator;

public class CrudApplication   {

	public static void main(String[] args) {
		

		Student ram = new Student(101,"Abdul",77);
		Student dravid = new Student(102,"dravid",55); // student object
		Student bravo = new Student(103,"bravo",66);
		Student raina = new Student(104,"raina",88);
		Student jaddu = new Student(105,"jaddu",99);
		
		StudentRepository repo = new StudentService();
		
		//repo.getTopThreeByMark();
		repo.add(ram);
		repo.add(dravid);
		repo.add(bravo);
		repo.add(raina);
		repo.add(jaddu);
		
		boolean result =repo.remove(jaddu);
		
		if(result) {
			System.out.println("One Element deleted");
		} else {
			throw new RuntimeException("Element Not Found");
			
		}
		
			//repo.updateMark(raina,80);
			
			List<Student> list = repo.findAll();
			
			//Collections.sort(list);
			
			//Collections.sort(list,new StudentNameComparator());
			//Collections.sort(list,new MarksComparator());
			
			List<Student> top3List=repo.getTopThreeByMark();
			System.out.println(top3List);
		
		
		
		Iterator<Student> itr=repo.findAll().iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
