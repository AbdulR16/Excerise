package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.excercise.Doctor;
import com.example.model.CrudRepository;

public class Service implements CrudRepository<Doctor> {
	
	private ArrayList<Doctor> docList;
	

	public Service() {
		super();
		docList = new ArrayList();
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public boolean add(Doctor object) {
		return docList.add(object);
				
	}



	@Override
	public List<Doctor> findAll() {
		return this.docList;
	}



	@Override
	public Doctor update(Doctor object, String revisedDetails) {
		
		int ideNo=docList.indexOf(object);
		
		Doctor foundDoctor=docList.get(ideNo);
		
		foundDoctor.setDoctorName(revisedDetails);
		
		return foundDoctor;
	}



	@Override
	public boolean remove(Doctor object) {
		// TODO Auto-generated method stub
		return docList.remove(object);
	}



	@Override
	public String toString() {
		return "Service [docList=" + docList + ", findAll()=" + findAll() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
