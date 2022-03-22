package com.example.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.ifaces.CrudRepository;
import com.example.ifaces.StudentRepository;
import com.example.model.Student;
import com.example.utils.MarksComparator;

public class StudentService implements StudentRepository<Student> {
	
	private ArrayList<Student> studList;

	public StudentService() {
		super();
		studList = new ArrayList();
	}

	@Override
	public boolean add(Student object) {
		return studList.add(object);
	}

	@Override
	public List<Student> findAll() {
		return this.studList; // return all the students
	}

	@Override
	public Student updateMark(Student object, double revisedMark) {
		
		int index = studList.indexOf(object);
		Student foundStudent = studList.get(index);
		foundStudent.setMarkScored(revisedMark);
		return foundStudent;
	}

	@Override
	public boolean remove(Student object) {
		
		 return studList.remove(object);
		
	}

	@Override
	public List<Student> getTopThreeByMark() {
		
		ArrayList<Student> top3=new ArrayList();
		
		Collections.sort(this.studList,new MarksComparator());
		
		for(int idx=0;idx<=2;idx++) {
			top3.add(studList.get(idx));
		}
		return top3;
		
		
		
	}

	@Override
	public double getAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}	
